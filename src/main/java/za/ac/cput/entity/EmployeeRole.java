package za.ac.cput.entity;
/*
 * @author Reanetsi Sholoko
 * student no: 218160402
 *
 * */
public class EmployeeRole {

    private String employeeId,roleId;

private EmployeeRole(Builder builder){
    this.employeeId=builder.employeeId;
    this.roleId=builder.roleId;
}

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "EmployeeRole{" +
                "employeeId='" + employeeId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
    public static class Builder{
        private String employeeId,roleId;

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder copy(EmployeeRole employeeRole){
            this.employeeId=employeeRole.employeeId;
            this.roleId=employeeRole.roleId;
            return this;
        }

        public EmployeeRole build(){
            return new EmployeeRole(this);
        }
    }
}
