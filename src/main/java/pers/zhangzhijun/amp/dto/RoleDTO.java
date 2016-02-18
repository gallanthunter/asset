package pers.zhangzhijun.amp.dto;

import java.io.Serializable;

/**
 * Created by ZhangZhijun on 2015/9/11.
 */
public class RoleDTO implements Serializable {
    private static final long serialVersionUID = 4610287195864266401L;

    private Long id;

    private String name;

    private String description;

    public RoleDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
