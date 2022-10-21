package com.crud.crud.service;

import com.crud.crud.model.Student;

import java.util.List;

public interface IStudent {
    public List<Student> getStudents();
    public void saveStudent (Student student);
    public void deleteStudent (Long id);
    public Student findStudent (Long id);
}
