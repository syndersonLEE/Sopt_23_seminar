package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {

    private int universityIdx;
    private String universityName;
    private int universityPhoneNum;
    private String address;

    public UniversityBuilder setUniversityIdx(int universityIdx) {
        this.universityIdx = universityIdx;
        return this;
    }

    public UniversityBuilder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public UniversityBuilder setUniversityPhoneNum(int universityPhoneNum) {
        this.universityPhoneNum = universityPhoneNum;
        return this;
    }

    public UniversityBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public University build(){
        return new University(this.universityIdx, this.universityName, this.universityPhoneNum, this.address);
    }
}
