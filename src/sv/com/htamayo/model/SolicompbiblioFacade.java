package sv.com.htamayo.model;

import sv.com.htamayo.entities.Solicompbiblio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SolicompbiblioFacade extends AbstractFacade<Solicompbiblio> {
	    @PersistenceContext(unitName = "sigebiPU")
		private EntityManager em;		
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	
    public SolicompbiblioFacade() {
        super(Solicompbiblio.class);
    }	
	
}