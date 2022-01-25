package com.te.hospitalManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.hospitalManagement.doa.AppointmentDao;
import com.te.hospitalManagement.doa.UsersDao;
import com.te.hospitalManagement.dto.Appointment_Info;
import com.te.hospitalManagement.dto.User_Info;

@Service
public class ServiceImpl implements ServiceL {
	@Autowired
	UsersDao dao;
	@Autowired
	AppointmentDao dao2;

	@Override
	public User_Info create(User_Info info) {
		String userName = info.getUserName();
		User_Info findByName = findByName(userName);
		if (findByName == null) {
			User_Info save = dao.save(info);
			return save;
		}
		return null;
	}

	@Override
	public User_Info findByName(String name) {
		try {
			User_Info findByName = dao.findByName(name);
			return findByName;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public String login(String userName, String password) {
		try {
			User_Info findByName = dao.findByName(userName);
			if (password.equals(findByName.getPassword())) {
				return findByName.getDesignation();
			}
			return null;
		} catch (Exception e) {

			return null;

		}

	}

	@Override
	public List<User_Info> doctors() {
		List<User_Info> doctors = dao.doctors();
		return doctors;
	}

	@Override
	public List<User_Info> receptionists() {
		List<User_Info> receptionists = dao.receptionists();
		return receptionists;
	}

	@Override
	public boolean delete(Integer number) {
		try {
			dao.deleteById(number);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Appointment_Info appointment(Appointment_Info info) {
		try {
			User_Info findByName = dao.findByName(info.getDoctor());
			String designation = findByName.getDesignation();
			if (designation.equals("Doctor")) {
				Appointment_Info save = dao2.save(info);
				return save;
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}

}
