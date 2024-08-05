package com.xworkz.trainees.dao;

import com.xworkz.trainees.dto.XworkzDto;

public class XworkzDao {
    XworkzDao xworkzDao;

        public void getTraineeDetails(XworkzDto xworkzDto){

            int traineeId    = xworkzDto.getTraineeId();
            System.out.println(traineeId);

            String traineeName = xworkzDto.getTraineeName();
            System.out.println(traineeName);

            long phoneNum = xworkzDto.getPhoneNum();
            System.out.println(phoneNum);

            String address = xworkzDto.getAddress();
            System.out.println(address);

            String dob = xworkzDto.getDob();
            System.out.println(dob);
            this.xworkzDao = xworkzDao;



        }

}
