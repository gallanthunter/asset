package pers.zhangzhijun.amp.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * ClassName: pers.zhangzhijun.amp.domain
 * Function :
 * Author   : ZhangZhijun
 * Date     : 22:34
 * Since    : v1.0.0
 */
@Entity
@Table(name = "T_ASSETTYPE")
public class AssetType implements Serializable {
    private static final long serialVersionUID = -7071242094905187996L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "type_name", nullable = false)
    @Size(max = 32)
    private String name;

    @Column(name = "type_description")
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
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
