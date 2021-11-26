package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@Table(name = "STUDENT_REG_TBL")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@SequenceGenerator(name = "s_id_seq", sequenceName = "student_seq", allocationSize = 1)
	@GeneratedValue(generator = "s_id_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "Student_ID")
	private Integer studentId;
	@Column(name = "Student_Name")
	@NonNull
	private String studentName;
	@Column(name = "Student_Email")
	@NonNull
	private String studentEmail;
	@Column(name = "Student_Mobile")
	@NonNull
	private Long studentMobile;

	@Column(name = "Student_Gender")
	@NonNull
	private String studentGender;

	@Column(name = "Student_Slctd_Course")
	@NonNull
	private String studentSlctdCourse;
	@Column(name = "student_Slctd_Timing")
	@NonNull
	private String[] studentSlctdTiming;

}
