package com.sunjray.osdma.AMrepository;


import java.util.List;

import com.sunjray.osdma.AMmodel.RaiseRequest;
import com.sunjray.osdma.AMmodel.MasterSerProviderType;


public interface RaiseRequestDAO {
		   public List<MasterSerProviderType> fetchAllProviderType();
           public List<RaiseRequest> fetchAllServiceProviderAccountDetails(MasterSerProviderType masterSerProviderType);
           public int saveRaiseRequest(RaiseRequest AccounManager );
}
