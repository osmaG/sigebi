package sv.com.htamayo.controller;
import sv.com.htamayo.entities.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LoginQuery {
	EntityManagerFactory emf;
	EntityManager em;
	
	public LoginQuery(){
		emf = Persistence.createEntityManagerFactory("sigebiPU");
		em = emf.createEntityManager();
		//em.getTransaction().begin(); //reservado solo para PU RESOURCE_LOCAL
	}//fin de LoginQuery
	
	public boolean loginControl(String usuario, String clave){
		try{
			Usuario u = em.createNamedQuery("Usuario.validlogin", Usuario.class).setParameter("usuario", usuario).setParameter("clave", clave).getSingleResult();
			if(u != null){
				return true;
			}
			return false;
		}
		catch(Exception e){
			return false;
		}
	}//fin de loginControl
}//fin de loginQuery
