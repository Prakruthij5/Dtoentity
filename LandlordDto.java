package com.cg.ofr.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.entities.User;

@Component
@Entity
@Table(name="landlord")
public class LandlordDto extends UserDto{
	
	private int landlordId;
	@Column
	@NotEmpty(message = "Landlord name is required")
	private String landlordName;
	
	@Column
	@NotBlank
	private int  landlordAge;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="landlordFlat")
	private List<FlatDto> flatList=null;
	
	public LandlordDto() {}
	public LandlordDto(int landlordId, String landlordName, int landlordAge, List<FlatDto> flatList) {
		super();
		this.landlordId = landlordId;
		this.landlordName = landlordName;
		this.landlordAge = landlordAge;
		this.flatList = flatList;
	}
	public int getLandlordId() {
		return landlordId;
	}
	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}
	public String getLandlordName() {
		return landlordName;
	}
	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}
	public int getLandlordAge() {
		return landlordAge;
	}
	public void setLandlordAge(int landlordAge) {
		this.landlordAge = landlordAge;
	}
	public List<FlatDto> getFlatList() {
		return flatList;
	}
	public void setFlatList(List<FlatDto> flatList) {
		this.flatList = flatList;
	}
	@Override
	public String toString() {
		return "LandlordDto [landlordId=" + landlordId + ", landlordName=" + landlordName + ", landlordAge="
				+ landlordAge + ", flatList=" + flatList + "]";
	}
	
	
	

}
