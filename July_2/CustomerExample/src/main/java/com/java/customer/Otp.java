package com.java.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="otp")
public class Otp {

	@Id
	@Column(name="otpId")
	private int otpId;
	@Column(name="custId")
	private int custId;
	@Column(name="otpCode")
	private String otpCode;
	@Column(name="otpPurpose")
	private String otpPurpose;
	@Column(name="otpStatus")
	private String otpStatus;
	
	public int getOtpId() {
		return otpId;
	}
	public void setOtpId(int otpId) {
		this.otpId = otpId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getOtpCode() {
		return otpCode;
	}
	public void setOtpCode(String otpCode) {
		this.otpCode = otpCode;
	}
	public String getOtpPurpose() {
		return otpPurpose;
	}
	public void setOtpPurpose(String otpPurpose) {
		this.otpPurpose = otpPurpose;
	}
	public String getOtpStatus() {
		return otpStatus;
	}
	public void setOtpStatus(String otpStatus) {
		this.otpStatus = otpStatus;
	}
	public Otp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Otp(int otpId, int custId, String otpCode, String otpPurpose, String otpStatus) {
		this.otpId = otpId;
		this.custId = custId;
		this.otpCode = otpCode;
		this.otpPurpose = otpPurpose;
		this.otpStatus = otpStatus;
	}
}
