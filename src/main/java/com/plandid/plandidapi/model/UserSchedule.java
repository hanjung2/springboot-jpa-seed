package com.plandid.plandidapi.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "user_schedule")
@Data
public class UserSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String emailAddress;
	
}
