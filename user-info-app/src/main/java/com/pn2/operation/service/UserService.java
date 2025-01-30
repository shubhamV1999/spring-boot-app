package com.pn2.operation.service;

import java.util.List;

import com.pn2.operation.bean.UserDetail;

public interface UserService {
	
	public List<UserDetail> fetchAllUserDetails();
	public UserDetail fetchUserbyId(int userId);
	public UserDetail addUserDetail(UserDetail userDetail);
	public void deleteUserdetailById(int userId);

}
