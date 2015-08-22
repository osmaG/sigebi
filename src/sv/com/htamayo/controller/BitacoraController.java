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
import sv.com.htamayo.model.BitacoraFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "bitacoracontroller")
@SessionScoped

public class BitacoraController implements Serializable{
	@EJB
	private BitacoraFacade ef;
	private Bitacora e = new Bitacora();
	
	public Bitacora getE(){
		return e;
	}
	
	public void setE(Bitacora e){
		this.e = e;
	}
	
	public BitacoraController(){//constructor
		
	}
	
	public List<Bitacora> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.ef.create(this.e);
		this.e = new Bitacora();
		return "verbitacora";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "verbitacora";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Bitacora e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Bitacora e){
		this.e = e;
		return "editbitacora";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Bitacora();
		return "verbitacora";
	}

}//fin de la clase EditorialController

