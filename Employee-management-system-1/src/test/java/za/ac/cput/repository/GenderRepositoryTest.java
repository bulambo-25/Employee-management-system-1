package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Gender;
import za.ac.cput.factory.GenderFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class GenderRepositoryTest {
    private static GenderRepository repository= GenderRepository.getRepository();
    private static Gender gender= GenderFactory.createGender("Male","a guy");

    @Test
    void a_create() {
        Gender create =repository.create(gender);
        assertEquals(gender.getGenderID(),create.getGenderID());
        System.out.println(create);
    }

    @Test
    void b_read() {
        Gender GenderObject =repository.read(gender.getGenderID());
        assertNotNull(GenderObject);
        System.out.println(GenderObject);
    }

    @Test
    void c_update() {
        Gender update= new Gender.Builder().copy(gender).setGenderType("Female").setDescription("a girl").build();
        assertNotNull(repository.update(update));
        System.out.println(update);
    }

    @Test
    void e_delete() {
        boolean delete=repository.delete(gender.getGenderID());
        assertTrue(delete);
        System.out.println(delete);
    }

    @Test
    void d_getAll() {
        System.out.println("getting all"+repository.getAll());
    }
}