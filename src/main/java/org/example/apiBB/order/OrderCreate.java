package org.example.apiBB.order;

public class OrderCreate {
    private String DeviceID;

    public OrderCreate(String diveceID) {
        DeviceID = diveceID;
    }

    public String getDiveceID() {
        return DeviceID;
    }

    public void setDiveceID(String diveceID) {
        DeviceID = diveceID;
    }
}
