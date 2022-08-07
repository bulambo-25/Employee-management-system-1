package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeGenderFactoryTest {

    @Test
    void createEmployeeGender() {

        System.out.println(EmployeeGenderFactory.createEmployeeGender("23243","342562"));
    }
}