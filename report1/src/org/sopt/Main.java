package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.builder.UniversityBuilder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        final ArrayList<Student> studentList = new ArrayList<>();

        final StudentBuilder studentBuilder1 = new StudentBuilder();
        final StudentBuilder studentBuilder2 = new StudentBuilder();
        final StudentBuilder studentBuilder3 = new StudentBuilder();

        final Student student1 = studentBuilder1
                .setStudentIdx(10)
                .setStudentName("이상윤")
                .setStudentAddress("삼성동")
                .setStudentAge(26)
                .setStudentCurrentState("재학중")
                .setStudentGrade("Junior")
                .setStudentEmail("winnery93@gmail.com")
                .setStudentMajor("소프트웨어학과")
                .build();
        final Student student2 = studentBuilder2
                .setStudentIdx(6)
                .setStudentName("김상열")
                .setStudentAddress("부천시")
                .setStudentAge(22)
                .setStudentCurrentState("재학중")
                .setStudentGrade("Freshman")
                .setStudentEmail("Sangyeol@gmail.com")
                .setStudentMajor("건축학과")
                .build();
        final Student student3 = studentBuilder3
                .setStudentIdx(12)
                .setStudentName("최창규")
                .setStudentAddress("고양시")
                .setStudentAge(24)
                .setStudentCurrentState("휴학중")
                .setStudentGrade("Senior")
                .setStudentEmail("Changgyu@gmail.com")
                .setStudentMajor("법학과")
                .build();


        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (final Student s : studentList) {
            System.out.println(s.toString());
        }

        final ArrayList<Professor> professorsList = new ArrayList<>();

        final ProfessorBuilder professorBuilder1 = new ProfessorBuilder();
        final ProfessorBuilder professorBuilder2 = new ProfessorBuilder();
        final ProfessorBuilder professorBuilder3 = new ProfessorBuilder();

        final Professor professor1 = professorBuilder1
                .setProfessorIdx(1)
                .setProfessorName("임은진")
                .setProfessorSubject("임베디드")
                .setProfessorDepartment("소프트웨어")
                .setProfessorPhoneNum(5636)
                .build();
        final Professor professor2 = professorBuilder2
                .setProfessorIdx(2)
                .setProfessorName("이재구")
                .setProfessorSubject("인공지능")
                .setProfessorDepartment("융합SW학과")
                .setProfessorPhoneNum(9356)
                .build();
        final Professor professor3 = professorBuilder3
                .setProfessorIdx(3)
                .setProfessorName("고재백")
                .setProfessorSubject("역사")
                .setProfessorDepartment("역사학과")
                .setProfessorPhoneNum(3948)
                .build();

        professorsList.add(professor1);
        professorsList.add(professor2);
        professorsList.add(professor3);

        for (final Professor p : professorsList) {
            System.out.println(p.toString());
        }

        final ArrayList<Department> departmentList = new ArrayList<>();

        final DepartmentBuilder departmentBuilder1 = new DepartmentBuilder();
        final DepartmentBuilder departmentBuilder2 = new DepartmentBuilder();
        final DepartmentBuilder departmentBuilder3 = new DepartmentBuilder();

        final Department department1 = departmentBuilder1
                .setDepartmentIdx(1)
                .setDepartmentName("역사학과")
                .setDepartmentPhoneNum(4632)
                .setType("인문")
                .build();
        final Department department2 = departmentBuilder2
                .setDepartmentIdx(2)
                .setDepartmentName("디자인학과")
                .setDepartmentPhoneNum(2348)
                .setType("예술")
                .build();
        final Department department3 = departmentBuilder3
                .setDepartmentIdx(3)
                .setDepartmentName("기계학과")
                .setDepartmentPhoneNum(2934)
                .setType("공학")
                .build();

        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);

        for(final Department d : departmentList) {
            System.out.println(d.toString());
        }

        final ArrayList<University> universityArrayList = new ArrayList<>();

        final UniversityBuilder universityBuilder1 = new UniversityBuilder();
        final UniversityBuilder universityBuilder2 = new UniversityBuilder();
        final UniversityBuilder universityBuilder3 = new UniversityBuilder();

        final University university1 = universityBuilder1
                .setUniversityIdx(1)
                .setUniversityName("국민대학교")
                .setUniversityPhoneNum(1289)
                .setAddress("성북구")
                .build();
        final University university2 = universityBuilder2
                .setUniversityIdx(2)
                .setUniversityName("연세대학교")
                .setUniversityPhoneNum(2469)
                .setAddress("신촌")
                .build();
        final University university3 = universityBuilder3
                .setUniversityIdx(3)
                .setUniversityName("광운대학교")
                .setUniversityPhoneNum(7258)
                .setAddress("어린이대공원역")
                .build();


        universityArrayList.add(university1);
        universityArrayList.add(university2);
        universityArrayList.add(university3);

        for (final University u : universityArrayList){
            System.out.println(u.toString());
        }
    }


}
