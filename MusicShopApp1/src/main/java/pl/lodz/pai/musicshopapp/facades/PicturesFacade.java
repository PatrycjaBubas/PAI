/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.lodz.pai.musicshopapp.entities.Pictures;

/**
 *
 * @author Lopez
 */
@Stateless
public class PicturesFacade extends AbstractFacade<Pictures> implements PicturesFacadeLocal {
    @PersistenceContext(unitName = "pl.lodz.pai_MusicShopApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PicturesFacade() {
        super(Pictures.class);
    }
    
}
