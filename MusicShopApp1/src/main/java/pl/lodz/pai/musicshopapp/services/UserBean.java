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
import pl.lodz.pai.musicshopapp.entities.Users;
import pl.lodz.pai.musicshopapp.facades.UsersFacade;

/**
 *
 * @author Lopez
 */
@Stateless
public class UserBean implements Serializable {
    
    @EJB
    private UsersFacade userFacade;
    
    public List<Users> getAllUsers() {
        return userFacade.findAll();
    }
    
    public Users findUserByLogin(String userLogin){
        return userFacade.findByUsrLogin(userLogin);
    }
}
