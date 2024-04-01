package com.pn2.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address_tbl")
public class Address {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "id")
	private Integer addressId;
	
	private String village;
	private String post;
	private String dist;
	private Long pincode;
	private Integer sId;
	
	public Address() {
		super();
	}
	
	public Address(Integer addressId, String village, String post, String dist, Long pincode, Integer sId) {
		super();
		this.addressId = addressId;
		this.village = village;
		this.post = post;
		this.dist = dist;
		this.pincode = pincode;
		this.sId = sId;
	}



	public Address(Integer addressId, String village, String post, String dist, Long pincode) {
		super();
		this.addressId = addressId;
		this.village = village;
		this.post = post;
		this.dist = dist;
		this.pincode = pincode;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	@Override
	public String toString() {
		return "addressId=" + addressId + ", village=" + village + ", post=" + post + ", dist=" + dist
				+ ", pincode=" + pincode + ", sId=" + sId ;
	}
	
	
}
