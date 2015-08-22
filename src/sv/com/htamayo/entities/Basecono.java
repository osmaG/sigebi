package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bconoc database table.
 * 
 */
@Entity
@Table(name="bconoc")
@NamedQuery(name="Basecono.findAll", query="SELECT b FROM Basecono b")
public class Basecono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codtem;

	private Integer codcli;

	private Integer coddoc;

	private String destem;

	@Temporal(TemporalType.DATE)
	private Date fputem;

	private String metatem;

	private String tittem;

	public Basecono() {
	}

	public Integer getCodtem() {
		return this.codtem;
	}

	public void setCodtem(Integer codtem) {
		this.codtem = codtem;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public Integer getCoddoc() {
		return this.coddoc;
	}

	public void setCoddoc(Integer coddoc) {
		this.coddoc = coddoc;
	}

	public String getDestem() {
		return this.destem;
	}

	public void setDestem(String destem) {
		this.destem = destem;
	}

	public Date getFputem() {
		return this.fputem;
	}

	public void setFputem(Date fputem) {
		this.fputem = fputem;
	}

	public String getMetatem() {
		return this.metatem;
	}

	public void setMetatem(String metatem) {
		this.metatem = metatem;
	}

	public String getTittem() {
		return this.tittem;
	}

	public void setTittem(String tittem) {
		this.tittem = tittem;
	}

}