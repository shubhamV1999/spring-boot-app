package com.pn2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pn2.beans.Address;
import com.pn2.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	
	@GetMapping("/first")
	public String firstRestApi() {
		return "This API make for managing address";
	}
	
	@GetMapping("/{id}")
	public Iterable<Address> getStudentAddressById(@PathVariable Integer id){
		return this.addressService.getAddressByStudentId(id);
	}
	
//	@GetMapping("/{vill}")
//	public Iterable<Address> getStudentAddressByVill(@PathVariable String vill){
//		return this.addressService.getAddressByStudentVill(vill);
//	}
//	
	@PostMapping
	public Address createAddress(@RequestBody Address address) {
		return this.addressService.createAddress(address);
	}
	
	@GetMapping
	public Iterable<Address> getAllAddress(){
		return this.addressService.getAllAddress();
	}

}
