package com.pn2.operation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pn2.operation.bean.UserDetail;

@Repository
public interface UserDao extends JpaRepository<UserDetail, Integer>{
	
	

}
