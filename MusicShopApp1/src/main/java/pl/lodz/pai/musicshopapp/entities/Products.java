/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lopez
 */
@Entity
@Table(name = "PRODUCTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByPrdId", query = "SELECT p FROM Products p WHERE p.prdId = :prdId"),
    @NamedQuery(name = "Products.findByPrdName", query = "SELECT p FROM Products p WHERE p.prdName = :prdName"),
    @NamedQuery(name = "Products.findByPrdDescription", query = "SELECT p FROM Products p WHERE p.prdDescription = :prdDescription"),
    @NamedQuery(name = "Products.findByPrdPrice", query = "SELECT p FROM Products p WHERE p.prdPrice = :prdPrice"),
    @NamedQuery(name = "Products.findByPrdAmount", query = "SELECT p FROM Products p WHERE p.prdAmount = :prdAmount")})
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRD_ID")
    private BigDecimal prdId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "PRD_NAME")
    private String prdName;
    
    @Size(max = 300)
    @Column(name = "PRD_DESCRIPTION")
    private String prdDescription;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRD_PRICE")
    private BigDecimal prdPrice;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRD_AMOUNT")
    private long prdAmount;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detPrdId")
    private List<OrderDetails> orderDetailsList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pctPrdId")
    private List<Pictures> picturesList;
    
    @JoinColumn(name = "PRD_CAT_ID", referencedColumnName = "CAT_ID")
    @ManyToOne(optional = false)
    private Categories prdCatId;

    public Products() {
    }

    public Products(BigDecimal prdId) {
        this.prdId = prdId;
    }

    public Products(BigDecimal prdId, String prdName, BigDecimal prdPrice, long prdAmount) {
        this.prdId = prdId;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdAmount = prdAmount;
    }
    
    public Products(BigDecimal prdId, String prdName, BigDecimal prdPrice, long prdAmount, String description, Categories category) {
        this.prdId = prdId;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdAmount = prdAmount;
        this.prdDescription = description;
        this.prdCatId = category;
    }

    public BigDecimal getPrdId() {
        return prdId;
    }

    public void setPrdId(BigDecimal prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public String getPrdDescription() {
        return prdDescription;
    }

    public void setPrdDescription(String prdDescription) {
        this.prdDescription = prdDescription;
    }

    public BigDecimal getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(BigDecimal prdPrice) {
        this.prdPrice = prdPrice;
    }

    public long getPrdAmount() {
        return prdAmount;
    }

    public void setPrdAmount(long prdAmount) {
        this.prdAmount = prdAmount;
    }

    @XmlTransient
    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    @XmlTransient
    public List<Pictures> getPicturesList() {
        return picturesList;
    }

    public void setPicturesList(List<Pictures> picturesList) {
        this.picturesList = picturesList;
    }

    public Categories getPrdCatId() {
        return prdCatId;
    }

    public void setPrdCatId(Categories prdCatId) {
        this.prdCatId = prdCatId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdId != null ? prdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.prdId == null && other.prdId != null) || (this.prdId != null && !this.prdId.equals(other.prdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.pai.musicshopapp.entities.Products[ prdId=" + prdId + " ]";
    }
    
}
