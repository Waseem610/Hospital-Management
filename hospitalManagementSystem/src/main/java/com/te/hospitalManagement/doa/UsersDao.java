package com.te.hospitalManagement.doa;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.te.hospitalManagement.dto.User_Info;
@Repository
public interface UsersDao extends JpaRepository<User_Info, Integer> {
	
	@Query(value = "from User_Info where userName=?1")
	public User_Info findByName(String userName);
	
	@Query(value = "from User_Info where designation='Doctor'")
	public List<User_Info> doctors();
	
	@Query(value = "from User_Info where designation='Receptionist'")
	public List<User_Info> receptionists();
}
