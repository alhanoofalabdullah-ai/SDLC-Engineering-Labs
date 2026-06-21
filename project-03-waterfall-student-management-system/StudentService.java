package com.alhanoof.sdlc.waterfall.service;

import com.alhanoof.sdlc.waterfall.entity.Student;
import com.alhanoof.sdlc.waterfall.exception.ResourceNotFoundException;
import com.alhanoof.sdlc.waterfall.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with ID: " + id));
    }

    public List<Student> getStudentsByDepartment(String department) {
        return repository.findByDepartment(department);
    }

    public Student createStudent(Student student) {
        student.setRegistrationDate(LocalDate.now());

        if (student.getEnrollmentStatus() == null) {
            student.setEnrollmentStatus("Registered");
        }

        return repository.save(student);
    }

    public Student updateStudent(Long id, Student request) {
        Student student = getStudentById(id);

        student.setStudentCode(request.getStudentCode());
        student.setFullName(request.getFullName());
        student.setEmail(request.getEmail());
        student.setDepartment(request.getDepartment());
        student.setAcademicYear(request.getAcademicYear());
        student.setEnrollmentStatus(request.getEnrollmentStatus());

        return repository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        repository.delete(student);
    }
}
