package org.sopt.model;

public class Professor extends Department{

    private int professorIdx;
    private String professorName;
    private String professorDepartment;
    private int professorPhoneNum;
    private String professorSubject;

    public Professor() {
    }

    public Professor(int professorIdx, String professorName, String professorDepartment, int professorPhoneNum, String professorSubject) {
        this.professorIdx = professorIdx;
        this.professorName = professorName;
        this.professorDepartment = professorDepartment;
        this.professorPhoneNum = professorPhoneNum;
        this.professorSubject = professorSubject;
    }

    public int getProfessorIdx() {
        return professorIdx;
    }

    public void setProfessorIdx(int professorIdx) {
        this.professorIdx = professorIdx;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorDepartment() {
        return professorDepartment;
    }

    public void setProfessorDepartment(String professorDepartment) {
        this.professorDepartment = professorDepartment;
    }

    public int getProfessorPhoneNum() {
        return professorPhoneNum;
    }

    public void setProfessorPhoneNum(int professorPhoneNum) {
        this.professorPhoneNum = professorPhoneNum;
    }

    public String getProfessorSubject() {
        return professorSubject;
    }

    public void setProfessorSubject(String professorSubject) {
        this.professorSubject = professorSubject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorIdx=" + professorIdx +
                ", professorName='" + professorName + '\'' +
                ", professorDepartment='" + professorDepartment + '\'' +
                ", professorPhoneNum=" + professorPhoneNum +
                ", professorSubject='" + professorSubject + '\'' +
                '}';
    }
}
