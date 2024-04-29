package com.example.Address.dto;

import jakarta.validation.constraints.NotNull;

public class AddressDTO {

    private int id;

    @NotNull(message = "'lane1' cannot be empty! ")
    private String lane1;

    @NotNull(message = "'lane2' cannot be empty! ")
    private String lane2;

    @NotNull(message = "'zip' cannot be empty! ")
    private int zip;

    @NotNull(message = "'state' cannot be empty! ")
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public String getLane2() {
        return lane2;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
