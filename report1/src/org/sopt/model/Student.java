package org.sopt.model;

public class Student extends Department {
    private int StudentIdx;
    private String StudentName;
    private String StudentGrade;
    private String StudentMajor;
    private String StudentEmail;
    private String StudentAddress;
    private int StudentAge;
    private String StudentCurrentState;

    public Student() {
    }

    public Student(int studentIdx, String studentName, String studentGrade, String studentMajor, String studentEmail, String studentAddress, int studentAge, String studentCurrentState) {
        StudentIdx = studentIdx;
        StudentName = studentName;
        StudentGrade = studentGrade;
        StudentMajor = studentMajor;
        StudentEmail = studentEmail;
        StudentAddress = studentAddress;
        StudentAge = studentAge;
        StudentCurrentState = studentCurrentState;
    }

    public int getStudentIdx() {
        return StudentIdx;
    }

    public void setStudentIdx(int studentIdx) {
        StudentIdx = studentIdx;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentGrade() {
        return StudentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        StudentGrade = studentGrade;
    }

    public String getStudentMajor() {
        return StudentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        StudentMajor = studentMajor;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }

    public String getStudentCurrentState() {
        return StudentCurrentState;
    }

    public void setStudentCurrentState(String studentCurrentState) {
        StudentCurrentState = studentCurrentState;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentIdx=" + StudentIdx +
                ", StudentName='" + StudentName + '\'' +
                ", StudentGrade='" + StudentGrade + '\'' +
                ", StudentMajor='" + StudentMajor + '\'' +
                ", StudentEmail='" + StudentEmail + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                ", StudentAge=" + StudentAge +
                ", StudentCurrentState='" + StudentCurrentState + '\'' +
                '}';
    }
}
