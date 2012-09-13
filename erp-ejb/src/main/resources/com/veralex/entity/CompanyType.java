package com.veralex.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: mac
 * Date: 14.09.12
 * Time: 0:08
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class CompanyType {
    private int companyTypeId;

    @javax.persistence.Column(name = "companyTypeId", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getCompanyTypeId() {
        return companyTypeId;
    }

    public void setCompanyTypeId(int companyTypeId) {
        this.companyTypeId = companyTypeId;
    }

    private String companyTypeName;

    @javax.persistence.Column(name = "companyTypeName", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyTypeName() {
        return companyTypeName;
    }

    public void setCompanyTypeName(String companyTypeName) {
        this.companyTypeName = companyTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyType that = (CompanyType) o;

        if (companyTypeId != that.companyTypeId) return false;
        if (companyTypeName != null ? !companyTypeName.equals(that.companyTypeName) : that.companyTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyTypeId;
        result = 31 * result + (companyTypeName != null ? companyTypeName.hashCode() : 0);
        return result;
    }
}
