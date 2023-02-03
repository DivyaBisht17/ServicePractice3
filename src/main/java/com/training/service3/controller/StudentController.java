package com.training.service3.controller;

import com.training.service3.model.Student;
import com.training.service3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/db")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")

    public List<Student> getAll() {
        return studentService.getAll();

    }

    @PostMapping("/sddStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);

    }
    @DeleteMapping("deletedstudent/{id}")
    public String getDelete(@PathVariable int id){
       return  studentService.deleteStudent(id);
    }
}
