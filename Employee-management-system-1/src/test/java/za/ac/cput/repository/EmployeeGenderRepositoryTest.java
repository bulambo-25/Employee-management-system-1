package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeAddress;
import za.ac.cput.entity.EmployeeGender;
import za.ac.cput.factory.EmployeeAddressFactory;
import za.ac.cput.factory.EmployeeGenderFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeGenderRepositoryTest {
    private static EmployeeGenderRepository repository= EmployeeGenderRepository.getRepository();
    private static EmployeeGender employeeGender= EmployeeGenderFactory.createEmployeeGender();
    @Test
    void a_create() {
        EmployeeGender create =repository.create(employeeGender);
        assertEquals(employeeGender.getEmployeeId(),create.getEmployeeId());
        System.out.println(create);
    }



    @Test
    void b_read() {
        EmployeeGender Object =repository.read(employeeGender.getEmployeeId());
        assertNotNull(employeeGender);
        System.out.println(employeeGender);
    }

    @Test
    void c_update() {
        EmployeeGender updated= new EmployeeGender.Builder().copy(employeeGender).setGenderID(Helper.generateID()).build();
        assertNotNull(repository.update(updated));
        System.out.println(updated);
    }

    @Test
    void e_delete() {
        boolean delete=repository.delete(employeeGender.getEmployeeId());
        assertTrue(delete);
        System.out.println(delete);

    }

    @Test
    void d_getAll() {
        System.out.println("all"+repository.getAll());
    }
}