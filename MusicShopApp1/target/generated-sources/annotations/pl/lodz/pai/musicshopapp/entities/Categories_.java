package pl.lodz.pai.musicshopapp.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.lodz.pai.musicshopapp.entities.Products;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-23T00:07:02")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile SingularAttribute<Categories, BigDecimal> catId;
    public static volatile ListAttribute<Categories, Products> productsList;
    public static volatile SingularAttribute<Categories, String> catName;

}