package pers.zhangzhijun.amp.dto;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
public class UserDTO {
    private Long id;

    private String uid;

    private String username;

    private String password;

    private String email;

    private String roleId;

    private String projectGroupId;

    public UserDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getProjectGroupId() {
        return projectGroupId;
    }

    public void setProjectGroupId(String projectGroupId) {
        this.projectGroupId = projectGroupId;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", roleId='" + roleId + '\'' +
                ", projectGroupId='" + projectGroupId + '\'' +
                '}';
    }
}
