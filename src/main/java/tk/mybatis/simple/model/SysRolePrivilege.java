package tk.mybatis.simple.model;

//角色-权限关联表
public class SysRolePrivilege {
    private  Long roleId; //角色ID
    private long privilegeId; //权限ID

    public Long getRoleId() { return roleId; }
    public void setRoleId(Long roleId) { this.roleId = roleId; }
    public long getPrivilegeId() { return privilegeId; }
    public void setPrivilegeId(long privilegeId) { this.privilegeId = privilegeId; }
}