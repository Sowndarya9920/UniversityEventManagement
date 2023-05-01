package com.geekster.UniversityEventManagement.repository;
import com.geekster.UniversityEventManagement.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer>{

   public List<Student> findByStudentId(Integer studentId);

   @Modifying
   @Query(value="update STUDENT set DEPARTMENT = :department where STUDENT_ID = :studentId",nativeQuery = true)
   public void updateDepartmentById(Integer studentId, String department);
}
