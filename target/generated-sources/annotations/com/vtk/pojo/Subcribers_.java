package com.vtk.pojo;

import com.vtk.pojo.Store;
import com.vtk.pojo.UserAccount;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:35")
@StaticMetamodel(Subcribers.class)
public class Subcribers_ { 

    public static volatile SingularAttribute<Subcribers, Integer> id;
    public static volatile SingularAttribute<Subcribers, Store> storeId;
    public static volatile SingularAttribute<Subcribers, UserAccount> userId;
    public static volatile SingularAttribute<Subcribers, Date> createDate;

}