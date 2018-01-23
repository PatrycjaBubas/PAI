/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.facades;

import java.util.List;
import javax.ejb.Local;
import pl.lodz.pai.musicshopapp.entities.EventHistory;

/**
 *
 * @author Lopez
 */
@Local
public interface EventHistoryFacadeLocal {

    void create(EventHistory eventHistory);

    void edit(EventHistory eventHistory);

    void remove(EventHistory eventHistory);

    EventHistory find(Object id);

    List<EventHistory> findAll();

    List<EventHistory> findRange(int[] range);

    int count();
    
}
