package org.example.apiBB.order;

public class OrderGenerator {

    public OrderCreate getOrderHonor() {
        return new OrderCreate("9f6039f6-207e-47bd-ad1a-d71411fd1286");
    }
    public OrderCreate getOrderFasle() {
        return new OrderCreate("1234");
    }
    public OrderCreate getOrderError() { return new OrderCreate("[ " + "\"" + 1234 + "\"" + " ]");}
}
