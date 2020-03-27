package com.classphoto2.classphoto2.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.classphoto2.classphoto2.model.Admins;
import com.classphoto2.classphoto2.model.Photographers;
import com.classphoto2.classphoto2.model.Users;

public interface AdminRepository extends CrudRepository<Users,Integer>{

	void save(Admins ad);
	 @Query("SELECT u FROM Admins u WHERE u.email= ?1")
	 Admins findByEmail(String email);


}
