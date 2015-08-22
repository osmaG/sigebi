package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the solicompbiblio database table.
 * 
 */
@Entity
@NamedQuery(name="Solicompbiblio.findAll", query="SELECT s FROM Solicompbiblio s")
public class Solicompbiblio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//private Integer codsol;

	//private Integer codcli;

	private float cossol;

	private String dessol;

	@Temporal(TemporalType.DATE)
	private Date fecsol;

	private String metasol;

	private String titsol;

	private String urlsol;

	public Solicompbiblio() {
	}

	/*public Integer getCodsol() {
		return this.codsol;
	}

	public void setCodsol(Integer codsol) {
		this.codsol = codsol;
	}

	*/
	/*public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}
*/
	public float getCossol() {
		return this.cossol;
	}

	public void setCossol(float cossol) {
		this.cossol = cossol;
	}

	public String getDessol() {
		return this.dessol;
	}

	public void setDessol(String dessol) {
		this.dessol = dessol;
	}

	public Date getFecsol() {
		return this.fecsol;
	}

	public void setFecsol(Date fecsol) {
		this.fecsol = fecsol;
	}

	public String getMetasol() {
		return this.metasol;
	}

	public void setMetasol(String metasol) {
		this.metasol = metasol;
	}

	public String getTitsol() {
		return this.titsol;
	}

	public void setTitsol(String titsol) {
		this.titsol = titsol;
	}

	public String getUrlsol() {
		return this.urlsol;
	}

	public void setUrlsol(String urlsol) {
		this.urlsol = urlsol;
	}

}