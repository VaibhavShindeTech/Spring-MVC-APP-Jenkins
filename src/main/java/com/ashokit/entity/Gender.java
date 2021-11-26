package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="GENDER_DTLS")
public class Gender {
	@Id
	@GenericGenerator(name = "gender_id_gen",strategy = "com.ashokit.generator.GenderGenerator")
	@GeneratedValue(generator ="gender_id_gen")
	@Column(name = "GENDER_ID")
	private String genderId;
	@Column(name = "GENDER_NAME")
	private String genderName;
}
