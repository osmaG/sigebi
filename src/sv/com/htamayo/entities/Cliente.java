package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codcli;

	private String apecli;

	private String carcli;

	private String catcli;

	private String clacli;

	private String cuecli;

	@Temporal(TemporalType.DATE)
	private Date feccli;

	private String nomcli;

	public Cliente() {
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public String getApecli() {
		return this.apecli;
	}

	public void setApecli(String apecli) {
		this.apecli = apecli;
	}

	public String getCarcli() {
		return this.carcli;
	}

	public void setCarcli(String carcli) {
		this.carcli = carcli;
	}

	public String getCatcli() {
		return this.catcli;
	}

	public void setCatcli(String catcli) {
		this.catcli = catcli;
	}

	public String getClacli() {
		return this.clacli;
	}

	public void setClacli(String clacli) {
		this.clacli = clacli;
	}

	public String getCuecli() {
		return this.cuecli;
	}

	public void setCuecli(String cuecli) {
		this.cuecli = cuecli;
	}

	public Date getFeccli() {
		return this.feccli;
	}

	public void setFeccli(Date feccli) {
		this.feccli = feccli;
	}

	public String getNomcli() {
		return this.nomcli;
	}

	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}

}