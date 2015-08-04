package sv.com.htamayo.controller;

import java.io.Serializable;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.postgresql.util.PSQLException;
import org.primefaces.context.RequestContext;

@ManagedBean(name="login")
@SessionScoped

public class LoginController implements Serializable {
	
	private String usuario;
	private String clave;
	private int nivel; //nivel de usuario logeado
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
	
	public int getNivel(){
		return nivel;
	}
	public void setNivel(int nivel){
		this.nivel=nivel;
	}
	
	
	//metodo para validar el login, accionado por el boton conectar de inicio.xhtml
	public String loginControl()throws SQLException{
		int xnivel=0;
		String respuesta="";
		System.out.println("las credenciales introducidas fueron: usuario: "+this.getUsuario()+" palabra clave: "+this.getClave());
		System.out.println("iniciando proceso de validacion:");
		try{
			xnivel = query.loginControl(usuario, clave);
			System.out.println("el valor del nivel usuario es: "+xnivel);
			if(xnivel>0){
				System.out.println("las credenciales son validas");
				this.setNivel(xnivel);
				respuesta="escritorio.xhtml?faces-redirect=true";
			}
			else{
				System.out.println("credenciales equivocadas");
				RequestContext.getCurrentInstance().update("growl");
				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuario o Clave Incorrectos"));
				respuesta="";							
			}
		}
		catch(ClassCastException sqle){
			sqle.printStackTrace();//sustituir esto por la rutina de logs
		}
		catch(Exception e){
			System.out.println("Ocurrio un error no documentado");
			e.printStackTrace();//sustituir esto por la rutina de logs
		}	
		return respuesta;		

	}//fin de loginControl

}//fin de loginController
