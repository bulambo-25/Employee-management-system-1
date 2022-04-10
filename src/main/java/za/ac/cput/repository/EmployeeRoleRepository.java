package za.ac.cput.repository;
/*
 * @author Reanetsi Sholoko 218160402
 *
 * */
import za.ac.cput.entity.EmployeeRole;
import za.ac.cput.entity.Role;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRoleRepository implements IEmployeeRole{
    private static EmployeeRoleRepository repository=null;
    private Set<EmployeeRole> employeeRoleDB;

    private EmployeeRoleRepository(){

        employeeRoleDB=new HashSet<EmployeeRole>();
    }
    public static EmployeeRoleRepository getRepository() {
        if (repository == null){
            repository = new EmployeeRoleRepository();
        }
        return repository;
    }
    @Override
    public EmployeeRole create(EmployeeRole employeeRole) {

        boolean success=employeeRoleDB.add(employeeRole);
        if(!success)
            return null;
        return employeeRole;
    }
    @Override
    public EmployeeRole read(String employeeId) {

        EmployeeRole roleRole=employeeRoleDB.stream()
                .filter(e-> e.getEmployeeId().equals(employeeId))
                .findAny()
                .orElse(null);
        return roleRole;
    }
    @Override
    public EmployeeRole update(EmployeeRole employeeRole) {
        EmployeeRole oldEmployeeRole=read(employeeRole.getEmployeeId());
        if(oldEmployeeRole !=null) {
            employeeRoleDB.remove(oldEmployeeRole);
            employeeRoleDB.add(employeeRole);
            return employeeRole;
        }
        return employeeRole;

    }
    @Override
    public boolean delete(String employeeId) {
        EmployeeRole employeeRoleToDelete=read(employeeId);
        if(employeeRoleToDelete == null)
            return false;
        employeeRoleDB.remove(employeeRoleToDelete);
        return true;

    }
    @Override
    public Set<EmployeeRole> getAll() {
        return employeeRoleDB;
    }




}
