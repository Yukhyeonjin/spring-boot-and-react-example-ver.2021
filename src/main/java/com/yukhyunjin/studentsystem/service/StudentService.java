package com.yukhyunjin.studentsystem.service;

import com.yukhyunjin.studentsystem.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
