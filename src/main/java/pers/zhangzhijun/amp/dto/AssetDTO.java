package pers.zhangzhijun.amp.dto;

import pers.zhangzhijun.amp.domain.AssetStatus;

import java.io.Serializable;

/**
 * Created by ZhangZhijun on 2015/8/30.
 */
public class AssetDTO implements Serializable {
    private static final long serialVersionUID = -6144411411532267090L;

    private Long id;

    private String assetId;

    private String name;

    private String model;

    private String typeId;

    private String protocolId;

    private AssetStatus status;

    private String manufacturerId;

    private String description;

    public AssetDTO() {
    }

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
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AssetDTO{" +
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
