package com.instatenders.orusource.domain.entity.service;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the rfq_supplier_mapping database table.
 * 
 */
@Entity
@Table(name="rfq_supplier_mapping")
public class RfqSupplierMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RfqSupplierMappingPK id;

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;

	@Column(name="notification_sent")
	private String notificationSent;

	@Column(name="update_timestamp")
	private Timestamp updateTimestamp;

	//bi-directional many-to-one association to RfqPrMap
	@ManyToOne
	private RfqPrMap rfqPrMap;

	//bi-directional many-to-one association to SupplierDetail
	@ManyToOne
	private SupplierDetail supplierDetail;

	public RfqSupplierMapping() {
	}

	public RfqSupplierMappingPK getId() {
		return this.id;
	}

	public void setId(RfqSupplierMappingPK id) {
		this.id = id;
	}

	public Timestamp getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getNotificationSent() {
		return this.notificationSent;
	}

	public void setNotificationSent(String notificationSent) {
		this.notificationSent = notificationSent;
	}

	public Timestamp getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public RfqPrMap getRfqPrMap() {
		return this.rfqPrMap;
	}

	public void setRfqPrMap(RfqPrMap rfqPrMap) {
		this.rfqPrMap = rfqPrMap;
	}

	public SupplierDetail getSupplierDetail() {
		return this.supplierDetail;
	}

	public void setSupplierDetail(SupplierDetail supplierDetail) {
		this.supplierDetail = supplierDetail;
	}

}