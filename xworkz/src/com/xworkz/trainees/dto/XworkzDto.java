package com.xworkz.trainees.dto;

public class XworkzDto {

    private int traineeId;
    private String traineeName;
    private long phoneNum;
    private String address;
    private String dob;


    public int getTraineeId(){
        return traineeId;
    }

    public String getTraineeName(){
        return traineeName;
    }

    public long getPhoneNum(){
        return phoneNum;
    }

    public String getAddress(){
        return address;
    }

    public String getDob(){
        return dob;
    }


    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(String dob){
        this.dob = dob;
    }
}

