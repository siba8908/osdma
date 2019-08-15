package com.sunjray.osdma.qaqcModel;

import java.io.Serializable;

public class Component implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3757249934440522139L;
	
	private Integer component_id;
	private String component_name;
	private String quantity;
	private Integer product_id;
	public Integer getComponent_id() {
		return component_id;
	}
	public void setComponent_id(Integer component_id) {
		this.component_id = component_id;
	}
	public String getComponent_name() {
		return component_name;
	}
	public void setComponent_name(String component_name) {
		this.component_name = component_name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	
	

}
