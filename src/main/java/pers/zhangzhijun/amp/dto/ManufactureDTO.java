package pers.zhangzhijun.amp.dto;

/**
 * ClassName: pers.zhangzhijun.amp.dto
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:28
 * Since    : v1.0.0
 */
public class ManufactureDTO {
    private String id;

    private String name;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
