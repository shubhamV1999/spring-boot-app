package com.pn2.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pn2.operation.bean.UserDetail;
import com.pn2.operation.service.UserService;

import jakarta.annotation.PostConstruct;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<UserDetail> fetchAllUser(){
		
		return userService.fetchAllUserDetails();
		
	}
	
	@PostMapping("/")
	public UserDetail insertUser(@RequestBody UserDetail userDetail) {
		return userService.addUserDetail(userDetail);
	}
	
	@GetMapping("/{id}")
	public UserDetail fetchUserBy(@PathVariable int id){
		
		return userService.fetchUserbyId(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserBy(@PathVariable int id){
		
		userService.deleteUserdetailById(id);
	}
	
}
