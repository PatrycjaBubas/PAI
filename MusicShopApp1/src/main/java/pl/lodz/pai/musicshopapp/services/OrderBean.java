/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.services;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pl.lodz.pai.musicshopapp.entities.Orders;
import pl.lodz.pai.musicshopapp.facades.OrdersFacade;

/**
 *
 * @author Lopez
 */
@Stateless
public class OrderBean implements Serializable {
    
    @EJB
    private OrdersFacade orderFacade;
    
    public List<Orders> getAllOrders() {
        return orderFacade.findAll();
    }
    
    public void addNewOrder(Orders order) {
        orderFacade.create(order);
    }
    
}
