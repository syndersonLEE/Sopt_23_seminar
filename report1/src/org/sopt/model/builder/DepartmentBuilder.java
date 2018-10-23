package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder extends UniversityBuilder {
    private int departmentIdx;
    private String departmentName;
    private int departmentPhoneNum;
    private String type;

    public DepartmentBuilder setDepartmentIdx(int departmentIdx) {
        this.departmentIdx = departmentIdx;
        return this;
    }

    public DepartmentBuilder setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public DepartmentBuilder setDepartmentPhoneNum(int departmentPhoneNum) {
        this.departmentPhoneNum = departmentPhoneNum;
        return this;
    }

    public DepartmentBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Department build(){
        return new Department(this.departmentIdx, this.departmentName, this.departmentPhoneNum, this.type);
    }
}
