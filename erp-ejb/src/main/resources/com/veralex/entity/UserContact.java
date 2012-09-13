package com.veralex.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: mac
 * Date: 14.09.12
 * Time: 0:08
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class UserContact {
    private int userContactId;

    @javax.persistence.Column(name = "userContactId", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getUserContactId() {
        return userContactId;
    }

    public void setUserContactId(int userContactId) {
        this.userContactId = userContactId;
    }

    private int userId;

    @javax.persistence.Column(name = "userId", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int contactTypeId;

    @javax.persistence.Column(name = "contactTypeId", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(int contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    private String userContactValue;

    @javax.persistence.Column(name = "userContactValue", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getUserContactValue() {
        return userContactValue;
    }

    public void setUserContactValue(String userContactValue) {
        this.userContactValue = userContactValue;
    }

    private Timestamp userContactCreationDate;

    @javax.persistence.Column(name = "userContactCreationDate", nullable = true, insertable = true, updatable = true, length = 29, precision = 6)
    @Basic
    public Timestamp getUserContactCreationDate() {
        return userContactCreationDate;
    }

    public void setUserContactCreationDate(Timestamp userContactCreationDate) {
        this.userContactCreationDate = userContactCreationDate;
    }

    private String userContactCreationUser;

    @javax.persistence.Column(name = "userContactCreationUser", nullable = true, insertable = true, updatable = true, length = 35, precision = 0)
    @Basic
    public String getUserContactCreationUser() {
        return userContactCreationUser;
    }

    public void setUserContactCreationUser(String userContactCreationUser) {
        this.userContactCreationUser = userContactCreationUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserContact that = (UserContact) o;

        if (contactTypeId != that.contactTypeId) return false;
        if (userContactId != that.userContactId) return false;
        if (userId != that.userId) return false;
        if (userContactCreationDate != null ? !userContactCreationDate.equals(that.userContactCreationDate) : that.userContactCreationDate != null)
            return false;
        if (userContactCreationUser != null ? !userContactCreationUser.equals(that.userContactCreationUser) : that.userContactCreationUser != null)
            return false;
        if (userContactValue != null ? !userContactValue.equals(that.userContactValue) : that.userContactValue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userContactId;
        result = 31 * result + userId;
        result = 31 * result + contactTypeId;
        result = 31 * result + (userContactValue != null ? userContactValue.hashCode() : 0);
        result = 31 * result + (userContactCreationDate != null ? userContactCreationDate.hashCode() : 0);
        result = 31 * result + (userContactCreationUser != null ? userContactCreationUser.hashCode() : 0);
        return result;
    }
}
