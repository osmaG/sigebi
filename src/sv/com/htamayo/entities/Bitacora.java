package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bitacora database table.
 * 
 */
@Entity
@NamedQuery(name="Bitacora.findAll", query="SELECT b FROM Bitacora b")
public class Bitacora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codinc;

	private String desinc;

	@Temporal(TemporalType.DATE)
	private Date fecinc;

	private String titinc;

	public Bitacora() {
	}

	public Integer getCodinc() {
		return this.codinc;
	}

	public void setCodinc(Integer codinc) {
		this.codinc = codinc;
	}

	public String getDesinc() {
		return this.desinc;
	}

	public void setDesinc(String desinc) {
		this.desinc = desinc;
	}

	public Date getFecinc() {
		return this.fecinc;
	}

	public void setFecinc(Date fecinc) {
		this.fecinc = fecinc;
	}

	public String getTitinc() {
		return this.titinc;
	}

	public void setTitinc(String titinc) {
		this.titinc = titinc;
	}

}