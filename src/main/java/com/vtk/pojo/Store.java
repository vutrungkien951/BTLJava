/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author kien
 */
@Entity
@Table(name = "store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Store.findAll", query = "SELECT s FROM Store s"),
    @NamedQuery(name = "Store.findById", query = "SELECT s FROM Store s WHERE s.id = :id"),
    @NamedQuery(name = "Store.findByStoreAddress", query = "SELECT s FROM Store s WHERE s.storeAddress = :storeAddress"),
    @NamedQuery(name = "Store.findByStorePhoneNumber", query = "SELECT s FROM Store s WHERE s.storePhoneNumber = :storePhoneNumber"),
    @NamedQuery(name = "Store.findByStoreEmail", query = "SELECT s FROM Store s WHERE s.storeEmail = :storeEmail"),
    @NamedQuery(name = "Store.findByOpenTime", query = "SELECT s FROM Store s WHERE s.openTime = :openTime")})
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "store_address")
    private String storeAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "store_phone_number")
    private String storePhoneNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "store_email")
    private String storeEmail;
    @Column(name = "open_time")
    @Temporal(TemporalType.TIME)
    private Date openTime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeId")
    private Set<Subcribers> subcribersSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeId")
    private Set<CommentsStore> commentsStoreSet;
    @OneToMany(mappedBy = "storeId")
    private Set<StoreMenu> storeMenuSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeId")
    private Set<StoreOwner> storeOwnerSet;

    public Store() {
    }

    public Store(Integer id) {
        this.id = id;
    }

    public Store(Integer id, String storeAddress, String storePhoneNumber, String storeEmail) {
        this.id = id;
        this.storeAddress = storeAddress;
        this.storePhoneNumber = storePhoneNumber;
        this.storeEmail = storeEmail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    @XmlTransient
    public Set<Subcribers> getSubcribersSet() {
        return subcribersSet;
    }

    public void setSubcribersSet(Set<Subcribers> subcribersSet) {
        this.subcribersSet = subcribersSet;
    }

    @XmlTransient
    public Set<CommentsStore> getCommentsStoreSet() {
        return commentsStoreSet;
    }

    public void setCommentsStoreSet(Set<CommentsStore> commentsStoreSet) {
        this.commentsStoreSet = commentsStoreSet;
    }

    @XmlTransient
    public Set<StoreMenu> getStoreMenuSet() {
        return storeMenuSet;
    }

    public void setStoreMenuSet(Set<StoreMenu> storeMenuSet) {
        this.storeMenuSet = storeMenuSet;
    }

    @XmlTransient
    public Set<StoreOwner> getStoreOwnerSet() {
        return storeOwnerSet;
    }

    public void setStoreOwnerSet(Set<StoreOwner> storeOwnerSet) {
        this.storeOwnerSet = storeOwnerSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Store)) {
            return false;
        }
        Store other = (Store) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vtk.pojo.Store[ id=" + id + " ]";
    }
    
}
