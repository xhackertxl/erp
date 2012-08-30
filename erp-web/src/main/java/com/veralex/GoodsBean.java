/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veralex;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="goodsBean")
@ViewScoped
public class GoodsBean implements Serializable{
    
    public Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public GoodsBean() {
        quantity = 1;
    }
    
    public void setClearValues(){
        this.quantity = quantity = 0;
    }
    
}
