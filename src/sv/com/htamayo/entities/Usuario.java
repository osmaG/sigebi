package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQueries({
@NamedQuery(name="Usuario.validlogin", query="SELECT u FROM Usuario U WHERE u.cueusu = :usuario AND u.clausu = :clave"),
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")})
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codusu;

	private String apeusu;

	private String clausu;

	private String cueusu;

	private Integer nivusu;

	private String nomusu;

	public Usuario() {
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public String getApeusu() {
		return this.apeusu;
	}

	public void setApeusu(String apeusu) {
		this.apeusu = apeusu;
	}

	public String getClausu() {
		return this.clausu;
	}

	public void setClausu(String clausu) {
		this.clausu = clausu;
	}

	public String getCueusu() {
		return this.cueusu;
	}

	public void setCueusu(String cueusu) {
		this.cueusu = cueusu;
	}

	public Integer getNivusu() {
		return this.nivusu;
	}

	public void setNivusu(Integer nivusu) {
		this.nivusu = nivusu;
	}

	public String getNomusu() {
		return this.nomusu;
	}

	public void setNomusu(String nomusu) {
		this.nomusu = nomusu;
	}

}