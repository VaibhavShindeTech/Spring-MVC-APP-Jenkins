package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.Gender;

public interface GenderRepository extends JpaRepository<Gender, Serializable> {
	// List<ProjectgGenderName> findAllByGenderNames();
	@Query(value = "select gender_name from gender_dtls", nativeQuery = true)
	public List<String> getGenderNames();
}
