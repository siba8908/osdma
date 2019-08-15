package com.sunjray.osdma.AMservice;

import java.util.List;
import com.sunjray.osdma.AMmodel.AMDashboard;
public interface AMDashboardService {
	List<AMDashboard> getAllDetails();
	int paydashboard(AMDashboard d);
}
