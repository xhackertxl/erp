/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veralex;

/**
 *
 * @author mac
 */
public class Car {
    
    private String model;
    private int year;
    private String manufacturer;
    private String color;

    Car(String randomModel, int randomYear, String randomManufacturer, String randomColor) {
        this.model = randomModel;
        this.year = randomYear;
        this.manufacturer = randomManufacturer;
        this.color = randomColor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.model != null ? this.model.hashCode() : 0);
        hash = 67 * hash + this.year;
        hash = 67 * hash + (this.manufacturer != null ? this.manufacturer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if ((this.model == null) ? (other.model != null) : !this.model.equals(other.model)) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        if ((this.manufacturer == null) ? (other.manufacturer != null) : !this.manufacturer.equals(other.manufacturer)) {
            return false;
        }
        if ((this.color == null) ? (other.color != null) : !this.color.equals(other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", year=" + year + ", manufacturer=" + manufacturer + ", color=" + color + '}';
    }

    
    
}
