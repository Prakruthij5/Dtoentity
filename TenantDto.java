package com.cg.ofr.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

import com.cg.ofr.entities.FlatAddress;
import com.cg.ofr.entities.User;

@Component
@Entity
@Table(name="tenant")

public class TenantDto extends UserDto{
	   
		private int tenant_id;
	    
	    @Column(name="age")
		@NotBlank
		private int age;
		
	    @OneToOne(cascade=CascadeType.ALL)
		@JoinTable(name="tenantFlat")
		private FlatAddress taddress;
		
		

		public TenantDto() {}
		public TenantDto(int tenant_id, int age, FlatAddress taddress) {
			super();
			this.tenant_id = tenant_id;
			this.age = age;
			this.taddress = taddress;
		}

		public int getTenant_id() {
			return tenant_id;
		}

		public void setTenant_id(int tenant_id) {
			this.tenant_id = tenant_id;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public FlatAddress getTaddress() {
			return taddress;
		}

		public void setTaddress(FlatAddress taddress) {
			this.taddress = taddress;
		}
		@Override
		public String toString() {
			return "TenantDTO [tenant_id=" + tenant_id + ", age=" + age + ", taddress=" + taddress + "]";
		}
		
		

}
