package za.ac.cput.repository;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import za.ac.cput.entity.EmployeeType;


import java.util.HashSet;
import java.util.Set;

public class EmployeeTypeRepository implements  IEmployeeTpe{
    private static EmployeeTypeRepository repository =null;
    private Set<EmployeeType> Database;
    private EmployeeTypeRepository(){
        Database= new HashSet<EmployeeType>();

    }

    public static EmployeeTypeRepository getRepository(){
        if (repository==null) {
            repository = new EmployeeTypeRepository();
        }
        return repository;

    }


    @Override
    public EmployeeType create(EmployeeType object) {
        boolean success=Database.add(object);
        if(!success)
            return null;
        return object;
    }

    @Override
    public EmployeeType read(String id) {
        EmployeeType employee=Database.stream().
                filter(e ->e.getAreaName().equals(id))

                .findAny().orElse(null);
        return employee;
    }

    @Override
    public EmployeeType update(EmployeeType id) {
        EmployeeType current=read(id.getStreetName());
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
        EmployeeType employeeType= read(ID);
        if (employeeType==null)
        {
            return false;
        }
        Database.remove(employeeType);


        return true;
    }
    @Override
    public Set<EmployeeType> getAll() {
        return Database;
    }
}
