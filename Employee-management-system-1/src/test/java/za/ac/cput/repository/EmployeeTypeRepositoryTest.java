package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeAddress;
import za.ac.cput.entity.EmployeeType;
import za.ac.cput.entity.Gender;
import za.ac.cput.factory.EmployeeAddressFactory;
import za.ac.cput.factory.EmployeeTypeFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeTypeRepositoryTest {
    private static EmployeeTypeRepository repository= EmployeeTypeRepository.getRepository();
    private static EmployeeType employee= EmployeeTypeFactory.createGender("","","","");
    @Test
    void a_create() {
        EmployeeType create =repository.create(employee);
        assertEquals(employee.getAddressType(),create.getAddressType());
        System.out.println(create);
    }

    @Test
    void b_read() {
        EmployeeType Object =repository.read(employee.getStreetName());
        assertNotNull(Object);
        System.out.println(Object);

    }

    @Test
    void c_update() {
        EmployeeType update= new EmployeeType.Builder().copy(employee).setEmployeeType("").setPostalCode("3425").setAreaName("Mamemba").setCity("Paris").build();
        assertNotNull(repository.update(update));
        System.out.println(update);

    }

    @Test
    void e_delete() {
        boolean delete=repository.delete(employee.getAreaName());
        assertTrue(delete);
        System.out.println(delete);
    }

    @Test
    void d_getAll() {
        System.out.println("all"+repository.getAll());
    }
}