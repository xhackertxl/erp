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
public class City {
    private int cityId;

    @javax.persistence.Column(name = "cityId", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    private String cityName;

    @javax.persistence.Column(name = "cityName", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (cityId != city.cityId) return false;
        if (cityName != null ? !cityName.equals(city.cityName) : city.cityName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }
}
