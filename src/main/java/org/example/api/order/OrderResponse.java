package org.example.api.order;

public class OrderResponse {
    private Order order;
    private String Mode;
    private String ConnectionID;
    private boolean HelpWindow;
    private String OrderID;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }

    public String getConnectionID() {
        return ConnectionID;
    }

    public void setConnectionID(String connectionID) {
        ConnectionID = connectionID;
    }

    public boolean isHelpWindow() {
        return HelpWindow;
    }

    public void setHelpWindow(boolean helpWindow) {
        HelpWindow = helpWindow;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }
}
