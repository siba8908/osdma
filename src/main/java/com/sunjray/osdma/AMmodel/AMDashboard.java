package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class AMDashboard  implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date date;	
	private Long raisedFor;
	private String siteCode;	
	private String typeOfWork;	
	private Double amountRequested;	
	private String purpose;	
	private Double approvedAmount;	
	private String remark;
	private String transactionId;
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public Long getRaisedFor() {
    return raisedFor;
  }
  public void setRaisedFor(Long raisedFor) {
    this.raisedFor = raisedFor;
  }
  public String getSiteCode() {
    return siteCode;
  }
  public void setSiteCode(String siteCode) {
    this.siteCode = siteCode;
  }
  public String getTypeOfWork() {
    return typeOfWork;
  }
  public void setTypeOfWork(String typeOfWork) {
    this.typeOfWork = typeOfWork;
  }
  public Double getAmountRequested() {
    return amountRequested;
  }
  public void setAmountRequested(Double amountRequested) {
    this.amountRequested = amountRequested;
  }
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }
  public Double getApprovedAmount() {
    return approvedAmount;
  }
  public void setApprovedAmount(Double approvedAmount) {
    this.approvedAmount = approvedAmount;
  }
  public String getRemark() {
    return remark;
  }
  public void setRemark(String remark) {
    this.remark = remark;
  }
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
	
	
	
}
