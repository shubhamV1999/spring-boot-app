package com.pn2.operation.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pn2.operation.bean.UserDetail;
import com.pn2.operation.dao.UserDao;
import com.pn2.operation.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public List<UserDetail> fetchAllUserDetails() {
		
		return userDao.findAll();
	}

	@Override
	public UserDetail fetchUserbyId(int userId) {
		
		return userDao.findById(userId).orElse(null);
	}

	@Override
	public UserDetail addUserDetail(UserDetail userDetail) {
		
		return userDao.save(userDetail);
	}

	@Override
	public void deleteUserdetailById(int userId) {
		userDao.deleteById(userId);
	}

}
