package com.vtk.pojo;

import com.vtk.pojo.Store;
import com.vtk.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-22T10:11:39")
@StaticMetamodel(Subcribers.class)
public class Subcribers_ { 

    public static volatile SingularAttribute<Subcribers, Integer> id;
    public static volatile SingularAttribute<Subcribers, Store> storeId;
    public static volatile SingularAttribute<Subcribers, User> userId;
    public static volatile SingularAttribute<Subcribers, Date> createDate;

}