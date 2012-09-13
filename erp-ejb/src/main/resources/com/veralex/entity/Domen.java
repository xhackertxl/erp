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
public class Domen {
    private int domenId;

    @javax.persistence.Column(name = "domenId", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getDomenId() {
        return domenId;
    }

    public void setDomenId(int domenId) {
        this.domenId = domenId;
    }

    private String domenName;

    @javax.persistence.Column(name = "domenName", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getDomenName() {
        return domenName;
    }

    public void setDomenName(String domenName) {
        this.domenName = domenName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Domen domen = (Domen) o;

        if (domenId != domen.domenId) return false;
        if (domenName != null ? !domenName.equals(domen.domenName) : domen.domenName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = domenId;
        result = 31 * result + (domenName != null ? domenName.hashCode() : 0);
        return result;
    }
}
