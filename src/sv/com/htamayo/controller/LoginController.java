package sv.com.htamayo.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

@ManagedBean(name="login")
@SessionScoped

public class LoginController implements Serializable {
	
	private String usuario;
	private String clave;
	private final LoginQuery query = new LoginQuery();
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	//metodo para validar el login, accionado por el boton conectar de inicio.xhtml
	public String loginControl(){
		System.out.println("las credenciales introducidas fueron: usuario: "+this.getUsuario()+" palabra clave: "+this.getClave());
		System.out.println("iniciando proceso de validacion:");
		if(query.loginControl(usuario, clave)){
			System.out.println("las credenciales son validas");
            return "escritorio.xhtml?faces-redirect=true";
		}
		else{
			System.out.println("credenciales equivocadas");
		}
		RequestContext.getCurrentInstance().update("growl");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuario o Clave Incorrectos"));
		return "";
	}
	

}
