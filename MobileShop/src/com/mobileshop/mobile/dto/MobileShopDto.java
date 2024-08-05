package com.mobileshop.mobile.dto;

public class MobileShopDto {

    private String mobileName;
    private String phoneCase;
    private String earBuds;
    private String chargingCable;

    public String getMobileName(){
        return mobileName;
    }

    public  String getPhoneCase(){
        return phoneCase;
    }

    public String getEarBuds(){
        return earBuds;
    }

    public String getChargingCable(){
        return chargingCable;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public void setPhoneCase(String phoneCase) {
        this.phoneCase = phoneCase;
    }

    public void setEarBuds(String earBuds) {
        this.earBuds = earBuds;
    }

    public void setChargingCable(String chargingCable) {
        this.chargingCable = chargingCable;
    }
}
