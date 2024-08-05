package com.xworkz.trainees;

import com.xworkz.trainees.dto.XworkzDto;
import com.xworkz.trainees.dao.XworkzDao;


public class XworkzRunner {

    public static void main(String[] args){

        XworkzDto xworkzDto = new XworkzDto();
        XworkzDao xworkzDao = new XworkzDao();
        XworkzDto xworkzDto1 = new XworkzDto();
        XworkzDto xworkzDto2 = new XworkzDto();
        XworkzDto xworkzDto3 = new XworkzDto();

        xworkzDto1.setTraineeId(11);
        xworkzDto1.setTraineeName("SOWMYA");
        xworkzDto1.setPhoneNum(9988774410l);
        xworkzDto1.setAddress("dvg");
        xworkzDto1.setDob("29/09/2002");
        xworkzDao.getTraineeDetails(xworkzDto1);


        xworkzDto1.setTraineeId(12);
        xworkzDto1.setTraineeName("INDRAJ");
        xworkzDto1.setPhoneNum(9874563216l);
        xworkzDto1.setAddress("karnataka");
        xworkzDto1.setDob("19/03/2002");
        xworkzDao.getTraineeDetails(xworkzDto2);


        xworkzDto1.setTraineeId(13);
        xworkzDto1.setTraineeName("SINDU U G");
        xworkzDto1.setPhoneNum(9785462139l);
        xworkzDto1.setAddress("harihara");
        xworkzDto1.setDob("22/01/2002");
        xworkzDao.getTraineeDetails(xworkzDto3);



    }

}
