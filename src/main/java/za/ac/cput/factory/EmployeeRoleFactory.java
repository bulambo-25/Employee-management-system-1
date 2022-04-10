package za.ac.cput.factory;
/*
 * @author Reanetsi Sholoko 218160402
 *
 * */
import za.ac.cput.entity.EmployeeRole;
import za.ac.cput.entity.Role;

public class EmployeeRoleFactory {
    public static EmployeeRole createEmployeeRole(String employeeId,String roleId){
        return new EmployeeRole.Builder().setEmployeeId(employeeId)
                .setRoleId(roleId)
                .build();

    }
}
