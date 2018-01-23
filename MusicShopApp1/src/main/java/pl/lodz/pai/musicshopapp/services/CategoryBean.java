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
import pl.lodz.pai.musicshopapp.entities.Categories;
import pl.lodz.pai.musicshopapp.facades.CategoriesFacade;

/**
 *
 * @author Lopez
 */
@Stateless
public class CategoryBean implements Serializable {
    
    @EJB
    private CategoriesFacade categoryFacade;
    
    public List<Categories> getAllCategories() {
        return categoryFacade.findAll();
    }
}
