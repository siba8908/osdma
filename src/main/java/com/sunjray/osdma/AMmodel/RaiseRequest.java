package com.sunjray.osdma.AMmodel;

import java.io.Serializable;

import lombok.Data;

@Data
public class RaiseRequest implements Serializable{
	private static final long serialVersionUID = 6589129842329530954L;
	private ProPersonalDtls proPersonalDtls;
	private ServProBill servProBill;
	private SiteCode siteCode;
	private PmFundRequest pmFundRequest;
  public ProPersonalDtls getProPersonalDtls() {
    return proPersonalDtls;
  }
  public void setProPersonalDtls(ProPersonalDtls proPersonalDtls) {
    this.proPersonalDtls = proPersonalDtls;
  }
  public ServProBill getServProBill() {
    return servProBill;
  }
  public void setServProBill(ServProBill servProBill) {
    this.servProBill = servProBill;
  }
  public SiteCode getSiteCode() {
    return siteCode;
  }
  public void setSiteCode(SiteCode siteCode) {
    this.siteCode = siteCode;
  }
  public PmFundRequest getPmFundRequest() {
    return pmFundRequest;
  }
  public void setPmFundRequest(PmFundRequest pmFundRequest) {
    this.pmFundRequest = pmFundRequest;
  }
  
}
