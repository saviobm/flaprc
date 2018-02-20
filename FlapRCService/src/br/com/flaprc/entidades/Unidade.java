package br.com.flaprc.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entidade Unidade.
 * 
 * @author Sávio
 */
@Entity
@Table(name = "UNIDADE", schema = "")
public class Unidade extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_unidade")
	private Integer id;
	
	@Column(name = "sigla")
	private String sigla;
	
	@Column(name = "descricao")
	private String descricao;

	@Column(name = "valor")
	private Integer valor;
	
	@OneToMany(mappedBy = "unidade", fetch = FetchType.LAZY)
	private List<Produto> listaProduto;
	
	@OneToMany(mappedBy = "unidade", fetch = FetchType.LAZY)
	private List<ItemProduto> listaItemProduto;
	
	@OneToMany(mappedBy = "unidade", fetch = FetchType.LAZY)
	private List<TipoTransporte> listaTipoTransporte;

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
	 * @return the valor
	 */
	public Integer getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Integer valor) {
		this.valor = valor;
	}

	/**
	 * @return the listaProduto
	 */
	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	/**
	 * @param listaProduto the listaProduto to set
	 */
	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	/**
	 * @return the listaItemProduto
	 */
	public List<ItemProduto> getListaItemProduto() {
		return listaItemProduto;
	}

	/**
	 * @param listaItemProduto the listaItemProduto to set
	 */
	public void setListaItemProduto(List<ItemProduto> listaItemProduto) {
		this.listaItemProduto = listaItemProduto;
	}

	/**
	 * @return the listaTipoTransporte
	 */
	public List<TipoTransporte> getListaTipoTransporte() {
		return listaTipoTransporte;
	}

	/**
	 * @param listaTipoTransporte the listaTipoTransporte to set
	 */
	public void setListaTipoTransporte(List<TipoTransporte> listaTipoTransporte) {
		this.listaTipoTransporte = listaTipoTransporte;
	}
	
}