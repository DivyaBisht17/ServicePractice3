package com.training.service3.service;

import com.training.service3.model.Student;

import java.util.List;

public interface StudentService  {
    public List<Student> getAll();
    public  Student  addStudent (Student student);
    public  Student updateStudent (Student student);
    public String deleteStudent(int id);
}
