package com.mobileshop.mobile;

import com.mobileshop.mobile.dao.MobileShopDao;
import com.mobileshop.mobile.dto.MobileShopDto;

public class MobileShopRunner {

    public static void main (String[] args ){

        MobileShopDto mobileShopDto = new MobileShopDto();
        MobileShopDao mobileShopDao = new MobileShopDao();

        MobileShopDto mobileShopDto1 = new MobileShopDto();
        MobileShopDto mobileShopDto2 = new MobileShopDto();
        MobileShopDto mobileShopDto3 = new MobileShopDto();

        MobileShopDto MobileShopDto1 = new MobileShopDto();
        MobileShopDto1.setMobileName("Apple");
        MobileShopDto1.setPhoneCase("SILICON CASE");
        MobileShopDto1.setEarBuds("Air Pods Pro");
        MobileShopDto1.setChargingCable("Anker Power core");

        MobileShopDto MobileShopDto2 = new MobileShopDto();
        MobileShopDto2.setMobileName("SAMSUNG");
        MobileShopDto2.setPhoneCase("Leather Cover");
        MobileShopDto2.setEarBuds("Galaxy Buds 2");
        MobileShopDto2.setChargingCable("Anker PowerLine+ ");

        MobileShopDto MobileShopDto3 = new MobileShopDto();
        MobileShopDto3.setMobileName("Pne Plus");
        MobileShopDto3.setPhoneCase("OnePlus Sandstone");
        MobileShopDto3.setEarBuds("Bose QuietComfort Earbuds ");
        MobileShopDto3.setChargingCable("Anker Power core");


    mobileShopDao.getAccessories(MobileShopDto1);
    mobileShopDao.getAccessories(MobileShopDto2);
    mobileShopDao.getAccessories(MobileShopDto3);


    }
}
