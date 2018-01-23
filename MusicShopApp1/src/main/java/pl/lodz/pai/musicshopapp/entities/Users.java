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
@Table(name = "USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUsrId", query = "SELECT u FROM Users u WHERE u.usrId = :usrId"),
    @NamedQuery(name = "Users.findByUsrLogin", query = "SELECT u FROM Users u WHERE u.usrLogin = :usrLogin"),
    @NamedQuery(name = "Users.findByUsrFirstName", query = "SELECT u FROM Users u WHERE u.usrFirstName = :usrFirstName"),
    @NamedQuery(name = "Users.findByUsrLastName", query = "SELECT u FROM Users u WHERE u.usrLastName = :usrLastName"),
    @NamedQuery(name = "Users.findByUsrPassword", query = "SELECT u FROM Users u WHERE u.usrPassword = :usrPassword"),
    @NamedQuery(name = "Users.findByUsrIsActive", query = "SELECT u FROM Users u WHERE u.usrIsActive = :usrIsActive")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "USR_ID")
    private BigDecimal usrId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USR_LOGIN")
    private String usrLogin;
    
    @Size(max = 30)
    @Column(name = "USR_FIRST_NAME")
    private String usrFirstName;
    
    @Size(max = 50)
    @Column(name = "USR_LAST_NAME")
    private String usrLastName;
    
    @Size(max = 40)
    @Column(name = "USR_PASSWORD")
    private String usrPassword;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USR_IS_ACTIVE")
    private String usrIsActive;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordUsrId")
    private List<Orders> ordersList;

    public Users() {
    }

    public Users(BigDecimal usrId) {
        this.usrId = usrId;
    }

    public Users(BigDecimal usrId, String usrLogin, String usrIsActive) {
        this.usrId = usrId;
        this.usrLogin = usrLogin;
        this.usrIsActive = usrIsActive;
    }

    public BigDecimal getUsrId() {
        return usrId;
    }

    public void setUsrId(BigDecimal usrId) {
        this.usrId = usrId;
    }

    public String getUsrLogin() {
        return usrLogin;
    }

    public void setUsrLogin(String usrLogin) {
        this.usrLogin = usrLogin;
    }

    public String getUsrFirstName() {
        return usrFirstName;
    }

    public void setUsrFirstName(String usrFirstName) {
        this.usrFirstName = usrFirstName;
    }

    public String getUsrLastName() {
        return usrLastName;
    }

    public void setUsrLastName(String usrLastName) {
        this.usrLastName = usrLastName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getUsrIsActive() {
        return usrIsActive;
    }

    public void setUsrIsActive(String usrIsActive) {
        this.usrIsActive = usrIsActive;
    }

    @XmlTransient
    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.pai.musicshopapp.entities.Users[ usrId=" + usrId + " ]";
    }
    
}
