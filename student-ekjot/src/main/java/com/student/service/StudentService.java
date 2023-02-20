package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	String saveStudent(Student student);

	List<Student> getAllStudentDetails();

	Student getStudentDetails(Integer studentId);

	List<Student> getStudentDetailsByName(String name);

	Student getStudentDetailsLogin(String loginId, String password);

}
