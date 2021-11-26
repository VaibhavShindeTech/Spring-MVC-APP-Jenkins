package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.Timing;

public interface TimingRepository extends JpaRepository<Timing, Serializable> {
	@Query(value = "select timing_name from timings_dtls",nativeQuery = true)
	public List<String> getTimingNames();
}
