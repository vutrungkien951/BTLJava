package com.vtk.pojo;

import com.vtk.pojo.Store;
import com.vtk.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-24T10:26:16")
@StaticMetamodel(CommentsStore.class)
public class CommentsStore_ { 

    public static volatile SingularAttribute<CommentsStore, Integer> id;
    public static volatile SingularAttribute<CommentsStore, Store> storeId;
    public static volatile SingularAttribute<CommentsStore, User> userId;
    public static volatile SingularAttribute<CommentsStore, String> content;

}