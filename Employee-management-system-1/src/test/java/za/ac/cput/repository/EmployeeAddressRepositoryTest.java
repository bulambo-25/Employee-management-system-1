package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeAddress;
import za.ac.cput.factory.EmployeeAddressFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeAddressRepositoryTest {
    private static EmployeeAddressRepository repository= EmployeeAddressRepository.getRepository();
    private static EmployeeAddress employeeAddress= EmployeeAddressFactory.createEmployeeAddress();
    @Test
    void a_create() {
        EmployeeAddress create =repository.create(employeeAddress);
        assertEquals(employeeAddress.getEmployeeID(),create.getEmployeeID());
        System.out.println(create);
    }

    @Test
    void b_read() {
        EmployeeAddress Object =repository.read(employeeAddress.getEmployeeID());
        assertNotNull(employeeAddress);
        System.out.println(employeeAddress);

    }

    @Test
    void c_update() {
        EmployeeAddress updated= new EmployeeAddress.Builder().copy(employeeAddress).setEmployeeTypeID(Helper.generateID()).build();
        assertNotNull(repository.update(updated));
        System.out.println(updated);
    }

    @Test
    void e_delete() {
        boolean delete=repository.delete(employeeAddress.getEmployeeID());
        assertTrue(delete);
        System.out.println(delete);
    }

    @Test
    void d_getAll() {
        System.out.println("all"+repository.getAll());
    }
}