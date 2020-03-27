/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classphoto2.classphoto2.repository;

import com.classphoto2.classphoto2.model.Users;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<Users,Integer>{

    public Users findByEmail(String email);
	 Users findUByEmail(String email);
	 Users findByResetToken(String resetToken);
    @Query("SELECT u FROM Users u WHERE u.username = :username")
    public Users findByUsername(@Param("username") String username);

   
    
}
