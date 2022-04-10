package za.ac.cput.repository;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import za.ac.cput.entity.EmployeeGender;


import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepository implements IEmployeeGender{
    private static EmployeeGenderRepository repository =null;
    private Set<EmployeeGender> Database;
    private EmployeeGenderRepository(){
        Database= new HashSet<EmployeeGender>();

    }

    public static EmployeeGenderRepository getRepository(){
        if (repository==null) {
            repository = new EmployeeGenderRepository();
        }
        return repository;

    }


    @Override
    public EmployeeGender create(EmployeeGender object) {
        boolean success=Database.add(object);
        if(!success)
            return null;
        return object;
    }

    @Override
    public EmployeeGender read(String id) {
        EmployeeGender employeeGender=Database.stream().
                filter(e ->e.getEmployeeId().equals(id))

                .findAny().orElse(null);
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender id) {
        EmployeeGender current=read(id.getEmployeeId());
        if (current !=null)
        {


            Database.remove(current);

            Database.add(id);
            return id;
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {
        EmployeeGender employeeGender= read(ID);
        if (employeeGender==null)
        {
            return false;
        }
        Database.remove(employeeGender);


        return true;
    }
    @Override
    public Set<EmployeeGender> getAll() {
        return Database;
    }
}
