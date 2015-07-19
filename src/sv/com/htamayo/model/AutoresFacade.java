package sv.com.htamayo.model;

import sv.com.htamayo.entities.Autores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AutoresFacade extends AbstractFacade<Autores> {
	    @PersistenceContext(unitName = "sigebiPU")
		private EntityManager em;		
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	
    public AutoresFacade() {
        super(Autores.class);
    }	
	
}
