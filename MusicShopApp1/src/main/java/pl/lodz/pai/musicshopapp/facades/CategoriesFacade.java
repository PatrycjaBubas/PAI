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
import pl.lodz.pai.musicshopapp.entities.Categories;

/**
 *
 * @author Lopez
 */
@Stateless
public class CategoriesFacade extends AbstractFacade<Categories> {//implements CategoriesFacadeLocal {
    @PersistenceContext//(unitName = "pl.lodz.pai_MusicShopApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriesFacade() {
        super(Categories.class);
    }
    
    public Categories findByCatName(String catName) {
        Query q = em.createNamedQuery("Categories.findByCatName");
        q.setParameter("catName", catName);
        try {
            return (Categories) q.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }
}
