package com.vtk.pojo;

import com.vtk.pojo.Food;
import com.vtk.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-22T08:40:23")
@StaticMetamodel(CommentsFood.class)
public class CommentsFood_ { 

    public static volatile SingularAttribute<CommentsFood, Food> foodId;
    public static volatile SingularAttribute<CommentsFood, Integer> id;
    public static volatile SingularAttribute<CommentsFood, User> userId;
    public static volatile SingularAttribute<CommentsFood, String> content;

}