package com.vtk.pojo;

import com.vtk.pojo.Food;
import com.vtk.pojo.SaleOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-14T10:16:34")
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, String> unitPrice;
    public static volatile SingularAttribute<OrderDetails, SaleOrder> orderId;
    public static volatile SingularAttribute<OrderDetails, String> num;
    public static volatile SingularAttribute<OrderDetails, Food> foodId;
    public static volatile SingularAttribute<OrderDetails, Integer> id;

}