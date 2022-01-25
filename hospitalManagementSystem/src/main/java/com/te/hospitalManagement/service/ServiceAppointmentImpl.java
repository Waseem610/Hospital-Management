package com.te.hospitalManagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.hospitalManagement.doa.AppointmentDao;
import com.te.hospitalManagement.dto.Appointment_Info;
import com.te.hospitalManagement.dto.User_Info;

@Service
@Transactional
public class ServiceAppointmentImpl implements ServiceAppointment {
	@Autowired
	AppointmentDao dao;
	@Autowired
	ServiceImpl impl;

	@Override
	public List<Appointment_Info> appointmentList(String name) {
		List<Appointment_Info> findByDoctorsName = dao.findByDoctorsName(name);
		return findByDoctorsName;
	}

	@Override
	public Appointment_Info editAppointment(Appointment_Info info) {
		String empty = "";
		int id = info.getId();
		Appointment_Info findbyId = dao.findId(id);
		if (findbyId != null) {
			if (info.getContactNo() != empty) {
				findbyId.setContactNo(info.getContactNo());
			}
			if (info.getDate() != empty) {
				findbyId.setDate(info.getDate());
			}
			if (info.getPatientName() != empty) {
				findbyId.setPatientName(info.getPatientName());
			}
			if (info.getDoctor() != empty) {
				
				try {
				 User_Info findByName = impl.findByName(info.getDoctor());
				 findbyId.setDoctor(info.getDoctor());
				}catch (Exception e) {
					return null;
				}
			}
			return findbyId;
		}
		return null;
	}

	@Override
	public Appointment_Info delete(String contactNo) {
		try {
		Appointment_Info deleteByContact = dao.deleteByContact(contactNo);
			int id = deleteByContact.getId();
			dao.deleteById(id);
			return deleteByContact;
		}catch (Exception e) {
			return null;
		}
	}
	
}
