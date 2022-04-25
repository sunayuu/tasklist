package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final String PERSISTENCE_UNIT_NAME = "tasklist";
    private static EntityManagerFactory task;

    public static EntityManager createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    private static EntityManagerFactory getEntityManagerFactory() {
        if(task == null) {
            task = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }

        return task;
    }
}
