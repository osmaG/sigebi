package sv.com.htamayo.model;

import sv.com.htamayo.entities.Editorial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EditorialFacade extends AbstractFacade<Editorial> {
	    @PersistenceContext(unitName = "sigebiPU")
		private EntityManager em;		
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	
    public EditorialFacade() {
        super(Editorial.class);
    }	
	
}
