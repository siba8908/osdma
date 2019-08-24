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

/**
 * TOsAmConsignmentLogistic generated by Smruti
 */
@Entity
@Table(name = "t_os_am_consignment_logistic", catalog = "osdma")
public class ConsignmentLogistic implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "log_asignment_id", unique = true, nullable = false)
	private Long logAsignmentId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "consignment_id")
	private ConsingementTrackC2p consingementTrackC2p;

	@Column(name = "logistic_id")
	private Long logisticId;

	@Column(name = "vechile_no", length = 45)
	private String vechileNo;

	@Column(name = "lr_no", length = 45)
	private String lrNo;

	@Column(name = "eway_bil_no", length = 45)
	private String ewayBilNo;

	@Column(name = "exp_arrival", length = 19)
	private Date expArrival;

	@Column(name = "pickup_date", length = 19)
	private Date pickupDate;

	@Column(name = "status", length = 20)
	private String status;

	@Column(name = "actual_arrival", length = 19)
	private Date actualArrival;

	@Column(name = "updated_on", length = 19)
	private Date updatedOn;

	@Column(name = "created_on", length = 19)
	private Date createdOn;

	@Column(name = "created_by", length = 45)
	private String createdBy;

	public Long getLogAsignmentId() {
		return logAsignmentId;
	}

	public void setLogAsignmentId(Long logAsignmentId) {
		this.logAsignmentId = logAsignmentId;
	}

	public ConsingementTrackC2p getConsingementTrackC2p() {
		return consingementTrackC2p;
	}

	public void setConsingementTrackC2p(ConsingementTrackC2p consingementTrackC2p) {
		this.consingementTrackC2p = consingementTrackC2p;
	}

	public Long getLogisticId() {
		return logisticId;
	}

	public void setLogisticId(Long logisticId) {
		this.logisticId = logisticId;
	}

	public String getVechileNo() {
		return vechileNo;
	}

	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}

	public String getLrNo() {
		return lrNo;
	}

	public void setLrNo(String lrNo) {
		this.lrNo = lrNo;
	}

	public String getEwayBilNo() {
		return ewayBilNo;
	}

	public void setEwayBilNo(String ewayBilNo) {
		this.ewayBilNo = ewayBilNo;
	}

	public Date getExpArrival() {
		return expArrival;
	}

	public void setExpArrival(Date expArrival) {
		this.expArrival = expArrival;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getActualArrival() {
		return actualArrival;
	}

	public void setActualArrival(Date actualArrival) {
		this.actualArrival = actualArrival;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
