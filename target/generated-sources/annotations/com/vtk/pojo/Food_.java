package com.vtk.pojo;

import com.vtk.pojo.Category;
import com.vtk.pojo.CommentsFood;
import com.vtk.pojo.Menu;
import com.vtk.pojo.OrderDetails;
import com.vtk.pojo.Store;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:35")
@StaticMetamodel(Food.class)
public class Food_ { 

    public static volatile SetAttribute<Food, OrderDetails> orderDetailsSet;
    public static volatile SingularAttribute<Food, String> foodName;
    public static volatile SingularAttribute<Food, Integer> price;
    public static volatile SingularAttribute<Food, String> description;
    public static volatile SingularAttribute<Food, Menu> menuId;
    public static volatile SingularAttribute<Food, Integer> id;
    public static volatile SingularAttribute<Food, String> foodImage;
    public static volatile SingularAttribute<Food, Store> storeId;
    public static volatile SetAttribute<Food, CommentsFood> commentsFoodSet;
    public static volatile SingularAttribute<Food, Category> categoryId;
    public static volatile SingularAttribute<Food, Boolean> isOutOfStock;

}