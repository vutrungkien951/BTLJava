package com.vtk.pojo;

import com.vtk.pojo.AccountType;
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

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:35")
@StaticMetamodel(UserAccount.class)
public class UserAccount_ { 

    public static volatile SingularAttribute<UserAccount, String> userPassword;
    public static volatile SingularAttribute<UserAccount, Boolean> gender;
    public static volatile SetAttribute<UserAccount, StoreOwner> storeOwnerSet;
    public static volatile SetAttribute<UserAccount, SaleOrder> saleOrderSet;
    public static volatile SingularAttribute<UserAccount, String> userPhoneNumber;
    public static volatile SingularAttribute<UserAccount, String> userAccountcol;
    public static volatile SetAttribute<UserAccount, Subcribers> subcribersSet;
    public static volatile SingularAttribute<UserAccount, Integer> userId;
    public static volatile SingularAttribute<UserAccount, Date> birthDate;
    public static volatile SetAttribute<UserAccount, CommentsStore> commentsStoreSet;
    public static volatile SingularAttribute<UserAccount, String> userAddress;
    public static volatile SingularAttribute<UserAccount, String> userImage;
    public static volatile SingularAttribute<UserAccount, String> userEmail;
    public static volatile SingularAttribute<UserAccount, AccountType> typeId;
    public static volatile SetAttribute<UserAccount, CommentsFood> commentsFoodSet;

}