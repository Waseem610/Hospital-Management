package com.te.hospitalManagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.hospitalManagement.dto.Appointment_Info;
import com.te.hospitalManagement.dto.User_Info;
import com.te.hospitalManagement.service.ServiceAppointment;
import com.te.hospitalManagement.service.ServiceImpl;

@Controller
public class MvcController {
	@Autowired
	ServiceImpl serviceImpl;
	@Autowired
	ServiceAppointment appointment;

	@GetMapping("/signUp")
	public String signUp() {
		return "home";
	}

	@GetMapping("./login")
	public String login() {
		return "login";
	}

	@GetMapping("/createAccount")
	public String create() {
		return "signUp";
	}

	@PostMapping("/register")
	public String register(User_Info info) {
		User_Info create = serviceImpl.create(info);
		if (create != null) {
			return "signUp";
		}
		return "invalid";
	}

	@PostMapping("/login")
	public String login1(String userName, String password,ModelMap map,HttpServletRequest request) {
		String login = serviceImpl.login(userName, password);
		if (login != null) {
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			if (login.equals("Admin")) {
				map.addAttribute("userName", userName);
				return "admin";
			}
			if (login.equals("Doctor")) {
				return "doctor";
			}
			if (login.equals("Receptionist")) {
				return "receptionist";
			}
		}
		return "invalid1";
	}
	@GetMapping("/delete")
	public String delete() {
		return "deleteStaff";
		
	}
	@GetMapping("/doctors")
	public String doctors(ModelMap map) {
		List<User_Info> doctors = serviceImpl.doctors();
		map.addAttribute("list", doctors);
		return "doctors";
	}
	@GetMapping("/reception")
	public String receptionists(ModelMap map) {
		List<User_Info> receptionists = serviceImpl.receptionists();
		map.addAttribute("list", receptionists);
		return "receptionists";
	}
	@GetMapping("/bookAppointment")
	public String book() {
		return "book";
	}
	@GetMapping("/deleteAppointment")
	public String cancelA() {
		return "deleteAppointment";
	}
	@PostMapping("/deleteStaff")
	public String deleteStaff(Integer userId) {
		if(serviceImpl.delete(userId)) {
			return "deleteStaff";
		}
		return "invalid";
	}
	@PostMapping("/bookAppointment")
	public String bookAppointment(Appointment_Info info) {
		Appointment_Info appointment = serviceImpl.appointment(info);
		if(appointment!=null) {
			return "book";
		}
		return "doctorsName";
	}
	
	@GetMapping("/patientList")
	public String patientList(HttpServletRequest request,ModelMap map) {
		HttpSession session = request.getSession();
		String attribute = (String)session.getAttribute("userName");
		List<Appointment_Info> appointmentList = appointment.appointmentList(attribute);
		map.addAttribute("list", appointmentList);
		return "patientList";
	}
	
	@GetMapping("/appointmentList")
	public String appointmentList(HttpServletRequest request,ModelMap map) {
		HttpSession session = request.getSession();
		String attribute = (String)session.getAttribute("userName");
		List<Appointment_Info> appointmentList = appointment.appointmentList(attribute);
		map.addAttribute("list", appointmentList);
		return "appointmentList";
	}
	@GetMapping("/edit")
	public String edit() {
		return "edit";
	}
	@PostMapping("/editAppointment")
	public String editAppointment(Appointment_Info info) {
		Appointment_Info editAppointment = appointment.editAppointment(info);
		if(editAppointment!=null) {
			return "edit";
		}
		return "invalid1";
	}
	
	@PostMapping("/deleteAppointment")
		public String delete(String contactNo) {
		Appointment_Info delete = appointment.delete(contactNo);
		if(delete!=null) {
			return "deleteAppointment";
		}
		return "invalid1";
		
	}

}
