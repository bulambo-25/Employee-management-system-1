package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    @Test
    void createEmployeeAddress() {
        System.out.println(EmployeeAddressFactory.createEmployeeAddress());
    }
}