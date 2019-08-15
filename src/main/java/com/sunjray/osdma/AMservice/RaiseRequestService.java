package com.sunjray.osdma.AMservice;



import java.util.List;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.MasterSerProviderType;

public interface RaiseRequestService {
	public List<MasterSerProviderType> getAllProviderType();
	 public List<RaiseRequest> getAllServiceProviderAccountDetails(MasterSerProviderType masterSerProviderType);
	 public String saveRaiseRequest(RaiseRequest AccounManager );
}
