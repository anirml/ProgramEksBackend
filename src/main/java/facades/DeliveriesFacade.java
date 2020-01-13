package facades;

import entities.RenameMe;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class DeliveriesFacade {

    private static DeliveriesFacade instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private DeliveriesFacade() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static DeliveriesFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new DeliveriesFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    //TODO Remove/Change this before use
    public long getDeliveriesCount(){
        EntityManager em = emf.createEntityManager();
        try{
            long DeliveriesCount = (long)em.createQuery("SELECT COUNT(r) FROM Deliveries r").getSingleResult();
            return DeliveriesCount;
        }finally{  
            em.close();
        }
        
    }

}
