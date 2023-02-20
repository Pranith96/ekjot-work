package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String saveStudent(Student student) {
		Student response = studentRepository.save(student);
		if (response == null) {
			return "Data is not saved";
		}
		return "Data is saved successfully";
	}

	@Override
	public List<Student> getAllStudentDetails() {
		List<Student> response = studentRepository.findAll();
		if (response == null || response.isEmpty()) {
			throw new RuntimeException("data is empty");
		}
		return response;
	}

	@Override
	public Student getStudentDetails(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if(!response.isPresent()) {
			throw new RuntimeException("data is not found");
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentDetailsByName(String name) {
		List<Student> response = studentRepository.findByName(name);
		if (response == null || response.isEmpty()) {
			throw new RuntimeException("data is not found for given name");
		}
		return response;	
	}

	@Override
	public Student getStudentDetailsLogin(String loginId, String password) {
		Optional<Student> response = studentRepository.findByLoginIdAndPassword(loginId,password);
		if(!response.isPresent()) {
			throw new RuntimeException("data is not found");
		}
		return response.get();
	}

}
