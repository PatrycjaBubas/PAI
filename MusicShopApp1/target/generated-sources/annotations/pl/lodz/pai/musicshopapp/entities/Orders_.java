package pl.lodz.pai.musicshopapp.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.lodz.pai.musicshopapp.entities.OrderDetails;
import pl.lodz.pai.musicshopapp.entities.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-27T16:55:09")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, BigDecimal> ordTotalPrice;
    public static volatile SingularAttribute<Orders, Date> ordCompletedDate;
    public static volatile ListAttribute<Orders, OrderDetails> orderDetailsList;
    public static volatile SingularAttribute<Orders, Date> ordPaiedDate;
    public static volatile SingularAttribute<Orders, Date> ordOrderDate;
    public static volatile SingularAttribute<Orders, String> ordIsPaid;
    public static volatile SingularAttribute<Orders, BigDecimal> ordId;
    public static volatile SingularAttribute<Orders, String> ordIsCompleted;
    public static volatile SingularAttribute<Orders, Users> ordUsrId;

}