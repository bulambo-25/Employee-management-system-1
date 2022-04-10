package za.ac.cput.repository;
/*
 * @author Reanetsi Sholoko
 * student no: 218160402
 *
 * */

import za.ac.cput.entity.EmployeeRole;
import za.ac.cput.entity.Role;

import java.util.HashSet;
import java.util.Set;

public class RoleRepository implements IRole {
    private static RoleRepository repository=null;
    private Set<Role> roleDB=null;

    private RoleRepository(){

        roleDB=new HashSet<Role>();
    }
    public static RoleRepository getRepository() {
        if (repository == null){
            repository = new RoleRepository();
        }
        return repository;
    }
    @Override
    public Role create(Role role) {

        boolean success=roleDB.add(role);
        if(!success)
            return null;
        return role;
    }
    @Override
    public Role read(String roleId) {

        Role role=roleDB.stream()
                .filter(e-> e.getRoleId().equals(roleId))
                .findAny()
                .orElse(null);
        return role;

    }
    @Override
    public Role update(Role role) {
        Role oldRole=read(role.getRoleId());
        if(oldRole !=null) {
            roleDB.remove(oldRole);
            roleDB.add(role);
            return role;
        }
        return null;

    }
    @Override
    public boolean delete(String roleId) {
        Role roleToDelete=read(roleId);
        if(roleToDelete == null)
            return false;
        roleDB.remove(roleToDelete);
        return true;

    }
    @Override
    public Set<Role> getAll() {
        return roleDB;
    }



}
