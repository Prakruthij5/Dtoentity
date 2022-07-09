package com.cg.ofr.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.entities.Tenant;

@Component
@Entity

@Table(name="flat_booking")
public class FlatBookingDto extends FlatDto{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int	bookingNo;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="flat_FlatBooking")
	private Flat flat;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="tenant_FlatBooking")
	private Tenant tenant;
	
	@Column
	@NotNull
	private LocalDate bookingFromDate;
	
	@Column
	@NotNull
	private LocalDate bookingToDate;
	
	
	public FlatBookingDto() {}
	public FlatBookingDto(int bookingNo, Flat flat, Tenant tenant, LocalDate bookingFromDate, LocalDate bookingToDate) {
		super();
		this.bookingNo = bookingNo;
		this.flat = flat;
		this.tenant = tenant;
		this.bookingFromDate = bookingFromDate;
		this.bookingToDate = bookingToDate;
	}
	public int getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}
	public Flat getFlat() {
		return flat;
	}
	public void setFlat(Flat flat) {
		this.flat = flat;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public LocalDate getBookingFromDate() {
		return bookingFromDate;
	}
	public void setBookingFromDate(LocalDate bookingFromDate) {
		this.bookingFromDate = bookingFromDate;
	}
	public LocalDate getBookingToDate() {
		return bookingToDate;
	}
	public void setBookingToDate(LocalDate bookingToDate) {
		this.bookingToDate = bookingToDate;
	}
	
	@Override
	public String toString() {
		return "FlatBookingDto [bookingNo=" + bookingNo + ", flat=" + flat + ", tenant=" + tenant + ", bookingFromDate="
				+ bookingFromDate + ", bookingToDate=" + bookingToDate + "]";
	}
	
	
	

}
