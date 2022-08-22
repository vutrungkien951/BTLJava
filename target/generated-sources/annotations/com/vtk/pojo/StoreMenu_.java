package com.vtk.pojo;

import com.vtk.pojo.Menu;
import com.vtk.pojo.Store;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-22T08:40:23")
@StaticMetamodel(StoreMenu.class)
public class StoreMenu_ { 

    public static volatile SingularAttribute<StoreMenu, Integer> idstoreMenu;
    public static volatile SingularAttribute<StoreMenu, Menu> menuId;
    public static volatile SingularAttribute<StoreMenu, Store> storeId;

}