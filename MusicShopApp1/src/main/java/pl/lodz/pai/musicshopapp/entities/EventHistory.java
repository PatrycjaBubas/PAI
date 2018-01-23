/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lopez
 */
@Entity
@Table(name = "EVENT_HISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EventHistory.findAll", query = "SELECT e FROM EventHistory e"),
    @NamedQuery(name = "EventHistory.findByEvtId", query = "SELECT e FROM EventHistory e WHERE e.evtId = :evtId"),
    @NamedQuery(name = "EventHistory.findByEvtDescription", query = "SELECT e FROM EventHistory e WHERE e.evtDescription = :evtDescription"),
    @NamedQuery(name = "EventHistory.findByEvtDate", query = "SELECT e FROM EventHistory e WHERE e.evtDate = :evtDate")})
public class EventHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EVT_ID")
    private BigDecimal evtId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "EVT_DESCRIPTION")
    private String evtDescription;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "EVT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evtDate;

    public EventHistory() {
    }

    public EventHistory(BigDecimal evtId) {
        this.evtId = evtId;
    }

    public EventHistory(BigDecimal evtId, String evtDescription, Date evtDate) {
        this.evtId = evtId;
        this.evtDescription = evtDescription;
        this.evtDate = evtDate;
    }

    public BigDecimal getEvtId() {
        return evtId;
    }

    public void setEvtId(BigDecimal evtId) {
        this.evtId = evtId;
    }

    public String getEvtDescription() {
        return evtDescription;
    }

    public void setEvtDescription(String evtDescription) {
        this.evtDescription = evtDescription;
    }

    public Date getEvtDate() {
        return evtDate;
    }

    public void setEvtDate(Date evtDate) {
        this.evtDate = evtDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evtId != null ? evtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventHistory)) {
            return false;
        }
        EventHistory other = (EventHistory) object;
        if ((this.evtId == null && other.evtId != null) || (this.evtId != null && !this.evtId.equals(other.evtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.pai.musicshopapp.entities.EventHistory[ evtId=" + evtId + " ]";
    }
    
}
