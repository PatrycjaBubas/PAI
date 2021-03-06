/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.facades;

import java.util.List;
import javax.ejb.Local;
import pl.lodz.pai.musicshopapp.entities.Products;

/**
 *
 * @author Lopez
 */
//@Local
public interface ProductsFacadeIntf {

    void create(Products products);

    void edit(Products products);

    void remove(Products products);

    Products find(Object id);

    List<Products> findAll();

    List<Products> findRange(int[] range);

    int count();
    
}
