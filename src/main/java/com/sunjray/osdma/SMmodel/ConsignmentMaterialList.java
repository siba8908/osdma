package com.sunjray.osdma.SMmodel;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ConsignmentMaterialList generated by Smruti
 */
@Entity
@Table(name = "t_os_am_consignment_materiallist", catalog = "osdma")
public class ConsignmentMaterialList implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer materialId;
	private ConsingementTrackC2p consingementTrackC2p;
	private String itemName;
	private String serialNo;
	private Integer quantity;
	private Integer createdBy;
	private Date createdOn;
	private Integer modifyBy;
	private Date modifyOn;
	

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "material_id", unique = true, nullable = false)
	public Integer getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "consinment_id")
	public ConsingementTrackC2p getConsingementTrackC2p() {
		return this.consingementTrackC2p;
	}

	public void setConsingementTrackC2p(ConsingementTrackC2p consingementTrackC2p) {
		this.consingementTrackC2p = consingementTrackC2p;
	}

	@Column(name = "item_name", length = 45)
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Column(name = "serial_no", length = 45)
	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", length = 19)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "modify_by")
	public Integer getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_on", length = 19)
	public Date getModifyOn() {
		return this.modifyOn;
	}

	public void setModifyOn(Date modifyOn) {
		this.modifyOn = modifyOn;
	}

	

}
