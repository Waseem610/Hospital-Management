package com.te.hospitalManagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String designation;
	private String password;
	private long contactNumber;
}
