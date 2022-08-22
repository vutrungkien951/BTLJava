package com.vtk.pojo;

import com.vtk.pojo.Food;
import com.vtk.pojo.SaleOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-22T08:40:23")
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, Integer> unitPrice;
    public static volatile SingularAttribute<OrderDetails, SaleOrder> orderId;
    public static volatile SingularAttribute<OrderDetails, Integer> num;
    public static volatile SingularAttribute<OrderDetails, Food> foodId;
    public static volatile SingularAttribute<OrderDetails, Integer> discount;
    public static volatile SingularAttribute<OrderDetails, Integer> id;

}