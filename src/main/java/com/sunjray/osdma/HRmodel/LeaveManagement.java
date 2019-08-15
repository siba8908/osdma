package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class LeaveManagement implements Serializable  {
		
	private static final long serialVersionUID = 1L;
		
		private String emp_code;
	
		private String from_date;
	
	    private String to_date;
			
		private String leave_type;

    public String getEmp_code() {
      return emp_code;
    }

    public void setEmp_code(String emp_code) {
      this.emp_code = emp_code;
    }

    public String getFrom_date() {
      return from_date;
    }

    public void setFrom_date(String from_date) {
      this.from_date = from_date;
    }

    public String getTo_date() {
      return to_date;
    }

    public void setTo_date(String to_date) {
      this.to_date = to_date;
    }

    public String getLeave_type() {
      return leave_type;
    }

    public void setLeave_type(String leave_type) {
      this.leave_type = leave_type;
    }
		
				

}
