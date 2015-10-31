package pers.zhangzhijun.amp.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * ClassName: pers.zhangzhijun.amp.domain
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:27
 * Since    : v1.0.0
 */
@Entity
@Table(name = "T_MANUFACTURE")
public class Projectgroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @Size(max = 32)
    @NotNull
    private String name;

    @Column(name = "description")
    @Size(max = 256)
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
        return "Projectgroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}