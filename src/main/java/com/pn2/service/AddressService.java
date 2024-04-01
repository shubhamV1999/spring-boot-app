package com.pn2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pn2.beans.Address;
import com.pn2.dao.AddressDao;

@Service
public class AddressService {
	
	@Autowired
	private AddressDao addressDao;
	
	public Address createAddress(Address address) {
		return this.addressDao.save(address);
	}
	
	public Iterable<Address> getAllAddress(){
		return this.addressDao.findAll();
	}
	
	public Iterable<Address> getAddressByStudentId(Integer id){
		return this.addressDao.findBySId(id);
	}
}
