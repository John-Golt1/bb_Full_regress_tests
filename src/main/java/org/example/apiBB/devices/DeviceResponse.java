package org.example.apiBB.devices;

public class DeviceResponse {
    public DeviceResponse(String deviceName, String ID, String deviceType, String storage) {
        DeviceName = deviceName;
        this.ID = ID;
        DeviceType = deviceType;
        Storage = storage;
    }
//    public DeviceResponse(String manufacture, String model) {
//        Manufacturer = manufacture;
//        Model = model;
//    }
    private String Manufacturer;
    private String Model;

    private String DeviceName;

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    private String ID;
    private String DeviceType;
    private String Storage;
}
