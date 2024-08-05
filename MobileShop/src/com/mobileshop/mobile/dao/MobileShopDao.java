package com.mobileshop.mobile.dao;

import com.mobileshop.mobile.dto.MobileShopDto;

public class MobileShopDao {
    MobileShopDao mobileShopDao;

    public void getAccessories(MobileShopDto mobileShopDto){

        String mobileName = mobileShopDto.getMobileName();
        System.out.println(mobileName);

        String phoneCase = mobileShopDto.getPhoneCase();
        System.out.println(phoneCase);

        String earBuds = mobileShopDto.getEarBuds();
        System.out.println(earBuds);

        String  chargingCable = mobileShopDto.getChargingCable();
        System.out.println(chargingCable);
        this.mobileShopDao = mobileShopDao;
    }
}
