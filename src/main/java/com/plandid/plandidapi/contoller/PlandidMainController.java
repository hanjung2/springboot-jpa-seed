package com.plandid.plandidapi.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.plandid.plandidapi.model.UserSchedule;
import com.plandid.plandidapi.model.UserScheduleRepository;

@RestController
public class PlandidMainController {
	@Autowired
	private UserScheduleRepository userScheduleRepository;
	
	@GetMapping("/userschedule/{firstName}")
	public List<UserSchedule> getGreeting(@PathVariable("firstName") String firstName) {
		return userScheduleRepository.findByFirstName(firstName);
	}
	
	@PostMapping("/addSchedule")
	public ResponseEntity<UserSchedule> addUserSchedule(@RequestBody UserSchedule userSchedule) {
		try {
			UserSchedule _userSchedule = userScheduleRepository
					.save(new UserSchedule());
			return new ResponseEntity<>(_userSchedule, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
