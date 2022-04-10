package za.ac.cput.entity;
/*
 * @author Reanetsi Sholoko
 * student no: 218160402
 *
 * */
public class Role {

    private String roleId, roleName, roleDesc;

private Role(Builder builder){
    this.roleId=builder.roleId;
    this.roleName=builder.roleName;
    this.roleDesc=builder.roleDesc;
}

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
    public static class Builder{
        private String roleId, roleName, roleDesc;

        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder  setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder  setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
            return this;
        }
        public Builder copy(Role role){
            this.roleId=role.roleId;
            this.roleName=role.roleName;
            this.roleDesc=role.roleDesc;
            return this;
        }
        public Role build(){
            return new Role(this);
        }
    }
}
