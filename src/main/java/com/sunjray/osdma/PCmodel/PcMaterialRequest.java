package com.sunjray.osdma.PCmodel;
// Generated Jul 29, 2019 8:46:52 PM by Hibernate Tools 4.3.5.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sunjray.osdma.PCenumeration.Status;

/**
 * TOsPcMaterialRequest generated by hbm2java
 */
@Entity
@Table(name = "t_os_pc_material_request", catalog = "osdma")
public class PcMaterialRequest implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer materialReqId;
	private MasterStationType masterStationType;
	private MasterWorkStage masterWorkStage;
	private Sitecode siteCode;
	private Date createdDate;
	private Integer createdBy;
	private Status status;

	public PcMaterialRequest() {
	}

	public PcMaterialRequest(Integer materialReqId, MasterStationType masterStationType,
			MasterWorkStage masterWorkStage, Sitecode siteCode, Date createdDate, Integer createdBy) {
		super();
		this.materialReqId = materialReqId;
		this.masterStationType = masterStationType;
		this.masterWorkStage = masterWorkStage;
		this.siteCode = siteCode;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "material_req_id", unique = true, nullable = false)
	public Integer getMaterialReqId() {
		return this.materialReqId;
	}

	public void setMaterialReqId(Integer materialReqId) {
		this.materialReqId = materialReqId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "project_type")
	public MasterStationType getMasterStationType() {
		return this.masterStationType;
	}

	public void setMasterStationType(MasterStationType masterStationType) {
		this.masterStationType = masterStationType;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "material_for")
	public MasterWorkStage getMasterWorkStage() {
		return this.masterWorkStage;
	}

	public void setMasterWorkStage(MasterWorkStage masterWorkStage) {
		this.masterWorkStage = masterWorkStage;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "site_code")
	public Sitecode getSiteCode() {
		return this.siteCode;
	}

	public void setSiteCode(Sitecode siteCode) {
		this.siteCode = siteCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
