/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.services;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.SessionScoped;
import pl.lodz.pai.musicshopapp.endpoints.Endpoint;
import pl.lodz.pai.musicshopapp.entities.Products;
import pl.lodz.pai.musicshopapp.facades.ProductsFacade;
import pl.lodz.pai.musicshopapp.model.Product;

/**
 *
 * @author pawel
 */
//@Stateful
//@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
//@ManagedBean
@Stateless
public class ProductBean implements Serializable {
    
    static List<Product> productList = new ArrayList<>();
    
    @EJB
    private ProductsFacade productFacade;
    
//    @EJB
//    private Endpoint endpoint;
    
    static {
        Product prod1 = new Product(1, "Produkt 1", 3, 1200, "produkt testowy 1");
        Product prod2 = new Product(2, "Produkt 2", 5, 1500, "produkt testowy 2");
        productList.add(prod1);
        productList.add(prod2);
    }

//    public void addProduct(Product product) {
//        productList.add(product);
//    }
    
    public void addProduct(Products product) {
        productFacade.create(product);
        //endpoint.addProduct(product);
    }   
    
    public void removeProduct(BigDecimal id) {
//        for(Product p : productList) {
//            if(id == p.getProductId()) {
//                productList.remove(p);
//                break;
//            }
//        }
        Products p = productFacade.find(id);
        productFacade.remove(p);
    }
    
//    public List<Product> getAllproducts() {
//        return productList;
//    }
    
    public List<Products> getAllProducts() {
        return productFacade.findAll();
    }
}
