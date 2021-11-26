package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Course;
import com.ashokit.entity.Gender;
import com.ashokit.entity.Student;
import com.ashokit.entity.Timing;
import com.ashokit.repository.CourseRepository;
import com.ashokit.repository.GenderRepository;
import com.ashokit.repository.StudentRepository;
import com.ashokit.repository.TimingRepository;

@Service
public class StudentService {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private GenderRepository genderRepository;
	@Autowired
	private TimingRepository timingRepository;
	@Autowired
	private StudentRepository studentRepository;
	public List<String> getAllGenders() {
		// return genderRepository.findAll();
		// List<ProjectgGenderName> genderNames =
		// genderRepository.findAllByGenderNames();
		return genderRepository.getGenderNames();
	}

	public List<String> getAllCourses() {
		return courseRepository.getCourseNames();
	}

	public List<String> getAllTimings() {
		return timingRepository.getTimingNames();
	}

	public void saveStudentService(Student student) {
		studentRepository.save(student);
	}

	public void InsertTimingService(Timing timing) {
		timingRepository.save(timing);

	}

	public void InsertCourseService(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}

	public void InsertGenderService(Gender gender) {
		// TODO Auto-generated method stub
		genderRepository.save(gender);
	}
}
