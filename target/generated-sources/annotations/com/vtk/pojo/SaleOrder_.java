package com.vtk.pojo;

import com.vtk.pojo.OrderDetails;
import com.vtk.pojo.Revenue;
import com.vtk.pojo.UserAccount;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:35")
@StaticMetamodel(SaleOrder.class)
public class SaleOrder_ { 

    public static volatile SetAttribute<SaleOrder, OrderDetails> orderDetailsSet;
    public static volatile SingularAttribute<SaleOrder, Integer> amount;
    public static volatile SingularAttribute<SaleOrder, Date> createdDate;
    public static volatile SingularAttribute<SaleOrder, Integer> id;
    public static volatile SingularAttribute<SaleOrder, UserAccount> userId;
    public static volatile SetAttribute<SaleOrder, Revenue> revenueSet;

}