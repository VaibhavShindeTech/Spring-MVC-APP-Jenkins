package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {
	@Query(value = "select course_name from course_dtls",nativeQuery = true)
	public List<String> getCourseNames();
}
