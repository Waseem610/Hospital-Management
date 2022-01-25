package com.te.hospitalManagement.service;

import java.util.List;

import com.te.hospitalManagement.dto.Appointment_Info;

public interface ServiceAppointment {
public List<Appointment_Info> appointmentList(String name);
public Appointment_Info editAppointment(Appointment_Info info);
public Appointment_Info delete(String contactNo);

}
