package com.crud.storage.service;

import com.crud.storage.model.Student;

import java.util.List;

public interface IStudent {
    public List<Student> getStudents();
    public void saveStudent (Student student);
    public void deleteStudent (Long id);
    public Student findStudent (Long id);
}
