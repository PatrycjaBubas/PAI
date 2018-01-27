/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pl.lodz.pai.musicshopapp.entities.Products;

/**
 *
 * @author Lopez
 */
@Stateless
public class ProductsFacade extends AbstractFacade<Products> { //implements ProductsFacadeIntf {
    @PersistenceContext    //(unitName = "pl.lodz.pai_MusicShopApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductsFacade() {
        super(Products.class);
    }
    
    public Products findByPrdName(String prdName) {
        Query q = em.createNamedQuery("Products.findByPrdName");
        q.setParameter("prdName", prdName);
        try {
            return (Products) q.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }
}
