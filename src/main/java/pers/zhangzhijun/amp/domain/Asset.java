package pers.zhangzhijun.amp.domain;

import javax.persistence.*;

/**
 * Created by Zhang Zhijun on 2015/8/22.
 */
@Entity
@Table(name = "T_ASSET")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "assetId")
    private String assetId;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "type")
    private String type;

    @Column(name = "manufacturer")
    private String manufacturer;

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

        if (!id.equals(asset.id)) return false;
        if (assetId != null ? !assetId.equals(asset.assetId) : asset.assetId != null) return false;
        if (name != null ? !name.equals(asset.name) : asset.name != null) return false;
        if (model != null ? !model.equals(asset.model) : asset.model != null) return false;
        if (type != null ? !type.equals(asset.type) : asset.type != null) return false;
        if (manufacturer != null ? !manufacturer.equals(asset.manufacturer) : asset.manufacturer != null) return false;
        return !(description != null ? !description.equals(asset.description) : asset.description != null);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (assetId != null ? assetId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
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
