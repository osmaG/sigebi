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
import sv.com.htamayo.model.AutoresFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "autorescontroller")
@SessionScoped

public class AutoresController implements Serializable{
	@EJB
	private AutoresFacade ef;
	private Autores e = new Autores();
	
	public Autores getE(){
		return e;
	}
	
	public void setE(Autores e){
		this.e = e;
	}
	
	public AutoresController(){//constructor
		
	}
	
	public List<Autores> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Autores();
		return "verautores";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "verautores";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Autores e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Autores e){
		this.e = e;
		return "editautores";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Autores();
		return "verautores";
	}

}//fin de la clase EditorialController
