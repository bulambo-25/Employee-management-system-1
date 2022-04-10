package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderFactoryTest {

    @Test
    void createGender() {
        System.out.println(GenderFactory.createGender("Male","a man"));
    }
}