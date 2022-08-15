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
 * @author kien
 */
@Entity
@Table(name = "user_account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserAccount.findAll", query = "SELECT u FROM UserAccount u"),
    @NamedQuery(name = "UserAccount.findByUserId", query = "SELECT u FROM UserAccount u WHERE u.userId = :userId"),
    @NamedQuery(name = "UserAccount.findByUserEmail", query = "SELECT u FROM UserAccount u WHERE u.userEmail = :userEmail"),
    @NamedQuery(name = "UserAccount.findByUserPassword", query = "SELECT u FROM UserAccount u WHERE u.userPassword = :userPassword"),
    @NamedQuery(name = "UserAccount.findByBirthDate", query = "SELECT u FROM UserAccount u WHERE u.birthDate = :birthDate"),
    @NamedQuery(name = "UserAccount.findByGender", query = "SELECT u FROM UserAccount u WHERE u.gender = :gender"),
    @NamedQuery(name = "UserAccount.findByUserPhoneNumber", query = "SELECT u FROM UserAccount u WHERE u.userPhoneNumber = :userPhoneNumber"),
    @NamedQuery(name = "UserAccount.findByUserAccountcol", query = "SELECT u FROM UserAccount u WHERE u.userAccountcol = :userAccountcol"),
    @NamedQuery(name = "UserAccount.findByUserImage", query = "SELECT u FROM UserAccount u WHERE u.userImage = :userImage"),
    @NamedQuery(name = "UserAccount.findByUserAddress", query = "SELECT u FROM UserAccount u WHERE u.userAddress = :userAddress")})
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Size(max = 45)
    @Column(name = "user_email")
    private String userEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(name = "gender")
    private Boolean gender;
    @Size(max = 45)
    @Column(name = "user_phone_number")
    private String userPhoneNumber;
    @Size(max = 45)
    @Column(name = "user_accountcol")
    private String userAccountcol;
    @Size(max = 200)
    @Column(name = "user_image")
    private String userImage;
    @Size(max = 45)
    @Column(name = "user_address")
    private String userAddress;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Set<Subcribers> subcribersSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Set<CommentsStore> commentsStoreSet;
    @OneToMany(mappedBy = "userId")
    private Set<StoreOwner> storeOwnerSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Set<SaleOrder> saleOrderSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Set<CommentsFood> commentsFoodSet;
    @JoinColumn(name = "type_id", referencedColumnName = "type_id")
    @ManyToOne(optional = false)
    private AccountType typeId;

    public UserAccount() {
    }

    public UserAccount(Integer userId) {
        this.userId = userId;
    }

    public UserAccount(Integer userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserAccountcol() {
        return userAccountcol;
    }

    public void setUserAccountcol(String userAccountcol) {
        this.userAccountcol = userAccountcol;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
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
    public Set<StoreOwner> getStoreOwnerSet() {
        return storeOwnerSet;
    }

    public void setStoreOwnerSet(Set<StoreOwner> storeOwnerSet) {
        this.storeOwnerSet = storeOwnerSet;
    }

    @XmlTransient
    public Set<SaleOrder> getSaleOrderSet() {
        return saleOrderSet;
    }

    public void setSaleOrderSet(Set<SaleOrder> saleOrderSet) {
        this.saleOrderSet = saleOrderSet;
    }

    @XmlTransient
    public Set<CommentsFood> getCommentsFoodSet() {
        return commentsFoodSet;
    }

    public void setCommentsFoodSet(Set<CommentsFood> commentsFoodSet) {
        this.commentsFoodSet = commentsFoodSet;
    }

    public AccountType getTypeId() {
        return typeId;
    }

    public void setTypeId(AccountType typeId) {
        this.typeId = typeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAccount)) {
            return false;
        }
        UserAccount other = (UserAccount) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vtk.pojo.UserAccount[ userId=" + userId + " ]";
    }
    
}
