/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.services;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pl.lodz.pai.musicshopapp.entities.OrderDetails;
import pl.lodz.pai.musicshopapp.facades.OrderDetailsFacade;

/**
 *
 * @author Lopez
 */
@Stateless
public class OrderDetailsBean implements Serializable {
    
    @EJB
    private OrderDetailsFacade orderDetailsFacade;
    
    public void addNewOrderDetails(OrderDetails orderDetails) {
        orderDetailsFacade.create(orderDetails);
    }
}
