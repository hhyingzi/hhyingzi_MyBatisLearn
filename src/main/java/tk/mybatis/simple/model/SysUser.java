package tk.mybatis.simple.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// 用户表
public class SysUser implements Serializable {
    private static final long serialVersionUID = -328602757171077630L;
    private Long id;
    private String userName; //用户名
    private String userPassword; //密码
    private String userEmail; //邮箱
    private String userInfo; //简介
    private byte[] headImg; //头像
    private Date createTime; //创建时间
    //private SysRole role; //用户角色
    //private List<SysRole> roleList; //用户的角色集合

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public String getUserPassword() { return userPassword; }
    public void setUserPassword(String userPassword) { this.userPassword = userPassword; }
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    public String getUserInfo() { return userInfo; }
    public void setUserInfo(String userInfo) { this.userInfo = userInfo; }
    public byte[] getHeadImg() { return headImg; }
    public void setHeadImg(byte[] headImg) { this.headImg = headImg; }
    public Date getCreateTime() { return createTime; }
    public void setCreateTime(Date createTime) { this.createTime = createTime; }
//    public SysRole getRole() { return role; }
//    public void setRole(SysRole role) { this.role = role; }
//    public List<SysRole> getRoleList() { return roleList; }
//    public void setRoleList(List<SysRole> roleList) { this.roleList = roleList; }
}
