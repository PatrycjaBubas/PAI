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
import javax.persistence.Lob;
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
@Table(name = "PICTURES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pictures.findAll", query = "SELECT p FROM Pictures p"),
    @NamedQuery(name = "Pictures.findByPctId", query = "SELECT p FROM Pictures p WHERE p.pctId = :pctId")})
public class Pictures implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PCT_ID")
    private BigDecimal pctId;
    
//    //@Lob
//    @Column(name = "PCT_PICTURE")
//    private Object pctPicture;
    
//    //@Lob
//    @Column(name = "PCT_EDITED_PICTURE")
//    private Object pctEditedPicture;
    
    @JoinColumn(name = "PCT_PRD_ID", referencedColumnName = "PRD_ID")
    @ManyToOne(optional = false)
    private Products pctPrdId;

    public Pictures() {
    }

    public Pictures(BigDecimal pctId) {
        this.pctId = pctId;
    }

    public BigDecimal getPctId() {
        return pctId;
    }

    public void setPctId(BigDecimal pctId) {
        this.pctId = pctId;
    }

//    public Object getPctPicture() {
//        return pctPicture;
//    }
//
//    public void setPctPicture(Object pctPicture) {
//        this.pctPicture = pctPicture;
//    }
//
//    public Object getPctEditedPicture() {
//        return pctEditedPicture;
//    }
//
//    public void setPctEditedPicture(Object pctEditedPicture) {
//        this.pctEditedPicture = pctEditedPicture;
//    }

    public Products getPctPrdId() {
        return pctPrdId;
    }

    public void setPctPrdId(Products pctPrdId) {
        this.pctPrdId = pctPrdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pctId != null ? pctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pictures)) {
            return false;
        }
        Pictures other = (Pictures) object;
        if ((this.pctId == null && other.pctId != null) || (this.pctId != null && !this.pctId.equals(other.pctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.pai.musicshopapp.entities.Pictures[ pctId=" + pctId + " ]";
    }
    
}
