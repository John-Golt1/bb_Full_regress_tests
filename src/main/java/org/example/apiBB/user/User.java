package org.example.apiBB.user;

public class User {
    private String CLID = "D8BB705A-99BD-4306-93E0-2A7D5AF91950"; //клид компании ROB
    private String PIN = "38736";

    public User(String CLID, String PIN) {
        this.CLID = CLID;
        this.PIN = PIN;
    }

    public String getCLID() {
        return CLID;
    }

    public void setCLID(String CLID) {
        this.CLID = CLID;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
}
