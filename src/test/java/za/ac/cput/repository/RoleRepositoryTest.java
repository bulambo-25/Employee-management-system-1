package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Role;
import za.ac.cput.factory.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class RoleRepositoryTest {

        private static RoleRepository repository =RoleRepository.getRepository();
        private static Role role= RoleFactory.createRole("2525","Helper","Gardener");


        @Test
    void a_create() {
            Role created= repository.create(role);
            assertEquals(role.getRoleId(),created.getRoleId());
            System.out.println("Create:" + created);

        }


    @Test
    void b_read() {
        Role read = repository.read(role.getRoleId());
        assertNotNull(read);
        System.out.println("Read:" +read);


    }

    @Test
    void c_update() {
        Role updated=new Role.Builder().copy(role).setRoleName("Technician")
                .setRoleDesc("Supervisor")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" +updated);

    }

    @Test
    void e_delete() {
        boolean success=repository.delete(role.getRoleId());
        assertTrue(success);
        System.out.println("Deleted: " +success);

    }

    @Test
    void d_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());

    }
}