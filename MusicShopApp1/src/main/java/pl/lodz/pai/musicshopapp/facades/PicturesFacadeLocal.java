/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.facades;

import java.util.List;
import javax.ejb.Local;
import pl.lodz.pai.musicshopapp.entities.Pictures;

/**
 *
 * @author Lopez
 */
@Local
public interface PicturesFacadeLocal {

    void create(Pictures pictures);

    void edit(Pictures pictures);

    void remove(Pictures pictures);

    Pictures find(Object id);

    List<Pictures> findAll();

    List<Pictures> findRange(int[] range);

    int count();
    
}
