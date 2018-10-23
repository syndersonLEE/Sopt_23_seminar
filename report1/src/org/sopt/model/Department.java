package org.sopt.model;

public class Department extends University{

    private int departmentIdx;
    private String departmentName;
    private int departmentPhoneNum;
    private String type;

    public Department() {
    }

    public Department(int departmentIdx, String departmentName, int departmentPhoneNum, String type) {
        super();
        this.departmentIdx = departmentIdx;
        this.departmentName = departmentName;
        this.departmentPhoneNum = departmentPhoneNum;
        this.type = type;
    }

    public int getDepartmentIdx() {
        return departmentIdx;
    }

    public void setDepartmentIdx(int departmentIdx) {
        this.departmentIdx = departmentIdx;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentPhoneNum() {
        return departmentPhoneNum;
    }

    public void setDepartmentPhoneNum(int departmentPhoneNum) {
        this.departmentPhoneNum = departmentPhoneNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentIdx=" + departmentIdx +
                ", departmentName='" + departmentName + '\'' +
                ", departmentPhoneNum=" + departmentPhoneNum +
                ", type='" + type + '\'' +
                '}';
    }
}
