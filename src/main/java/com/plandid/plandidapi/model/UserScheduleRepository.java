package com.plandid.plandidapi.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserScheduleRepository extends JpaRepository<UserSchedule, Long>{
	List<UserSchedule> findByFirstName(String firstName);
	List<UserSchedule> findByLastName(String lastName);
}
