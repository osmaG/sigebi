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
import sv.com.htamayo.model.EditorialFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "editorialcontroller")
@SessionScoped

public class EditorialController implements Serializable{
	@EJB
	private EditorialFacade ef;
	private Editorial e = new Editorial();
	
	public Editorial getE(){
		return e;
	}
	
	public void setE(Editorial e){
		this.e = e;
	}
	
	public EditorialController(){//constructor
		
	}
	
	public List<Editorial> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Editorial();
		return "vereditoriales";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "vereditoriales";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Editorial e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Editorial e){
		this.e = e;
		return "editeditorial";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Editorial();
		return "vereditoriales";
	}

}//fin de la clase EditorialController
