package com.instatenders.orusource.domain.entity.configuration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DimSupplierIndustryPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column
	private String supplierIndustryName;

	@Column(insertable=false, updatable=false)
	private String supplierSectorName;

	public String getSupplierIndustryName() {
		return this.supplierIndustryName;
	}

	public void setSupplierIndustryName(String supplierIndustryName) {
		this.supplierIndustryName = supplierIndustryName;
	}

	public String getSupplierSectorName() {
		return this.supplierSectorName;
	}

	public void setSupplierSectorName(String supplierSectorName) {
		this.supplierSectorName = supplierSectorName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DimSupplierIndustryPK)) {
			return false;
		}
		DimSupplierIndustryPK castOther = (DimSupplierIndustryPK)other;
		return this.supplierIndustryName.equals(castOther.supplierIndustryName) &&
				this.supplierSectorName.equals(castOther.supplierSectorName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.supplierIndustryName.hashCode();
		hash = hash * prime + this.supplierSectorName.hashCode();
		return hash;
	}
}