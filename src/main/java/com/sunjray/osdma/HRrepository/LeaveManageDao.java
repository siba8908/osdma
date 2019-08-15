package com.sunjray.osdma.HRrepository;


import com.sunjray.osdma.HRmodel.LeaveManagement;

/*import com.sunjray.osdma.model.HolidayList;
import com.sunjray.osdma.model.LeaveManagement;
import com.sunjray.osdma.model.QAQCMaterialCod;
*/

	public interface LeaveManageDao {


		// public int insert(ClinicalChart chart);

	public int save(LeaveManagement leaveManagement);

	public Iterable<LeaveManagement> findAllLeave();

	

		

	}

