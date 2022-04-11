package za.ac.cput.factory;
/*
 * @author Reanetsi Sholoko
 * student no: 218160402
 *
 * */
import za.ac.cput.entity.Role;

public class RoleFactory {

    public static Role createRole(String roleId,String roleName, String roleDesc){
        return new Role.Builder().setRoleId(roleId)
                .setRoleName(roleName)
                .setRoleDesc(roleDesc)
                .build();

    }
}
