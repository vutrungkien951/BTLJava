/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.pojo;

import java.io.Serializable;
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
 * @author kien
 */
@Entity
@Table(name = "store_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StoreMenu.findAll", query = "SELECT s FROM StoreMenu s"),
    @NamedQuery(name = "StoreMenu.findByIdstoreMenu", query = "SELECT s FROM StoreMenu s WHERE s.idstoreMenu = :idstoreMenu")})
public class StoreMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idstore_menu")
    private Integer idstoreMenu;
    @JoinColumn(name = "menu_id", referencedColumnName = "id")
    @ManyToOne
    private Menu menuId;
    @JoinColumn(name = "store_id", referencedColumnName = "id")
    @ManyToOne
    private Store storeId;

    public StoreMenu() {
    }

    public StoreMenu(Integer idstoreMenu) {
        this.idstoreMenu = idstoreMenu;
    }

    public Integer getIdstoreMenu() {
        return idstoreMenu;
    }

    public void setIdstoreMenu(Integer idstoreMenu) {
        this.idstoreMenu = idstoreMenu;
    }

    public Menu getMenuId() {
        return menuId;
    }

    public void setMenuId(Menu menuId) {
        this.menuId = menuId;
    }

    public Store getStoreId() {
        return storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstoreMenu != null ? idstoreMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreMenu)) {
            return false;
        }
        StoreMenu other = (StoreMenu) object;
        if ((this.idstoreMenu == null && other.idstoreMenu != null) || (this.idstoreMenu != null && !this.idstoreMenu.equals(other.idstoreMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vtk.pojo.StoreMenu[ idstoreMenu=" + idstoreMenu + " ]";
    }
    
}
