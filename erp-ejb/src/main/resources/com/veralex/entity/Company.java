package com.veralex.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: mac
 * Date: 14.09.12
 * Time: 0:08
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Company {
    private int companyId;

    @javax.persistence.Column(name = "companyId", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    private int companyTypeId;

    @javax.persistence.Column(name = "companyTypeId", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getCompanyTypeId() {
        return companyTypeId;
    }

    public void setCompanyTypeId(int companyTypeId) {
        this.companyTypeId = companyTypeId;
    }

    private String companyName;

    @javax.persistence.Column(name = "companyName", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private String companyCeo;

    @javax.persistence.Column(name = "companyCEO", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyCeo() {
        return companyCeo;
    }

    public void setCompanyCeo(String companyCeo) {
        this.companyCeo = companyCeo;
    }

    private String companyAddressZipCode;

    @javax.persistence.Column(name = "companyAddressZipCode", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyAddressZipCode() {
        return companyAddressZipCode;
    }

    public void setCompanyAddressZipCode(String companyAddressZipCode) {
        this.companyAddressZipCode = companyAddressZipCode;
    }

    private String companyAddressStreet;

    @javax.persistence.Column(name = "companyAddressStreet", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyAddressStreet() {
        return companyAddressStreet;
    }

    public void setCompanyAddressStreet(String companyAddressStreet) {
        this.companyAddressStreet = companyAddressStreet;
    }

    private String companyAddressHouseNumber;

    @javax.persistence.Column(name = "companyAddressHouseNumber", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyAddressHouseNumber() {
        return companyAddressHouseNumber;
    }

    public void setCompanyAddressHouseNumber(String companyAddressHouseNumber) {
        this.companyAddressHouseNumber = companyAddressHouseNumber;
    }

    private String companyAddressHouseCase;

    @javax.persistence.Column(name = "companyAddressHouseCase", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyAddressHouseCase() {
        return companyAddressHouseCase;
    }

    public void setCompanyAddressHouseCase(String companyAddressHouseCase) {
        this.companyAddressHouseCase = companyAddressHouseCase;
    }

    private String companyAddressApartment;

    @javax.persistence.Column(name = "companyAddressApartment", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyAddressApartment() {
        return companyAddressApartment;
    }

    public void setCompanyAddressApartment(String companyAddressApartment) {
        this.companyAddressApartment = companyAddressApartment;
    }

    private String companyInn;

    @javax.persistence.Column(name = "companyINN", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyInn() {
        return companyInn;
    }

    public void setCompanyInn(String companyInn) {
        this.companyInn = companyInn;
    }

    private String companyKpp;

    @javax.persistence.Column(name = "companyKPP", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyKpp() {
        return companyKpp;
    }

    public void setCompanyKpp(String companyKpp) {
        this.companyKpp = companyKpp;
    }

    private String companyBik;

    @javax.persistence.Column(name = "companyBIK", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyBik() {
        return companyBik;
    }

    public void setCompanyBik(String companyBik) {
        this.companyBik = companyBik;
    }

    private String companyCorAccount;

    @javax.persistence.Column(name = "companyCorAccount", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyCorAccount() {
        return companyCorAccount;
    }

    public void setCompanyCorAccount(String companyCorAccount) {
        this.companyCorAccount = companyCorAccount;
    }

    private String companyCurAccount;

    @javax.persistence.Column(name = "companyCurAccount", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyCurAccount() {
        return companyCurAccount;
    }

    public void setCompanyCurAccount(String companyCurAccount) {
        this.companyCurAccount = companyCurAccount;
    }

    private String companyBankName;

    @javax.persistence.Column(name = "companyBankName", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyBankName() {
        return companyBankName;
    }

    public void setCompanyBankName(String companyBankName) {
        this.companyBankName = companyBankName;
    }

    private String companyComment;

    @javax.persistence.Column(name = "companyComment", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyComment() {
        return companyComment;
    }

    public void setCompanyComment(String companyComment) {
        this.companyComment = companyComment;
    }

    private Date companyCreationDate;

    @javax.persistence.Column(name = "companyCreationDate", nullable = false, insertable = true, updatable = true, length = 13, precision = 0)
    @Basic
    public Date getCompanyCreationDate() {
        return companyCreationDate;
    }

    public void setCompanyCreationDate(Date companyCreationDate) {
        this.companyCreationDate = companyCreationDate;
    }

    private String companyCreationUser;

    @javax.persistence.Column(name = "companyCreationUser", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCompanyCreationUser() {
        return companyCreationUser;
    }

    public void setCompanyCreationUser(String companyCreationUser) {
        this.companyCreationUser = companyCreationUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (companyId != company.companyId) return false;
        if (companyTypeId != company.companyTypeId) return false;
        if (companyAddressApartment != null ? !companyAddressApartment.equals(company.companyAddressApartment) : company.companyAddressApartment != null)
            return false;
        if (companyAddressHouseCase != null ? !companyAddressHouseCase.equals(company.companyAddressHouseCase) : company.companyAddressHouseCase != null)
            return false;
        if (companyAddressHouseNumber != null ? !companyAddressHouseNumber.equals(company.companyAddressHouseNumber) : company.companyAddressHouseNumber != null)
            return false;
        if (companyAddressStreet != null ? !companyAddressStreet.equals(company.companyAddressStreet) : company.companyAddressStreet != null)
            return false;
        if (companyAddressZipCode != null ? !companyAddressZipCode.equals(company.companyAddressZipCode) : company.companyAddressZipCode != null)
            return false;
        if (companyBankName != null ? !companyBankName.equals(company.companyBankName) : company.companyBankName != null)
            return false;
        if (companyBik != null ? !companyBik.equals(company.companyBik) : company.companyBik != null) return false;
        if (companyCeo != null ? !companyCeo.equals(company.companyCeo) : company.companyCeo != null) return false;
        if (companyComment != null ? !companyComment.equals(company.companyComment) : company.companyComment != null)
            return false;
        if (companyCorAccount != null ? !companyCorAccount.equals(company.companyCorAccount) : company.companyCorAccount != null)
            return false;
        if (companyCreationDate != null ? !companyCreationDate.equals(company.companyCreationDate) : company.companyCreationDate != null)
            return false;
        if (companyCreationUser != null ? !companyCreationUser.equals(company.companyCreationUser) : company.companyCreationUser != null)
            return false;
        if (companyCurAccount != null ? !companyCurAccount.equals(company.companyCurAccount) : company.companyCurAccount != null)
            return false;
        if (companyInn != null ? !companyInn.equals(company.companyInn) : company.companyInn != null) return false;
        if (companyKpp != null ? !companyKpp.equals(company.companyKpp) : company.companyKpp != null) return false;
        if (companyName != null ? !companyName.equals(company.companyName) : company.companyName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyId;
        result = 31 * result + companyTypeId;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (companyCeo != null ? companyCeo.hashCode() : 0);
        result = 31 * result + (companyAddressZipCode != null ? companyAddressZipCode.hashCode() : 0);
        result = 31 * result + (companyAddressStreet != null ? companyAddressStreet.hashCode() : 0);
        result = 31 * result + (companyAddressHouseNumber != null ? companyAddressHouseNumber.hashCode() : 0);
        result = 31 * result + (companyAddressHouseCase != null ? companyAddressHouseCase.hashCode() : 0);
        result = 31 * result + (companyAddressApartment != null ? companyAddressApartment.hashCode() : 0);
        result = 31 * result + (companyInn != null ? companyInn.hashCode() : 0);
        result = 31 * result + (companyKpp != null ? companyKpp.hashCode() : 0);
        result = 31 * result + (companyBik != null ? companyBik.hashCode() : 0);
        result = 31 * result + (companyCorAccount != null ? companyCorAccount.hashCode() : 0);
        result = 31 * result + (companyCurAccount != null ? companyCurAccount.hashCode() : 0);
        result = 31 * result + (companyBankName != null ? companyBankName.hashCode() : 0);
        result = 31 * result + (companyComment != null ? companyComment.hashCode() : 0);
        result = 31 * result + (companyCreationDate != null ? companyCreationDate.hashCode() : 0);
        result = 31 * result + (companyCreationUser != null ? companyCreationUser.hashCode() : 0);
        return result;
    }
}
