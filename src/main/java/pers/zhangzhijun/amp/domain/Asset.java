package pers.zhangzhijun.amp.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Zhang Zhijun on 2015/8/22.
 */
@Entity
@Table(name = "T_ASSET")
public class Asset implements Serializable {

    private static final long serialVersionUID = -3016416569594316177L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", nullable = false)
    private String id;

    //@Size(max = 16)
    @Column(name = "asset_id")
    private String assetId;

    @Size(max = 64)
    @Column(name = "asset_name", nullable = false)
    private String name;

    @Size(max = 64)
    @Column(name = "asset_model", nullable = false)
    private String model;

    @Size(max = 32)
    @Column(name = "asset_type_id", nullable = false)
    private String typeId;

    @Size(max = 32)
    @Column(name = "asset_protocol_id", nullable = false)
    private String protocolId;

    @Column(name = "asset_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private AssetStatus status = AssetStatus.NORMAL;

    @Size(max = 32)
    @Column(name = "asset_manufacturer_id", nullable = false)
    private String manufacturerId;

    @Size(max = 256)
    @Column(name = "asset_description")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public AssetStatus getStatus() {
        return status;
    }

    public void setStatus(AssetStatus status) {
        this.status = status;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
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
                "id='" + id + '\'' +
                ", assetId='" + assetId + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", typeId='" + typeId + '\'' +
                ", protocolId='" + protocolId + '\'' +
                ", status='" + status + '\'' +
                ", manufacturerId='" + manufacturerId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
