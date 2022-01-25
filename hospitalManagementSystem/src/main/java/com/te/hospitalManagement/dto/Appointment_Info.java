package com.te.hospitalManagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Appointment_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String patientName;
	private String  doctor;
	private String contactNo;
	private String date;
}
