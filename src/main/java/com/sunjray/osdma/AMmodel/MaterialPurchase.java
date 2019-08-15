package com.sunjray.osdma.AMmodel;

import java.io.Serializable;

public class MaterialPurchase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3281287037443179314L;
	
	private Integer material_id;
	private String item_name;
	private String serial_no;
	private Integer quantity;
	private Integer consinment_id;
	public Integer getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(Integer material_id) {
		this.material_id = material_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getConsinment_id() {
		return consinment_id;
	}
	public void setConsinment_id(Integer consinment_id) {
		this.consinment_id = consinment_id;
	}


}
