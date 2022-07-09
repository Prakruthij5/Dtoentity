package com.cg.ofr.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Entity
@Component
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="users")
public class UserDto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	@Column
	@NotEmpty(message="username should not be empty")
	private String userName;
	
	@Column
	@Pattern(regexp = "[a-zA-Z0-9]+", message = "must not contain special characters")
	private String password;
	
	@Column
	private String userType;
	
	
	public UserDto() {}
	public UserDto(int userId, String userName, String password, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userType="
				+ userType + "]";
	}
	
	

}
