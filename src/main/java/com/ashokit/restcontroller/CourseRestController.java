package com.ashokit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.Course;
import com.ashokit.service.StudentService;

@RestController
@RequestMapping(value = "/course")
public class CourseRestController {
	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/save",consumes = "application/json")
	public String InsertCourse(@RequestBody Course course) {
		studentService.InsertCourseService(course);
		return "Course get inserted";
	}
}
