package com.vtk.pojo;

import com.vtk.pojo.Food;
import com.vtk.pojo.StoreMenu;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-22T08:40:23")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> discription;
    public static volatile SetAttribute<Menu, Food> foodSet;
    public static volatile SetAttribute<Menu, StoreMenu> storeMenuSet;
    public static volatile SingularAttribute<Menu, String> menuName;
    public static volatile SingularAttribute<Menu, Integer> id;

}