package pers.zhangzhijun.amp.domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
@Entity
@Table(name = "T_USRR")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "uid")
    @Size(max = 8)
    @NotNull
    private String uid;

    @Column(name = "name")
    @Size(max = 32)
    @NotNull
    private String username;

    @Column(name = "password")
    @Size(min = 8,max = 256)
    @NotNull
    private String password;

    @Email
    @Column(name = "email")
    @Size(max = 64)
    @NotNull
    private String email;

    @Column(name = "roles")
    private String roles;

    @Column(name = "projectgroup")
    @Size(max = 32)
    @NotNull
    private String projectGroup;

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

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", roles='" + roles + '\'' +
                ", projectGroup='" + projectGroup + '\'' +
                '}';
    }
}
