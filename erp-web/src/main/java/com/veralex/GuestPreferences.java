/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veralex;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author comp
 */
@ManagedBean(name = "guestPreferences")
@SessionScoped
public class GuestPreferences implements Serializable{

    private String theme = "sunny"; //default bootstrap aristo

    public String getTheme() {
        
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        if (params.containsKey("theme")) {            
            theme = params.get("theme");
        }
        System.out.println(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("theme"));
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
