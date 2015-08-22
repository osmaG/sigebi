package sv.com.htamayo.model;

import sv.com.htamayo.entities.Catbibliografia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CatbibliografiaFacade extends AbstractFacade<Catbibliografia> {
	    @PersistenceContext(unitName = "sigebiPU")
		private EntityManager em;		
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	
    public CatbibliografiaFacade() {
        super(Catbibliografia.class);
    }	
	
}