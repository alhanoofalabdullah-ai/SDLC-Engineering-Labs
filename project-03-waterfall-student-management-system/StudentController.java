package com.alhanoof.sdlc.waterfall.controller;

import com.alhanoof.sdlc.waterfall.entity.Student;
import com.alhanoof.sdlc.waterfall.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @GetMapping("/department/{department}")
    public List<Student> getStudentsByDepartment(@PathVariable String department) {
        return service.getStudentsByDepartment(department);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable Long id,
            @RequestBody Student student
    ) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}
