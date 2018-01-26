package pl.lodz.pai.musicshopapp.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-24T21:29:32")
@StaticMetamodel(EventHistory.class)
public class EventHistory_ { 

    public static volatile SingularAttribute<EventHistory, Date> evtDate;
    public static volatile SingularAttribute<EventHistory, BigDecimal> evtId;
    public static volatile SingularAttribute<EventHistory, String> evtDescription;

}