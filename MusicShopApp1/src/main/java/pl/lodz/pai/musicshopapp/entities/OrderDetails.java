/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lopez
 */
@Entity
@Table(name = "ORDER_DETAILS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderDetails.findAll", query = "SELECT o FROM OrderDetails o"),
    @NamedQuery(name = "OrderDetails.findByDetId", query = "SELECT o FROM OrderDetails o WHERE o.detId = :detId")})
public class OrderDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET_ID")
    private BigDecimal detId;
    
    @JoinColumn(name = "DET_ORD_ID", referencedColumnName = "ORD_ID")
    @ManyToOne(optional = false)
    private Orders detOrdId;
    
    @JoinColumn(name = "DET_PRD_ID", referencedColumnName = "PRD_ID")
    @ManyToOne(optional = false)
    private Products detPrdId;

    public OrderDetails() {
    }

    public OrderDetails(BigDecimal detId) {
        this.detId = detId;
    }

    public BigDecimal getDetId() {
        return detId;
    }

    public void setDetId(BigDecimal detId) {
        this.detId = detId;
    }

    public Orders getDetOrdId() {
        return detOrdId;
    }

    public void setDetOrdId(Orders detOrdId) {
        this.detOrdId = detOrdId;
    }

    public Products getDetPrdId() {
        return detPrdId;
    }

    public void setDetPrdId(Products detPrdId) {
        this.detPrdId = detPrdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detId != null ? detId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetails)) {
            return false;
        }
        OrderDetails other = (OrderDetails) object;
        if ((this.detId == null && other.detId != null) || (this.detId != null && !this.detId.equals(other.detId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.pai.musicshopapp.entities.OrderDetails[ detId=" + detId + " ]";
    }
    
}
