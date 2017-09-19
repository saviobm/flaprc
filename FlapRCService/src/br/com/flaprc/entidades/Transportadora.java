package br.com.flaprc.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidade Transportadora
 * 
 * @author Sávio
 */
@Entity
@Table(name = "TRANSPORTADORA", schema = "")
public class Transportadora extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_transportadora")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome_fantasia")
	private String nomeFantasia;
	
	@Column(name = "cnpj", length = 14)
	private String cnpj;
	
	@Column(name = "descricao", length = 200)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco", insertable = false, updatable = false)
	private Endereco endereco;
	
	@ManyToMany
	@JoinColumns(value = {
			@JoinColumn(name = "id_transportadora", referencedColumnName = "id_transportadora", insertable = false, updatable = false),
			@JoinColumn(name = "id_tipo_transporte", referencedColumnName = "id_tipo_transporte", insertable = false, updatable = false)
	})
	private List<TipoTransporte> listaTransporte;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the listaTransporte
	 */
	public List<TipoTransporte> getListaTransporte() {
		return listaTransporte;
	}

	/**
	 * @param listaTransporte the listaTransporte to set
	 */
	public void setListaTransporte(List<TipoTransporte> listaTransporte) {
		this.listaTransporte = listaTransporte;
	}
	
}