/**
 * 
 */
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
 * Entidade Tipo Transporte.
 * 
 * @author Sávio
 */
@Entity
@Table(name = "TIPO_TRANSPORTE", schema = "")
public class TipoTransporte extends FlapRCEntidade {
	
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_transporte")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_unidade", columnDefinition = "id_unidade", insertable = false, updatable = false)
	private Unidade unidade;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "sigla")
	private String sigla;
	
	@Column(name = "valor_unidade")
	private Double valor;
	
	@ManyToMany
	@JoinColumns(value = {
			@JoinColumn(name = "id_transportadora", referencedColumnName = "id_transportadora", insertable = false, updatable = false),
			@JoinColumn(name = "id_tipo_transporte", referencedColumnName = "id_tipo_transporte", insertable = false, updatable = false)
	})
	private List<Transportadora> listaTransportadora;

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
	 * @return the unidade
	 */
	public Unidade getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
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
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * @return the listaTransportadora
	 */
	public List<Transportadora> getListaTransportadora() {
		return listaTransportadora;
	}

	/**
	 * @param listaTransportadora the listaTransportadora to set
	 */
	public void setListaTransportadora(List<Transportadora> listaTransportadora) {
		this.listaTransportadora = listaTransportadora;
	}

}