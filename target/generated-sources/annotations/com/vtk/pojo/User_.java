package com.vtk.pojo;

import com.vtk.pojo.CommentsFood;
import com.vtk.pojo.CommentsStore;
import com.vtk.pojo.SaleOrder;
import com.vtk.pojo.StoreOwner;
import com.vtk.pojo.Subcribers;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-22T08:40:23")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> userPassword;
    public static volatile SingularAttribute<User, String> gender;
    public static volatile SetAttribute<User, StoreOwner> storeOwnerSet;
    public static volatile SetAttribute<User, SaleOrder> saleOrderSet;
    public static volatile SingularAttribute<User, String> userPhoneNumber;
    public static volatile SetAttribute<User, Subcribers> subcribersSet;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile SingularAttribute<User, Date> birthDate;
    public static volatile SetAttribute<User, CommentsStore> commentsStoreSet;
    public static volatile SingularAttribute<User, String> userAddress;
    public static volatile SingularAttribute<User, String> userImage;
    public static volatile SingularAttribute<User, String> userEmail;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile SetAttribute<User, CommentsFood> commentsFoodSet;

}