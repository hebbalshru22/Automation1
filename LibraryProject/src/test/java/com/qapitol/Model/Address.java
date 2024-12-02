package com.qapitol.Model;

public class Address {
    private String streetName;
    private String completeAddress;
    private String pincode;

    public String getStreetName() {
        return streetName;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public String getPincode() {
        return pincode;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", completeAddress='" + completeAddress + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';

    }
}
