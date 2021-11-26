package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ashokit.entity.Student;
import com.ashokit.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping(value = { "/", "/loadForm" })
	public String loadForm(Student student, Model model) {
		List<String> allCourses = studentService.getAllCourses();
		List<String> allGenders = studentService.getAllGenders();
		List<String> allTimings = studentService.getAllTimings();

		model.addAttribute("genders", allGenders);
		model.addAttribute("courses", allCourses);
		model.addAttribute("timings", allTimings);

		return "studentRegistration";
	}

	@PostMapping(value = "/saveStudent")
	public String saveStudent(Student student, Model model) {
		studentService.saveStudentService(student);
		model.addAttribute("name", student.getStudentName());
		return "success";
	}
}
