package com.sunjray.osdma.AMmodel;

import lombok.Data;

@Data
public class ProPersonalDtls {

	private Integer providerId;
	private String providerName;
	private Integer serviceTypeId;
	
	
  public Integer getProviderId() {
    return providerId;
  }
  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }
  public String getProviderName() {
    return providerName;
  }
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }
  public Integer getServiceTypeId() {
    return serviceTypeId;
  }
  public void setServiceTypeId(Integer serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
  }
	
}
