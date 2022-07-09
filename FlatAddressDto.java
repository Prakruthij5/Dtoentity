package com.cg.ofr.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="flat_address")
public class FlatAddressDto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int houseNo;
	
	@Column(name="street")
	@NotEmpty
	private String street;
	
	@Column(name="city")
	@NotEmpty
	private String city;
	
	@Column(name="state")
	@NotEmpty
	private String state;
	
	@Column(name="pin")
	@NotNull
	private int pin;
	
	@Column(name="country")
	@NotEmpty
	private String country;
		
		public FlatAddressDto() {}
		public FlatAddressDto(int houseNo, String street, String city, String state, int pin, String country) {
			super();
			this.houseNo = houseNo;
			this.street = street;
			this.city = city;
			this.state = state;
			this.pin = pin;
			this.country = country;
		}
		public int getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(int houseNo) {
			this.houseNo = houseNo;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		@Override
		public String toString() {
			return "FlatAddressDTO [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state=" + state
					+ ", pin=" + pin + ", country=" + country + "]";
		}
		
		
		
	}


