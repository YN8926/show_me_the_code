package hz.simplejee.hibernate.annotation;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by 辉辉大侠 on 24/10/2016.
 */
@Entity
@Table(name = "t_entity")
public class MyEntity implements Serializable{
    private Long id;

}
