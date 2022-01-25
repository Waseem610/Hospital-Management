package com.te.hospitalManagement.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.te.hospitalManagement.dto.Appointment_Info;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment_Info, Integer> {
	@Query(value = "from  Appointment_Info where doctor=?1")
	public List<Appointment_Info> findByDoctorsName(String userName);
	@Query(value = "from Appointment_Info where id=?1")
	public Appointment_Info findId(Integer id);
	@Query(value = "from Appointment_Info where contactNo=?1")
	public Appointment_Info deleteByContact(String contactNo);
}
