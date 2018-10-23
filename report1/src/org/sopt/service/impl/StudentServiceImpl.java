package org.sopt.service.impl;

import org.sopt.service.StudentService;
import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student getByStudentIdx(int getByStudentIdx){
        final StudentBuilder studentBuilder = new StudentBuilder();
        final Student Student = studentBuilder
                .build();
        return Student;
    }

}
