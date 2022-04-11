package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeRole;
import za.ac.cput.entity.Role;
import za.ac.cput.factory.EmployeeRoleFactory;
import za.ac.cput.factory.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeRoleRepositoryTest {

    private static EmployeeRoleRepository repository =EmployeeRoleRepository.getRepository();
    private static EmployeeRole employeeRole= EmployeeRoleFactory.createEmployeeRole("20524111","2525");


    @Test
    void a_create() {
        EmployeeRole created= repository.create(employeeRole);
        assertEquals(employeeRole.getEmployeeId(),created.getEmployeeId());
        System.out.println("Create:" + created);

    }


    @Test
    void b_read() {
        EmployeeRole read = repository.read(employeeRole.getEmployeeId());
        assertNotNull(read);
        System.out.println("Read:" +read);



    }

    @Test
    void c_update() {
        EmployeeRole updated=new EmployeeRole.Builder().copy(employeeRole).setRoleId("2145")

                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" +updated);
    }

    @Test
    void e_delete() {
        boolean success=repository.delete(employeeRole.getEmployeeId());
        assertTrue(success);
        System.out.println("Deleted: " +success);

    }


    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());

    }

}