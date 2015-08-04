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
import sv.com.htamayo.model.BibliografiaFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "bibliografiacontroller")
@SessionScoped

public class BibliografiaController implements Serializable{
	@EJB
	private BibliografiaFacade ef;
	private Bibliografia e = new Bibliografia();
	
	public Bibliografia getE(){
		return e;
	}
	
	public void setE(Bibliografia e){
		this.e = e;
	}
	
	public BibliografiaController(){//constructor
		
	}
	
	public List<Bibliografia> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Bibliografia();
		return "verbibliografia";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "verbibliografia";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Bibliografia e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Bibliografia e){
		this.e = e;
		return "editibliografia";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Bibliografia();
		return "verbibliografia";
	}

}//fin de la clase BibliografiaController
