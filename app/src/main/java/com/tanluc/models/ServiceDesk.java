package com.tanluc.models;

/**
 * Created by TANLUC on 13/01/2018.
 */
public class ServiceDesk {

    private String numberName;
    private String status;

    public ServiceDesk() {
    }

    public ServiceDesk(String numberName, String status) {
        this.numberName = numberName;
        this.status = status;
    }

    public String getNumberName() {
        return numberName;
    }

    public void setNumberName(String numberName) {
        this.numberName = numberName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
