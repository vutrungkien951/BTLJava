package com.vtk.pojo;

import com.vtk.pojo.SaleOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-24T16:47:37")
@StaticMetamodel(Revenue.class)
public class Revenue_ { 

    public static volatile SingularAttribute<Revenue, String> date;
    public static volatile SingularAttribute<Revenue, Integer> total;
    public static volatile SingularAttribute<Revenue, SaleOrder> orderId;
    public static volatile SingularAttribute<Revenue, Integer> id;

}