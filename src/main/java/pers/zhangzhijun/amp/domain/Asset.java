package pers.zhangzhijun.amp.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Zhang Zhijun on 2015/8/22.
 */
@Entity
@Table(name= "T_ASSET")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 16)
    private String assetId;

    @Size(max = 64)
    private String name;

    @Size(max = 64)
    private String model;

    @Size(max = 32)
    private String type;

    @Size(max = 16)
    private String status;

    @Size(max = 64)
    private String manufacturer;

    @Size(max = 256)
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
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
