package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Shipment implements Serializable {

    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;
    @SerializedName("commodity")
    @Expose
    private String commodity;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("numberOfBids")
    @Expose
    private String numberOfBids;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("vehicleType")
    @Expose
    private String vehicleType;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNumberOfBids() {
        return numberOfBids;
    }

    public void setNumberOfBids(String numberOfBids) {
        this.numberOfBids = numberOfBids;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

}