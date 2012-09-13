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
public class Underground {
    private int undergroundId;

    @javax.persistence.Column(name = "undergroundId", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getUndergroundId() {
        return undergroundId;
    }

    public void setUndergroundId(int undergroundId) {
        this.undergroundId = undergroundId;
    }

    private int cityId;

    @javax.persistence.Column(name = "cityId", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    private String undergroundName;

    @javax.persistence.Column(name = "undergroundName", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getUndergroundName() {
        return undergroundName;
    }

    public void setUndergroundName(String undergroundName) {
        this.undergroundName = undergroundName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Underground that = (Underground) o;

        if (cityId != that.cityId) return false;
        if (undergroundId != that.undergroundId) return false;
        if (undergroundName != null ? !undergroundName.equals(that.undergroundName) : that.undergroundName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = undergroundId;
        result = 31 * result + cityId;
        result = 31 * result + (undergroundName != null ? undergroundName.hashCode() : 0);
        return result;
    }
}
