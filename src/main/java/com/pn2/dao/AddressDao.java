package com.pn2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pn2.beans.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {
	
	List<Address> findBySId(int id);

}
