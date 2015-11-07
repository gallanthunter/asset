package pers.zhangzhijun.amp.dto;

/**
 * Created by ZhangZhijun on 2015/8/30.
 */
public class AssetDTO {
    private String id;

    private String assetId;

    private String name;

    private String model;

    private String typeId;

    private String protocolId;

    private String status;

    private String manufacturerId;

    private String description;

    public AssetDTO() {
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
