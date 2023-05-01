package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping(value = "/addStudent")
    public String addStudent(@Valid @RequestBody List<Student> student){
        return studentService.addStudent(student);
    }

    @GetMapping(value = "/getAllStudents")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/getStudentById/{studentId}")
    public List<Student> getStudentById(@PathVariable Integer studentId){
        return studentService.getStudentById(studentId);
    }

    @DeleteMapping(value = "/deleteStudent/{studentId}")
    public void deleteStudentById(@PathVariable Integer studentId ){
        studentService.deleteStudentById(studentId);
    }

    @PutMapping(value = "/updateStudent/{studentId}/{department}")
    public void updateStudentByDepartment(@PathVariable Integer studentId , @PathVariable Department department){
        studentService.updateStudentByDepartment(studentId,department);
    }
    
}
