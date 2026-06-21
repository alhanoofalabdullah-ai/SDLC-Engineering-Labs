package com.alhanoof.sdlc.waterfall.repository;

import com.alhanoof.sdlc.waterfall.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByDepartment(String department);

    List<Student> findByEnrollmentStatus(String enrollmentStatus);
}
