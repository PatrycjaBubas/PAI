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
import pl.lodz.pai.musicshopapp.entities.Users;

/**
 *
 * @author Lopez
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {//implements UsersFacadeLocal {
    @PersistenceContext//(unitName = "pl.lodz.pai_MusicShopApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }
    
    public Users findByUsrLogin(String usrLogin) {
        Query q = em.createNamedQuery("Users.findByUsrLogin");
        q.setParameter("usrLogin", usrLogin);
        try {
            return (Users) q.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }
}
