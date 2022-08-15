/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kien
 */
@Entity
@Table(name = "store_owner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StoreOwner.findAll", query = "SELECT s FROM StoreOwner s"),
    @NamedQuery(name = "StoreOwner.findByIdstoreOwner", query = "SELECT s FROM StoreOwner s WHERE s.idstoreOwner = :idstoreOwner")})
public class StoreOwner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstore_owner")
    private Integer idstoreOwner;
    @JoinColumn(name = "store_id", referencedColumnName = "id")
    @ManyToOne
    private Store storeId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private UserAccount userId;

    public StoreOwner() {
    }

    public StoreOwner(Integer idstoreOwner) {
        this.idstoreOwner = idstoreOwner;
    }

    public Integer getIdstoreOwner() {
        return idstoreOwner;
    }

    public void setIdstoreOwner(Integer idstoreOwner) {
        this.idstoreOwner = idstoreOwner;
    }

    public Store getStoreId() {
        return storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    public UserAccount getUserId() {
        return userId;
    }

    public void setUserId(UserAccount userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstoreOwner != null ? idstoreOwner.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreOwner)) {
            return false;
        }
        StoreOwner other = (StoreOwner) object;
        if ((this.idstoreOwner == null && other.idstoreOwner != null) || (this.idstoreOwner != null && !this.idstoreOwner.equals(other.idstoreOwner))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vtk.pojo.StoreOwner[ idstoreOwner=" + idstoreOwner + " ]";
    }
    
}
