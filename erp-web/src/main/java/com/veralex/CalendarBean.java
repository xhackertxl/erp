/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veralex;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="calendarBean")
@ViewScoped
public class CalendarBean implements Serializable{
   
    private Date date1;  
      
    private Date date2;  
      
    private Date date3;  
      
    public Date getDate1() {  
        return date1;  
    }  
  
    public void setDate1(Date date1) {  
        this.date1 = date1;  
    }  
  
    public Date getDate2() {  
        return date2;  
    }  
  
    public void setDate2(Date date2) {  
        this.date2 = date2;  
    }  
      
    public Date getDate3() {  
        return date3;  
    }  
  
    public void setDate3(Date date3) {  
        this.date3 = date3;  
    }  
}
