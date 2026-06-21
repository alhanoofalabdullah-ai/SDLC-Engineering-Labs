package com.alhanoof.sdlc.waterfall.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentCode;

    private String fullName;

    @Column(unique = true)
    private String email;

    private String department;

    private String academicYear;

    private String enrollmentStatus;

    private LocalDate registrationDate;

    public Student() {
    }

    public Student(
            String studentCode,
            String fullName,
            String email,
            String department,
            String academicYear,
            String enrollmentStatus,
            LocalDate registrationDate
    ) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.email = email;
        this.department = department;
        this.academicYear = academicYear;
        this.enrollmentStatus = enrollmentStatus;
        this.registrationDate = registrationDate;
    }

    public Long getId() {
        return id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
