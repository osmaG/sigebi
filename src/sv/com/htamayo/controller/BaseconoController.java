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
import sv.com.htamayo.model.BaseconoFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "baseconocontroller")
@SessionScoped

public class BaseconoController implements Serializable{
	@EJB
	private BaseconoFacade ef;
	private Basecono e = new Basecono();
	
	public Basecono getE(){
		return e;
	}
	
	public void setE(Basecono e){
		this.e = e;
	}
	
	public BaseconoController(){//constructor
		
	}
	
	public List<Basecono> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Basecono();
		return "verbasecono";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "verbasecono";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Basecono e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Basecono e){
		this.e = e;
		return "editbasecono";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Basecono();
		return "verbasecono";
	}

}//fin de la clase EditorialController
