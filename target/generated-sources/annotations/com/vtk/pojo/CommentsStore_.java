package com.vtk.pojo;

import com.vtk.pojo.Store;
import com.vtk.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-22T10:11:39")
@StaticMetamodel(CommentsStore.class)
public class CommentsStore_ { 

    public static volatile SingularAttribute<CommentsStore, Integer> id;
    public static volatile SingularAttribute<CommentsStore, Store> storeId;
    public static volatile SingularAttribute<CommentsStore, User> userId;
    public static volatile SingularAttribute<CommentsStore, String> content;

}