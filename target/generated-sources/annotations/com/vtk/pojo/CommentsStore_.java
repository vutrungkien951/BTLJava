package com.vtk.pojo;

import com.vtk.pojo.Store;
import com.vtk.pojo.UserAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:35")
@StaticMetamodel(CommentsStore.class)
public class CommentsStore_ { 

    public static volatile SingularAttribute<CommentsStore, Integer> id;
    public static volatile SingularAttribute<CommentsStore, Store> storeId;
    public static volatile SingularAttribute<CommentsStore, UserAccount> userId;
    public static volatile SingularAttribute<CommentsStore, String> content;

}