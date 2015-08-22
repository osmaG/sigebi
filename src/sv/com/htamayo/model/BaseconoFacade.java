package sv.com.htamayo.model;

import sv.com.htamayo.entities.Basecono;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BaseconoFacade extends AbstractFacade<Basecono> {
	    @PersistenceContext(unitName = "sigebiPU")
		private EntityManager em;		
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	
    public BaseconoFacade() {
        super(Basecono.class);
    }	
	
}