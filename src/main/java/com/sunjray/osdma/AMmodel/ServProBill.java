package com.sunjray.osdma.AMmodel;

import java.util.Date;

public class ServProBill {
	private Integer billId;
	private String billNo;
	private Integer providerId;
	private Double billAmount;
	private Date billDate;
	
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public Integer getProviderId() {
		return providerId;
	}
	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}
	public Double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Integer getSiteCodeId() {
		return siteCodeId;
	}
	public void setSiteCodeId(Integer siteCodeId) {
		this.siteCodeId = siteCodeId;
	}
	private Date paymentDate;
	private Integer createdBy;
	private Integer siteCodeId;
	

}
