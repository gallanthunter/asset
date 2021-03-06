package pers.zhangzhijun.amp.dto;

import java.io.Serializable;

/**
 * ClassName: pers.zhangzhijun.amp.dto
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:28
 * Since    : v1.0.0
 */
public class ManufacturerDTO implements Serializable {
    private static final long serialVersionUID = -7096789505086206572L;

    private Long id;

    private String name;

    private String description;

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
        return "ManufactureDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
