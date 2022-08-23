package com.vtk.pojo;

import com.vtk.pojo.Store;
import com.vtk.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-23T14:30:56")
@StaticMetamodel(StoreOwner.class)
public class StoreOwner_ { 

    public static volatile SingularAttribute<StoreOwner, Integer> id;
    public static volatile SingularAttribute<StoreOwner, Store> storeId;
    public static volatile SingularAttribute<StoreOwner, User> userId;

}