package za.ac.cput.repository;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import za.ac.cput.entity.Gender;

import java.util.HashSet;
import java.util.Set;

public class GenderRepository implements IGender {
    private static GenderRepository repository =null;
    private Set<Gender> Database;
    private GenderRepository(){
        Database= new HashSet<Gender>();

    }

    public static GenderRepository getRepository(){
        if (repository==null) {
            repository = new GenderRepository();
        }
        return repository;

    }

    @Override
    public Gender create(Gender object)
    {
        boolean success=Database.add(object);
        if(!success)
            return null;
        return object;
    }

    @Override
    public Gender read(String Id) {
        Gender employee=Database.stream().
                filter(e ->e.getGenderID().equals(Id))

                .findAny().orElse(null);
        return employee;
    }

    @Override
    public Gender update(Gender id) {
        Gender currentAddressType=read(id.getGenderID());
        if (currentAddressType !=null)
        {


            Database.remove(currentAddressType);

            Database.add(id);
            return id;
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {
        Gender gender= read(ID);
        if (gender==null)
        {
            return false;
        }
        Database.remove(gender);


        return true;
    }

    @Override
    public Set<Gender> getAll() {
        return Database;
    }
}
