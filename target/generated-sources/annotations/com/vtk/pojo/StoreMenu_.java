package com.vtk.pojo;

import com.vtk.pojo.Menu;
import com.vtk.pojo.Store;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-24T10:26:16")
@StaticMetamodel(StoreMenu.class)
public class StoreMenu_ { 

    public static volatile SingularAttribute<StoreMenu, Integer> idstoreMenu;
    public static volatile SingularAttribute<StoreMenu, Menu> menuId;
    public static volatile SingularAttribute<StoreMenu, Store> storeId;

}