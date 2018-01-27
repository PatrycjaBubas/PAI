package pl.lodz.pai.musicshopapp.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.lodz.pai.musicshopapp.entities.Orders;
import pl.lodz.pai.musicshopapp.entities.Products;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-27T16:55:09")
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, Orders> detOrdId;
    public static volatile SingularAttribute<OrderDetails, Products> detPrdId;
    public static volatile SingularAttribute<OrderDetails, BigDecimal> detId;

}