package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;



/**
 * The persistent class for the editorial database table.
 * 
 */
@Entity
@Table(name = "editorial")
@XmlRootElement
@NamedQuery(name="Editorial.findAll", query="SELECT e FROM Editorial e")
public class Editorial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//private Integer codedi;

	private String ciuedi;

	private String nomedi;

	private String paiedi;

	public Editorial() {
	}
/*
	public Integer getCodedi() {
		return this.codedi;
	}

	public void setCodedi(Integer codedi) {
		this.codedi = codedi;
	}
*/
	public String getCiuedi() {
		return this.ciuedi;
	}

	public void setCiuedi(String ciuedi) {
		this.ciuedi = ciuedi;
	}

	public String getNomedi() {
		return this.nomedi;
	}

	public void setNomedi(String nomedi) {
		this.nomedi = nomedi;
	}

	public String getPaiedi() {
		return this.paiedi;
	}

	public void setPaiedi(String paiedi) {
		this.paiedi = paiedi;
	}

}