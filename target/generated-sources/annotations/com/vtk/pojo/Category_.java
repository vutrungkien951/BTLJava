package com.vtk.pojo;

import com.vtk.pojo.Food;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-24T16:47:37")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> image;
    public static volatile SetAttribute<Category, Food> foodSet;
    public static volatile SingularAttribute<Category, Integer> id;
    public static volatile SingularAttribute<Category, String> categoryName;

}