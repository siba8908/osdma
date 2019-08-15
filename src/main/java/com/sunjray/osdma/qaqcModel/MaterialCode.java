package com.sunjray.osdma.qaqcModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;


public class MaterialCode implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Long material_code_id;
	private String product_id;
	private String component_id;
	private Integer item_id;
	private String created_date;
	private String sim_provider;
	private String phone_no;
	private String imei_no;
	private String workstatus;
	private Component component;
	private QaqcItem qaqcItem;
	public Long getMaterial_code_id() {
		return material_code_id;
	}
	public void setMaterial_code_id(Long material_code_id) {
		this.material_code_id = material_code_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getComponent_id() {
		return component_id;
	}
	public void setComponent_id(String component_id) {
		this.component_id = component_id;
	}
	
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getSim_provider() {
		return sim_provider;
	}
	public void setSim_provider(String sim_provider) {
		this.sim_provider = sim_provider;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getImei_no() {
		return imei_no;
	}
	public void setImei_no(String imei_no) {
		this.imei_no = imei_no;
	}
	public String getWorkstatus() {
		return workstatus;
	}
	public void setWorkstatus(String workstatus) {
		this.workstatus = workstatus;
	}
	public Component getComponent() {
		return component;
	}
	public void setComponent(Component component) {
		this.component = component;
	}
	public QaqcItem getQaqcItem() {
		return qaqcItem;
	}
	public void setQaqcItem(QaqcItem qaqcItem) {
		this.qaqcItem = qaqcItem;
	}

}

