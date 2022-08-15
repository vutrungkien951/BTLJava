package com.vtk.pojo;

import com.vtk.pojo.Store;
import com.vtk.pojo.UserAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:35")
@StaticMetamodel(StoreOwner.class)
public class StoreOwner_ { 

    public static volatile SingularAttribute<StoreOwner, Integer> idstoreOwner;
    public static volatile SingularAttribute<StoreOwner, Store> storeId;
    public static volatile SingularAttribute<StoreOwner, UserAccount> userId;

}