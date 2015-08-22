package sv.com.htamayo.controller;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import java.util.*;
import javax.ejb.EJB;
import sv.com.htamayo.model.UsuarioFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "usuariocontroller")
@SessionScoped

public class UsuarioController implements Serializable{
	@EJB
	private UsuarioFacade ef;
	private Usuario e = new Usuario();
	
	public Usuario getE(){
		return e;
	}
	
	public void setE(Usuario e){
		this.e = e;
	}
	
	public UsuarioController(){//constructor
		
	}
	
	public List<Usuario> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Usuario();
		return "verusuarios";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "verusuarios";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Usuario e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Usuario e){
		this.e = e;
		return "editusuarios";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Usuario();
		return "verusuarios";
	}

}//fin de la clase EditorialController

