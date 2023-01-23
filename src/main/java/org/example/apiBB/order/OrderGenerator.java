package org.example.apiBB.order;

public class OrderGenerator {

    public OrderCreate getOrderHonor() {
        return new OrderCreate("7c419473-0049-48a9-a639-cc319b9645e4");
    }
    public OrderCreate getOrderFasle() {
        return new OrderCreate("1234");
    }
    public OrderCreate getOrderError() { return new OrderCreate("[ " + "\"" + 1234 + "\"" + " ]");}
}
