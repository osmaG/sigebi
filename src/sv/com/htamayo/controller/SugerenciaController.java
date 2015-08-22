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
import sv.com.htamayo.model.SugerenciasFacade;
import sv.com.htamayo.entities.*;

@ManagedBean(name = "sugerenciacontroller")
@SessionScoped

public class SugerenciaController implements Serializable{
	@EJB
	private SugerenciasFacade ef;
	private Sugerencia e = new Sugerencia();
	
	public Sugerencia getE(){
		return e;
	}
	
	public void setE(Sugerencia e){
		this.e = e;
	}
	
	public SugerenciaController(){//constructor
		
	}
	
	public List<Sugerencia> findAll(){
		return this.ef.findAll();
	}
	
	//metodo para guardar registros nuevos en la tabla correspondiente
	public String add(){
		this.e.setFecsug( new Date() );
		System.out.println("La fecha que quiero guardar es: "+this.e.getFecsug());
		
		this.ef.create(this.e);
		this.e = new Sugerencia();
		return "versugerencia";
	}
	
	//metodo para cancelar el proceso de adicion a traves del boton cancelar
	public String cancel(){
		return "versugerencia";
	}
	
	//metodo para borrar registro de la tabla
	public void delete(Sugerencia e){
		this.ef.remove(e);
	}
	
	//metodo para ejecutar el form editeditorial
	
	public String edit(Sugerencia e){
		this.e = e;
		return "editsugerencia";
	}
	
	//metodo para actualizar la informacion editada en la tabla
	public String edit(){
		this.ef.edit(this.e);
		this.e = new Sugerencia();
		return "versugerencia";
	}

}//fin de la clase SugerenciaController
