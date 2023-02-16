package org.example.api.order;

public class Order {
    private String Color;
    private String DeviceID;
    private int FirstPrice;
    private String FormatedFirstPrice;
    private String FormatedFinalPrice;
    private double MinPrice;
    private String FormatedSellingPrice;
    private String Id;
    private String IMEI;
    private String Manufacturer;
    private String Model;
    private String CreateDate;
    private String CreateDateFormatted;
    private int Storage;
    private boolean IsFixedImei;
    private String Status;
    private int OrderNumber;
    private String Mode;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(String deviceID) {
        DeviceID = deviceID;
    }

    public int getFirstPrice() {
        return FirstPrice;
    }

    public void setFirstPrice(int firstPrice) {
        FirstPrice = firstPrice;
    }

    public String getFormatedFirstPrice() {
        return FormatedFirstPrice;
    }

    public void setFormatedFirstPrice(String formatedFirstPrice) {
        FormatedFirstPrice = formatedFirstPrice;
    }

    public String getFormatedFinalPrice() {
        return FormatedFinalPrice;
    }

    public void setFormatedFinalPrice(String formatedFinalPrice) {
        FormatedFinalPrice = formatedFinalPrice;
    }

    public double getMinPrice() {
        return MinPrice;
    }

    public void setMinPrice(double minPrice) {
        MinPrice = minPrice;
    }

    public String getFormatedSellingPrice() {
        return FormatedSellingPrice;
    }

    public void setFormatedSellingPrice(String formatedSellingPrice) {
        FormatedSellingPrice = formatedSellingPrice;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getCreateDateFormatted() {
        return CreateDateFormatted;
    }

    public void setCreateDateFormatted(String createDateFormatted) {
        CreateDateFormatted = createDateFormatted;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }

    public boolean isFixedImei() {
        return IsFixedImei;
    }

    public void setFixedImei(boolean fixedImei) {
        IsFixedImei = fixedImei;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }
}
