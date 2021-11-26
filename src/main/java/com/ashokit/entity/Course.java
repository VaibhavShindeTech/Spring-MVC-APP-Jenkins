package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Table(name = "COURSE_DTLS")
@Entity
public class Course {
	@Column(name = "COURSE_ID")
	@GenericGenerator(name = "course_id_gen", strategy = "com.ashokit.generator.CourseGenerator")
	@GeneratedValue(generator = "course_id_gen")
	@Id
	private String courseId;
	@Column(name = "COURSE_NAME")
	private String courseName;
}
