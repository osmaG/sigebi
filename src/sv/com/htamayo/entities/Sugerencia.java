package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sugerencias database table.
 * 
 */
@Entity
@Table(name="sugerencias")
@NamedQuery(name="Sugerencia.findAll", query="SELECT s FROM Sugerencia s")
public class Sugerencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//private Integer codsug;

	//private Integer codcli;

	private String dessug;

	@Temporal(TemporalType.DATE)
	private Date fecsug;

	private String titsug;

	public Sugerencia() {
	}

	/*public Integer getCodsug() {
		return this.codsug;
	}

	public void setCodsug(Integer codsug) {
		this.codsug = codsug;
	}
*/
/*	
	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}
*/
	public String getDessug() {
		return this.dessug;
	}

	public void setDessug(String dessug) {
		this.dessug = dessug;
	}

	//@Column(name="fecsug" ,nullable=true) 
	public Date getFecsug() {
		return this.fecsug;
	}

	public void setFecsug(Date fecsug) {
		this.fecsug = fecsug;
	}

	public String getTitsug() {
		return this.titsug;
	}

	public void setTitsug(String titsug) {
		this.titsug = titsug;
	}

}