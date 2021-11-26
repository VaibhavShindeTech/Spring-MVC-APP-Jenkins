package com.ashokit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.Timing;
import com.ashokit.service.StudentService;

@RestController
@RequestMapping(value = "/time")
public class TimingRestController {
	@Autowired
	private StudentService studentService;
	@PostMapping(value = "/save",consumes = "application/json")
	public String InsertTiming(@RequestBody Timing timing) {
		studentService.InsertTimingService(timing);
		return "Timing got inserted";
	}

}
