package pers.zhangzhijun.amp.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Zhang Zhijun on 2015/8/22.
 */
@Entity
@Table(name= "T_ASSET")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Size(max = 8)
    @Column(name = "id")
    private Long id;

    @Size(max = 16)
    @Column(name = "assetid")
    private String assetId;

    @Size(max = 32)
    @Column(name = "name")
    @NotNull
    private String name;

    @Size(max = 32)
    @Column(name = "model")
    @NotNull
    private String model;

    @Size(max = 32)
    @Column(name = "type")
    @NotNull
    private String type;

    @Size(max = 16)
    @Column(name = "os")
    private String os;

    @Size(max = 32)
    @Column(name = "protocol")
    private String protocol;

    @Size(max = 16)
    @Column(name = "staus")
    private String status;

    @Size(max = 64)
    @Column(name = "manufacturer")
    @NotNull
    private String manufacturer;

    @Size(max = 256)
    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asset asset = (Asset) o;

        return id.equals(asset.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", assetId='" + assetId + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", os='" + os + '\'' +
                ", protocol='" + protocol + '\'' +
                ", status='" + status + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
