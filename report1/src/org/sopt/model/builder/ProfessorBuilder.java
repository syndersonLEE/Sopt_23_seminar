package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private int professorIdx;
    private String professorName;
    private String professorDepartment;
    private int professorPhoneNum;
    private String professorSubject;

    public ProfessorBuilder setProfessorIdx(int professorIdx) {
        this.professorIdx = professorIdx;
        return this;
    }

    public ProfessorBuilder setProfessorName(String professorName) {
        this.professorName = professorName;
        return this;
    }

    public ProfessorBuilder setProfessorDepartment(String professorDepartment) {
        this.professorDepartment = professorDepartment;
        return this;
    }

    public ProfessorBuilder setProfessorPhoneNum(int professorPhoneNum) {
        this.professorPhoneNum = professorPhoneNum;
        return this;
    }

    public ProfessorBuilder setProfessorSubject(String professorSubject) {
        this.professorSubject = professorSubject;
        return this;
    }

    public Professor build(){
        return new Professor(this.professorIdx, this.professorName, this.professorDepartment, this.professorPhoneNum, this.professorSubject);
    }
}
