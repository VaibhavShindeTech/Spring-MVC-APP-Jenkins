package com.ashokit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.Gender;
import com.ashokit.service.StudentService;

@RestController
@RequestMapping(value = "/gender")
public class GenderRestController {
	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/save",consumes = "application/json")
	public String InsertGender(@RequestBody Gender gender) {
		studentService.InsertGenderService(gender);
		return "Gender get inserted";
	}
}
