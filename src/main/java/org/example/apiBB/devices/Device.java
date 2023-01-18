package org.example.apiBB.devices;

import java.util.List;

public class Device {
    private List<DeviceResponse> devicesList;

    public List<DeviceResponse> getDevicesList() {
        return devicesList;
    }

    public void setDevicesList(List<DeviceResponse> devicesList) {
        this.devicesList = devicesList;
    }
}
