package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.repository.IStudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepository studentDao;

    public String addStudent(List<Student> student) {
        Iterable<Student> studentList = studentDao.saveAll(student);
        if(studentList!=null)
            return "Student details were added";
        else
            return "Invalid student details were added";
    }

    public Iterable<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public List<Student> getStudentById(Integer studentId) {
        return studentDao.findByStudentId(studentId);
    }

    public void deleteStudentById(Integer studentId) {
        studentDao.deleteById(studentId);
    }
    @Transactional
    public void updateStudentByDepartment(Integer studentId, Department department) {
        String dept = department.name();
        studentDao.updateDepartmentById(studentId,dept);
    }
}
