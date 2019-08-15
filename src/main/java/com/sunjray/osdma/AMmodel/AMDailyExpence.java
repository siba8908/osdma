package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class AMDailyExpence implements Serializable {

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private String transactionId;
	private Double amount;
	private String accountHead; 
	private String transctionPurpose; 
	private String paymentType; 
	private String bankTransId; 
	private String remarks; 
	private Date transactionDate;
	private String cashFlow;
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  public String getAccountHead() {
    return accountHead;
  }
  public void setAccountHead(String accountHead) {
    this.accountHead = accountHead;
  }
  public String getTransctionPurpose() {
    return transctionPurpose;
  }
  public void setTransctionPurpose(String transctionPurpose) {
    this.transctionPurpose = transctionPurpose;
  }
  public String getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }
  public String getBankTransId() {
    return bankTransId;
  }
  public void setBankTransId(String bankTransId) {
    this.bankTransId = bankTransId;
  }
  public String getRemarks() {
    return remarks;
  }
  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }
  public Date getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }
  public String getCashFlow() {
    return cashFlow;
  }
  public void setCashFlow(String cashFlow) {
    this.cashFlow = cashFlow;
  }
  public static long getSerialversionuid() {
    return serialVersionUID;
  }
	
	
	
	
}
