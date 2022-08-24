package com.vtk.pojo;

import com.vtk.pojo.CommentsStore;
import com.vtk.pojo.StoreMenu;
import com.vtk.pojo.StoreOwner;
import com.vtk.pojo.Subcribers;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-24T16:47:37")
@StaticMetamodel(Store.class)
public class Store_ { 

    public static volatile SetAttribute<Store, StoreOwner> storeOwnerSet;
    public static volatile SingularAttribute<Store, String> storeAddress;
    public static volatile SetAttribute<Store, StoreMenu> storeMenuSet;
    public static volatile SetAttribute<Store, Subcribers> subcribersSet;
    public static volatile SingularAttribute<Store, String> storeEmail;
    public static volatile SingularAttribute<Store, Integer> id;
    public static volatile SingularAttribute<Store, String> storePhoneNumber;
    public static volatile SingularAttribute<Store, Date> openTime;
    public static volatile SetAttribute<Store, CommentsStore> commentsStoreSet;

}