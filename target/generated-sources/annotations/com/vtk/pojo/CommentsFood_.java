package com.vtk.pojo;

import com.vtk.pojo.Food;
import com.vtk.pojo.UserAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:35")
@StaticMetamodel(CommentsFood.class)
public class CommentsFood_ { 

    public static volatile SingularAttribute<CommentsFood, Food> foodId;
    public static volatile SingularAttribute<CommentsFood, Integer> id;
    public static volatile SingularAttribute<CommentsFood, UserAccount> userId;
    public static volatile SingularAttribute<CommentsFood, String> content;

}