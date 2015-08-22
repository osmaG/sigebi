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
import sv.com.htamayo.model.CatbibliografiaFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "catbibliografiacontroller")
@SessionScoped

public class CatbibliografiaController implements Serializable{
	@EJB
	private CatbibliografiaFacade ef;
	private Catbibliografia e = new Catbibliografia();
	
	public Catbibliografia getE(){
		return e;
	}
	
	public void setE(Catbibliografia e){
		this.e = e;
	}
	
	public CatbibliografiaController(){//constructor
		
	}
	
	public List<Catbibliografia> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Catbibliografia();
		return "vercatbibliografia";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "vercatbibliografia";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Catbibliografia e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Catbibliografia e){
		this.e = e;
		return "editcatbibliografia";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Catbibliografia();
		return "vercatbibliografia";
	}

}//fin de la clase CatbibliografiaController
