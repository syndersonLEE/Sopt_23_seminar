package org.sopt.model;

public class University {
    private int universityIdx;
    private String universityName;
    private int universityPhoneNum;
    private String address;

    public University() {
    }

    public University(int universityIdx, String universityName, int universityPhoneNum, String address) {
        this.universityIdx = universityIdx;
        this.universityName = universityName;
        this.universityPhoneNum = universityPhoneNum;
        this.address = address;
    }

    public int getUniversityIdx() {
        return universityIdx;
    }

    public void setUniversityIdx(int universityIdx) {
        this.universityIdx = universityIdx;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getUniversityPhoneNum() {
        return universityPhoneNum;
    }

    public void setUniversityPhoneNum(int universityPhoneNum) {
        this.universityPhoneNum = universityPhoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityIdx=" + universityIdx +
                ", universityName='" + universityName + '\'' +
                ", universityPhoneNum=" + universityPhoneNum +
                ", address='" + address + '\'' +
                '}';
    }
}
