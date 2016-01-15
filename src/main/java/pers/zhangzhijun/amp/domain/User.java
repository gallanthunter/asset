package pers.zhangzhijun.amp.domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id", nullable = false)
    @Size(max = 8)
    private String uid;

    @Column(name = "user_name", nullable = false)
    @Size(max = 32)
    private String username;

    @Column(name = "user_password", nullable = false)
    @Size(min = 8,max = 256)
    private String password;

    @Email
    @Column(name = "user_email", nullable = false)
    @Size(max = 64)
    private String email;

    @Column(name = "user_role_id", nullable = false)
    private String roleId;

    @Column(name = "user_projectgroup_id", nullable = false)
    @Size(max = 32)
    private String projectGroupId;

    public User() {
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
        return "User{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", roleId='" + roleId + '\'' +
                ", projectGroupId='" + projectGroupId + '\'' +
                '}';
    }
}
