package sv.com.htamayo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
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
 * The persistent class for the bibliografia database table.
 * 
 */
@Entity
@Table(name = "bibliografia")
@XmlRootElement
@NamedQuery(name="Bibliografia.findAll", query="SELECT b FROM Bibliografia b")
public class Bibliografia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//private Integer codbib;

	private Integer codaut;

	private Integer codcbi;

	private Integer coddoc;

	private Integer codedi;

	private Integer codusu;

	private String edibib;

	@Temporal(TemporalType.DATE)
	private Date fcobib;

	private String fenbib;

	@Temporal(TemporalType.DATE)
	private Date fpubib;

	private String idibib;

	private String isbbib;

	private String metabib;

	private String nejbib;

	private String notbib;

	private String nvobib;

	private Integer pagbib;

	private float prebib;

	private String resbib;

	private String tambib;

	private String titbib;

	private String tlibib;

	private String ubibib;

	private String vadbib;

	public Bibliografia() {
	}
/*
	public Integer getCodbib() {
		return this.codbib;
	}

	public void setCodbib(Integer codbib) {
		this.codbib = codbib;
	}
*/
	public Integer getCodaut() {
		return this.codaut;
	}

	public void setCodaut(Integer codaut) {
		this.codaut = codaut;
	}

	public Integer getCodcbi() {
		return this.codcbi;
	}

	public void setCodcbi(Integer codcbi) {
		this.codcbi = codcbi;
	}

	public Integer getCoddoc() {
		return this.coddoc;
	}

	public void setCoddoc(Integer coddoc) {
		this.coddoc = coddoc;
	}

	public Integer getCodedi() {
		return this.codedi;
	}

	public void setCodedi(Integer codedi) {
		this.codedi = codedi;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public String getEdibib() {
		return this.edibib;
	}

	public void setEdibib(String edibib) {
		this.edibib = edibib;
	}

	public Date getFcobib() {
		return this.fcobib;
	}

	public void setFcobib(Date fcobib) {
		this.fcobib = fcobib;
	}

	public String getFenbib() {
		return this.fenbib;
	}

	public void setFenbib(String fenbib) {
		this.fenbib = fenbib;
	}

	public Date getFpubib() {
		return this.fpubib;
	}

	public void setFpubib(Date fpubib) {
		this.fpubib = fpubib;
	}

	public String getIdibib() {
		return this.idibib;
	}

	public void setIdibib(String idibib) {
		this.idibib = idibib;
	}

	public String getIsbbib() {
		return this.isbbib;
	}

	public void setIsbbib(String isbbib) {
		this.isbbib = isbbib;
	}

	public String getMetabib() {
		return this.metabib;
	}

	public void setMetabib(String metabib) {
		this.metabib = metabib;
	}

	public String getNejbib() {
		return this.nejbib;
	}

	public void setNejbib(String nejbib) {
		this.nejbib = nejbib;
	}

	public String getNotbib() {
		return this.notbib;
	}

	public void setNotbib(String notbib) {
		this.notbib = notbib;
	}

	public String getNvobib() {
		return this.nvobib;
	}

	public void setNvobib(String nvobib) {
		this.nvobib = nvobib;
	}

	public Integer getPagbib() {
		return this.pagbib;
	}

	public void setPagbib(Integer pagbib) {
		this.pagbib = pagbib;
	}

	public float getPrebib() {
		return this.prebib;
	}

	public void setPrebib(float prebib) {
		this.prebib = prebib;
	}

	public String getResbib() {
		return this.resbib;
	}

	public void setResbib(String resbib) {
		this.resbib = resbib;
	}

	public String getTambib() {
		return this.tambib;
	}

	public void setTambib(String tambib) {
		this.tambib = tambib;
	}

	public String getTitbib() {
		return this.titbib;
	}

	public void setTitbib(String titbib) {
		this.titbib = titbib;
	}

	public String getTlibib() {
		return this.tlibib;
	}

	public void setTlibib(String tlibib) {
		this.tlibib = tlibib;
	}

	public String getUbibib() {
		return this.ubibib;
	}

	public void setUbibib(String ubibib) {
		this.ubibib = ubibib;
	}

	public String getVadbib() {
		return this.vadbib;
	}

	public void setVadbib(String vadbib) {
		this.vadbib = vadbib;
	}

}