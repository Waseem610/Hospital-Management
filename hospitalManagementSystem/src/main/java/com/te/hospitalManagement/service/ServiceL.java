package com.te.hospitalManagement.service;

import java.util.List;

import com.te.hospitalManagement.dto.Appointment_Info;
import com.te.hospitalManagement.dto.User_Info;

public interface ServiceL {
	public User_Info create(User_Info info);
	public User_Info findByName(String name);
	public String login(String userName, String password);
	public List<User_Info> doctors();
	public List<User_Info> receptionists();
	public boolean delete(Integer number);
	public Appointment_Info appointment(Appointment_Info info);
		
	
}
