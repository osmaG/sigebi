package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the autores database table.
 * 
 */
@Entity
@NamedQuery(name="Autores.findAll", query="SELECT a FROM Autores a")
public class Autores implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//private Integer codaut;

	private String apeaut;

	private String maiaut;

	private String nomaut;

	private String paiaut;

	private String tipaut;

	private String twiaut;

	private String webaut;

	public Autores() {
	}
/*
	public Integer getCodaut() {
		return this.codaut;
	}

	public void setCodaut(Integer codaut) {
		this.codaut = codaut;
	}
*/
	public String getApeaut() {
		return this.apeaut;
	}

	public void setApeaut(String apeaut) {
		this.apeaut = apeaut;
	}

	public String getMaiaut() {
		return this.maiaut;
	}

	public void setMaiaut(String maiaut) {
		this.maiaut = maiaut;
	}

	public String getNomaut() {
		return this.nomaut;
	}

	public void setNomaut(String nomaut) {
		this.nomaut = nomaut;
	}

	public String getPaiaut() {
		return this.paiaut;
	}

	public void setPaiaut(String paiaut) {
		this.paiaut = paiaut;
	}

	public String getTipaut() {
		return this.tipaut;
	}

	public void setTipaut(String tipaut) {
		this.tipaut = tipaut;
	}

	public String getTwiaut() {
		return this.twiaut;
	}

	public void setTwiaut(String twiaut) {
		this.twiaut = twiaut;
	}

	public String getWebaut() {
		return this.webaut;
	}

	public void setWebaut(String webaut) {
		this.webaut = webaut;
	}

}