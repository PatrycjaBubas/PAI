package pl.lodz.pai.musicshopapp.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.lodz.pai.musicshopapp.entities.Orders;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-24T21:29:32")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> usrLastName;
    public static volatile SingularAttribute<Users, String> usrLogin;
    public static volatile SingularAttribute<Users, String> usrIsActive;
    public static volatile SingularAttribute<Users, BigDecimal> usrId;
    public static volatile SingularAttribute<Users, String> usrFirstName;
    public static volatile SingularAttribute<Users, String> usrPassword;
    public static volatile ListAttribute<Users, Orders> ordersList;

}