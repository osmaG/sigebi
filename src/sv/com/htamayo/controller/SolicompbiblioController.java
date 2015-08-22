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
import sv.com.htamayo.model.SolicompbiblioFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "solicompbibliocontroller")
@SessionScoped

public class SolicompbiblioController implements Serializable{
	@EJB
	private SolicompbiblioFacade ef;
	private Solicompbiblio e = new Solicompbiblio();
	
	public Solicompbiblio getE(){
		return e;
	}
	
	public void setE(Solicompbiblio e){
		this.e = e;
	}
	
	public SolicompbiblioController(){//constructor
		
	}
	
	public List<Solicompbiblio> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Solicompbiblio();
		return "versolicompbiblio";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "versolicompbiblio";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Solicompbiblio e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Solicompbiblio e){
		this.e = e;
		return "editsolicompbiblio";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Solicompbiblio();
		return "versolicompbiblio";
	}

}//fin de la clase SolicompbiblioController
