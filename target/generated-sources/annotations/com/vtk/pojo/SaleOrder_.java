package com.vtk.pojo;

import com.vtk.pojo.OrderDetails;
import com.vtk.pojo.Revenue;
import com.vtk.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-22T08:40:23")
@StaticMetamodel(SaleOrder.class)
public class SaleOrder_ { 

    public static volatile SetAttribute<SaleOrder, OrderDetails> orderDetailsSet;
    public static volatile SingularAttribute<SaleOrder, Date> createdDate;
    public static volatile SingularAttribute<SaleOrder, Integer> id;
    public static volatile SingularAttribute<SaleOrder, User> userId;
    public static volatile SetAttribute<SaleOrder, Revenue> revenueSet;

}