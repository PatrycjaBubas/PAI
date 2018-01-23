/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.endpoints;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import pl.lodz.pai.musicshopapp.entities.Products;
import pl.lodz.pai.musicshopapp.facades.ProductsFacade;

/**
 *
 * @author Lopez
 */
@Stateful
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class Endpoint {

    //@EJB
    //private ProductsFacade productFacade;
    
    public void addProduct(Products product) {
        //productFacade.create(product);
    }
    
}
