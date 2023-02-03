package org.example.apiBB.user;

public class User {
    private String CLID;
    private String PIN;

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
