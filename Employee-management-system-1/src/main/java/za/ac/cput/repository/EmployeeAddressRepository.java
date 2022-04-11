package za.ac.cput.repository;
/*

AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 9 2022

 */
import za.ac.cput.entity.EmployeeAddress;


import java.util.HashSet;
import java.util.Set;

public class EmployeeAddressRepository implements IEmployeeAddress{
    private static EmployeeAddressRepository repository =null;
    private Set<EmployeeAddress> Database;
    private EmployeeAddressRepository(){
        Database= new HashSet<EmployeeAddress>();

    }

    public static EmployeeAddressRepository getRepository(){
        if (repository==null) {
            repository = new EmployeeAddressRepository();
        }
        return repository;

    }



    @Override
    public EmployeeAddress create(EmployeeAddress object) {
        boolean success=Database.add(object);
        if(!success)
            return null;
        return object;
    }

    @Override
    public EmployeeAddress read(String id) {
        EmployeeAddress employeeAddress=Database.stream().
                filter(e ->e.getEmployeeID().equals(id))

                .findAny().orElse(null);
        return employeeAddress;
    }

    @Override
    public EmployeeAddress update(EmployeeAddress id) {
        EmployeeAddress current=read(id.getEmployeeID());
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
        EmployeeAddress employeeAddress= read(ID);
        if (employeeAddress==null)
        {
            return false;
        }
        Database.remove(employeeAddress);


        return true;
    }
    @Override
    public Set<EmployeeAddress> getAll() {
        return Database;
    }
}
