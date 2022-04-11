package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.EmployeeRole;
import za.ac.cput.entity.Role;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRoleFactoryTest {
    @Test
    public void test(){
        EmployeeRole employeeRole= EmployeeRoleFactory.createEmployeeRole("22858455","2528");
        assertNotNull(employeeRole);
    }

}