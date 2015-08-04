package sv.com.htamayo.model;

import sv.com.htamayo.entities.Bibliografia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BibliografiaFacade extends AbstractFacade<Bibliografia> {
	    @PersistenceContext(unitName = "sigebiPU")
		private EntityManager em;		
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	
    public BibliografiaFacade() {
        super(Bibliografia.class);
    }	
	
}
