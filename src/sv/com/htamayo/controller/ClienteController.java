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
import sv.com.htamayo.model.ClienteFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "clientecontroller")
@SessionScoped

public class ClienteController implements Serializable{
	@EJB
	private ClienteFacade ef;
	private Cliente e = new Cliente();
	
	public Cliente getE(){
		return e;
	}
	
	public void setE(Cliente e){
		this.e = e;
	}
	
	public ClienteController(){//constructor
		
	}
	
	public List<Cliente> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Cliente();
		return "verclientes";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "verclientes";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Cliente e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Cliente e){
		this.e = e;
		return "editclientes";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Cliente();
		return "verclientes";
	}

}//fin de la clase EditorialController
