package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {
    private int StudentIdx;
    private String StudentName;
    private String StudentGrade;
    private String StudentMajor;
    private String StudentEmail;
    private String StudentAddress;
    private int StudentAge;
    private String StudentCurrentState;

    public StudentBuilder setStudentIdx(int studentIdx) {
        StudentIdx = studentIdx;
        return this;
    }

    public StudentBuilder setStudentName(String studentName) {
        StudentName = studentName;
        return this;
    }

    public StudentBuilder setStudentGrade(String studentGrade) {
        StudentGrade = studentGrade;
        return this;
    }

    public StudentBuilder setStudentMajor(String studentMajor) {
        StudentMajor = studentMajor;
        return this;
    }

    public StudentBuilder setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
        return this;
    }

    public StudentBuilder setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
        return this;
    }

    public StudentBuilder setStudentAge(int studentAge) {
        StudentAge = studentAge;
        return this;
    }

    public StudentBuilder setStudentCurrentState(String studentCurrentState) {
        StudentCurrentState = studentCurrentState;
        return this;
    }

    public Student build(){
        return new Student(this.StudentIdx, this.StudentName, this.StudentGrade, this.StudentMajor, this.StudentEmail, this.StudentAddress, this.StudentAge, this.StudentCurrentState);
    }
}
