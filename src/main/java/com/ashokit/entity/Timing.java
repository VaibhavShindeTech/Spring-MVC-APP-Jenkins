package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Table(name = "TIMINGS_DTLS")
@Entity
public class Timing {
	@Id
	@GenericGenerator(name = "timing_id_gen", strategy = "com.ashokit.generator.TimingGenerator")
	@GeneratedValue(generator = "timing_id_gen")
	@Column(name = "TIMING_ID")
	private String timingId;
	@Column(name = "TIMING_NAME")
	private String timingName;
}
