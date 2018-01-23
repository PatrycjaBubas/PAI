/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lopez
 */
@Entity
@Table(name = "ORDERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOrdId", query = "SELECT o FROM Orders o WHERE o.ordId = :ordId"),
    @NamedQuery(name = "Orders.findByOrdIsPaid", query = "SELECT o FROM Orders o WHERE o.ordIsPaid = :ordIsPaid"),
    @NamedQuery(name = "Orders.findByOrdIsCompleted", query = "SELECT o FROM Orders o WHERE o.ordIsCompleted = :ordIsCompleted"),
    @NamedQuery(name = "Orders.findByOrdTotalPrice", query = "SELECT o FROM Orders o WHERE o.ordTotalPrice = :ordTotalPrice"),
    @NamedQuery(name = "Orders.findByOrdOrderDate", query = "SELECT o FROM Orders o WHERE o.ordOrderDate = :ordOrderDate"),
    @NamedQuery(name = "Orders.findByOrdPaiedDate", query = "SELECT o FROM Orders o WHERE o.ordPaiedDate = :ordPaiedDate"),
    @NamedQuery(name = "Orders.findByOrdCompletedDate", query = "SELECT o FROM Orders o WHERE o.ordCompletedDate = :ordCompletedDate")})
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORD_ID")
    private BigDecimal ordId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORD_IS_PAID")
    private String ordIsPaid;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ORD_IS_COMPLETED")
    private String ordIsCompleted;
    
    @Column(name = "ORD_TOTAL_PRICE")
    private BigDecimal ordTotalPrice;
    
    @Column(name = "ORD_ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ordOrderDate;
    
    @Column(name = "ORD_PAIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ordPaiedDate;
    
    @Column(name = "ORD_COMPLETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ordCompletedDate;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detOrdId")
    private List<OrderDetails> orderDetailsList;
    
    @JoinColumn(name = "ORD_USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false)
    private Users ordUsrId;

    public Orders() {
    }

    public Orders(BigDecimal ordId) {
        this.ordId = ordId;
    }

    public Orders(BigDecimal ordId, String ordIsPaid, String ordIsCompleted) {
        this.ordId = ordId;
        this.ordIsPaid = ordIsPaid;
        this.ordIsCompleted = ordIsCompleted;
    }

    public BigDecimal getOrdId() {
        return ordId;
    }

    public void setOrdId(BigDecimal ordId) {
        this.ordId = ordId;
    }

    public String getOrdIsPaid() {
        return ordIsPaid;
    }

    public void setOrdIsPaid(String ordIsPaid) {
        this.ordIsPaid = ordIsPaid;
    }

    public String getOrdIsCompleted() {
        return ordIsCompleted;
    }

    public void setOrdIsCompleted(String ordIsCompleted) {
        this.ordIsCompleted = ordIsCompleted;
    }

    public BigDecimal getOrdTotalPrice() {
        return ordTotalPrice;
    }

    public void setOrdTotalPrice(BigDecimal ordTotalPrice) {
        this.ordTotalPrice = ordTotalPrice;
    }

    public Date getOrdOrderDate() {
        return ordOrderDate;
    }

    public void setOrdOrderDate(Date ordOrderDate) {
        this.ordOrderDate = ordOrderDate;
    }

    public Date getOrdPaiedDate() {
        return ordPaiedDate;
    }

    public void setOrdPaiedDate(Date ordPaiedDate) {
        this.ordPaiedDate = ordPaiedDate;
    }

    public Date getOrdCompletedDate() {
        return ordCompletedDate;
    }

    public void setOrdCompletedDate(Date ordCompletedDate) {
        this.ordCompletedDate = ordCompletedDate;
    }

    @XmlTransient
    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    public Users getOrdUsrId() {
        return ordUsrId;
    }

    public void setOrdUsrId(Users ordUsrId) {
        this.ordUsrId = ordUsrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordId != null ? ordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.ordId == null && other.ordId != null) || (this.ordId != null && !this.ordId.equals(other.ordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.pai.musicshopapp.entities.Orders[ ordId=" + ordId + " ]";
    }
    
}
