package net.pafgroup.sellnbuygroup.models;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seller {
    private Long id;
    private String fname;
    private String sname;
    private String phoneNumber;
    private String address;
    private String email;
    private Date joinedDate;
    
    public Seller() {
    	super();
    }
    
	public Seller(Long id, String fname, String sname, String phoneNumber, String address, String email,
			Date joinedDate) {
		super();
		this.id = id;
		this.fname = fname;
		this.sname = sname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.joinedDate = joinedDate;
	}

	public Seller(String fname, String sname, String phoneNumber, String address, String email,
			Date joinedDate) {
		super();
		this.fname = fname;
		this.sname = sname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.joinedDate = joinedDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

}