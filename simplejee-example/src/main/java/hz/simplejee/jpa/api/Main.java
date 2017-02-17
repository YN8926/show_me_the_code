package hz.simplejee.jpa.api;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by wanghui on 02/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("local");
        EntityManager entityMgr = factory.createEntityManager();
        //entityMgr.persist();
    }
}
