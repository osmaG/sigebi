package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catbibliografia database table.
 * 
 */
@Entity
@NamedQuery(name="Catbibliografia.findAll", query="SELECT c FROM Catbibliografia c")
public class Catbibliografia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//private Integer codcbi;

	private String descbi;

	private String nomcbi;

	public Catbibliografia() {
	}
/*
	public Integer getCodcbi() {
		return this.codcbi;
	}

	public void setCodcbi(Integer codcbi) {
		this.codcbi = codcbi;
	}
*/
	public String getDescbi() {
		return this.descbi;
	}

	public void setDescbi(String descbi) {
		this.descbi = descbi;
	}

	public String getNomcbi() {
		return this.nomcbi;
	}

	public void setNomcbi(String nomcbi) {
		this.nomcbi = nomcbi;
	}

}