package pl.lodz.pai.musicshopapp.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.lodz.pai.musicshopapp.entities.Categories;
import pl.lodz.pai.musicshopapp.entities.OrderDetails;
import pl.lodz.pai.musicshopapp.entities.Pictures;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-24T21:29:32")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, BigDecimal> prdId;
    public static volatile ListAttribute<Products, Pictures> picturesList;
    public static volatile SingularAttribute<Products, Categories> prdCatId;
    public static volatile SingularAttribute<Products, String> prdName;
    public static volatile ListAttribute<Products, OrderDetails> orderDetailsList;
    public static volatile SingularAttribute<Products, BigDecimal> prdPrice;
    public static volatile SingularAttribute<Products, String> prdDescription;
    public static volatile SingularAttribute<Products, Long> prdAmount;

}