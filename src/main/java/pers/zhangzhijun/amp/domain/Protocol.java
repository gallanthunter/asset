package pers.zhangzhijun.amp.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * ClassName: pers.zhangzhijun.amp.domain
 * Function :
 * Author   : ZhangZhijun
 * Date     : 20:53
 * Since    : v1.0.0
 */
@Entity
@Table(name= "T_PROTOCOL")
public class Protocol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Size(max = 32)
    @Column(name = "id")
    private String id;

    @Size(max = 32)
    @Column(name = "protocol_name")
    @NotNull
    private String name;

    @Size(max = 256)
    @Column(name = "protocol_description")
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
        return "Protocol{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
