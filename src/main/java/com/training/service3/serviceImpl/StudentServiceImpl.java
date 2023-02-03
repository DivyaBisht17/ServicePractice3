package com.training.service3.serviceImpl;

import com.training.service3.model.Student;
import com.training.service3.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getAll() {
        List<Student> getAll=new ArrayList<>();
        Student s1 = new Student(101,"Divya",33.39f,true,"divyabishtdwt@gmail.com");
        Student s2 = new Student(102,"Manisha",31.39f,true,"manisha@gmail.com");
        Student s3 = new Student(103,"Harshita",92.39f,true,"harshita@gmail.com");
        Student s4 = new Student(104,"Vanshi",12.39f,true,"vanshi@gmail.com");
        Student s5 = new Student(105,"Golu",22.39f,true,"golu@gmail.com");
        getAll.add(s1);
        getAll.add(s2);
        getAll.add(s3);
        getAll.add(s4);
        getAll.add(s5);
        return getAll;
    }

    @Override
    public Student addStudent(Student student) {
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        return student;
    }

    @Override
    public String deleteStudent(int id) {
        return "delete:"+id;
    }
}
