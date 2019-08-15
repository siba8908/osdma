package com.sunjray.osdma.AMmodel;

import lombok.Data;

@Data
public class PmFundRequest {
	
	private String purpose;

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  } 
	

}
