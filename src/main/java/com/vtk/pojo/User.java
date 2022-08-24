/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtk.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vtk.validator.UserEmail;
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
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author kien
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByUserId", query = "SELECT u FROM User u WHERE u.userId = :userId"),
    @NamedQuery(name = "User.findByUserRole", query = "SELECT u FROM User u WHERE u.userRole = :userRole"),
    @NamedQuery(name = "User.findByUserEmail", query = "SELECT u FROM User u WHERE u.userEmail = :userEmail"),
    @NamedQuery(name = "User.findByUserPassword", query = "SELECT u FROM User u WHERE u.userPassword = :userPassword"),
    @NamedQuery(name = "User.findByBirthDate", query = "SELECT u FROM User u WHERE u.birthDate = :birthDate"),
    @NamedQuery(name = "User.findByGender", query = "SELECT u FROM User u WHERE u.gender = :gender"),
    @NamedQuery(name = "User.findByUserPhoneNumber", query = "SELECT u FROM User u WHERE u.userPhoneNumber = :userPhoneNumber"),
    @NamedQuery(name = "User.findByUserImage", query = "SELECT u FROM User u WHERE u.userImage = :userImage"),
    @NamedQuery(name = "User.findByUserAddress", query = "SELECT u FROM User u WHERE u.userAddress = :userAddress"),
    @NamedQuery(name = "User.findByActive", query = "SELECT u FROM User u WHERE u.active = :active")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Size(min = 1, max = 45)
    @Column(name = "user_role")
    private String userRole;
    @Size(max = 45, message = "{user.email.sizeMsg}")
    @Column(name = "user_email")
    @NotNull(message = "{user.email.notNullMsg}")
    @UserEmail(message = "{user.email.userEmailMsg}")
    private String userEmail;
    @Basic(optional = false)
    @NotNull(message = "{user.password.notNullMsg}")
    @Size(min = 1, max = 200, message = "{user.password.sizeMsg}")
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    @Size(max = 45)
    @Column(name = "gender")
    private String gender;
    @Size(max = 45, message = "{user.phone.sizeMsg}")
    @Column(name = "user_phone_number")
    private String userPhoneNumber;
    @Size(max = 200)
    @Column(name = "user_image")
    private String userImage;
    @Size(max = 200, message = "{user.address.sizeMsg}")
    @Column(name = "user_address")
    private String userAddress;
    @Column(name = "active")
    private Boolean active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<Subcribers> subcribersSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<CommentsStore> commentsStoreSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<StoreOwner> storeOwnerSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<SaleOrder> saleOrderSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    @JsonIgnore
    private Set<CommentsFood> commentsFoodSet;
    
    @Transient
    private MultipartFile img;
    

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String userRole, String userPassword) {
        this.userId = userId;
        this.userRole = userRole;
        this.userPassword = userPassword;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vtk.pojo.User[ userId=" + userId + " ]";
    }

    /**
     * @return the img
     */
    public MultipartFile getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(MultipartFile img) {
        this.img = img;
    }
    
}
