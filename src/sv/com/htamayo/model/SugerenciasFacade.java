package sv.com.htamayo.model;

import sv.com.htamayo.entities.Sugerencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SugerenciasFacade extends AbstractFacade<Sugerencia> {
	    @PersistenceContext(unitName = "sigebiPU")
		private EntityManager em;		
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	
    public SugerenciasFacade() {
        super(Sugerencia.class);
    }	
	
}
