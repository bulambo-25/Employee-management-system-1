package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Role;

import static org.junit.jupiter.api.Assertions.*;

class RoleFactoryTest {
    @Test
    public void test(){
        Role role= RoleFactory.createRole("2515","Helper", "Cleaner");
        assertNotNull(role);
    }


}