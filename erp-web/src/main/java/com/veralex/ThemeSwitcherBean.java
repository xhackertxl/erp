/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veralex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean(name = "themeSwitcherBean")
@SessionScoped
public class ThemeSwitcherBean implements Serializable{    
    
    
    private Map<String, String> themes;
   
    private List<Theme> advancedThemes;
   
    private String theme;
   
    @Inject
    private GuestPreferences gp;

    public void setGp(GuestPreferences gp) {
        this.gp = gp;
    }
   
    public Map<String, String> getThemes() {
        return themes;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @PostConstruct
    public void init() {
        
        theme = gp.getTheme();
       
        advancedThemes = new ArrayList<Theme>();
        advancedThemes.add(new Theme("aristo", "aristo.png"));
        advancedThemes.add(new Theme("bootstrap", "bootstrap.png"));
        advancedThemes.add(new Theme("cupertino", "cupertino.png"));
        advancedThemes.add(new Theme("humanity", "humanity.png"));
        advancedThemes.add(new Theme("redmond", "redmond.png"));
        advancedThemes.add(new Theme("sunny", "sunny.png"));
       
        themes = new TreeMap<String, String>();
        themes.put("Aristo", "aristo");
        themes.put("Bootstrap", "bootstrap");
        themes.put("Cupertino", "cupertino");
        themes.put("Humanity", "humanity");        
        themes.put("Redmond", "redmond");        
        themes.put("Sunny", "sunny");
    }
   
    public void saveTheme() {
        gp.setTheme(theme);
    }

    public List<Theme> getAdvancedThemes() {
        return advancedThemes;
    }

   
}
