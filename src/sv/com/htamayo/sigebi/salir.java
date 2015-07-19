package sv.com.htamayo.sigebi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.jboss.logging.Logger;
import sv.com.htamayo.sigebi.*;

@ManagedBean(name="salir")
@SessionScoped


public class salir {
	//Todo: rutina de bitacora de todo el sistema
	public String salir(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "salir";
	}
}
