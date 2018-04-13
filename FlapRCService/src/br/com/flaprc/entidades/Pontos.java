package br.com.flaprc.entidades;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PONTOS", schema = "")
public class Pontos extends FlapRCEntidade {
	
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_pontos")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "qtd_pontos_valor")
	private BigDecimal qtdPontosValor;
	
	@Column(name = "qtd_pontos_pedido")
	private Integer qtdPontosPedido;
	
	@Column(name = "descricao", length = 200)
	private String descricao;
	
	@Column(name = "pedido")
	private Boolean pedido;
	
	@Column(name = "valor")
	private Boolean valor;
	
	@OneToMany(mappedBy = "pontos", fetch = FetchType.LAZY)
	private List<PontosUsuario> listaPontosUsuario;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the qtdPontosValor
	 */
	public BigDecimal getQtdPontosValor() {
		return qtdPontosValor;
	}

	/**
	 * @param qtdPontosValor the qtdPontosValor to set
	 */
	public void setQtdPontosValor(BigDecimal qtdPontosValor) {
		this.qtdPontosValor = qtdPontosValor;
	}

	/**
	 * @return the qtdPontosPedido
	 */
	public Integer getQtdPontosPedido() {
		return qtdPontosPedido;
	}

	/**
	 * @param qtdPontosPedido the qtdPontosPedido to set
	 */
	public void setQtdPontosPedido(Integer qtdPontosPedido) {
		this.qtdPontosPedido = qtdPontosPedido;
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
	 * @return the pedido
	 */
	public Boolean getPedido() {
		return pedido;
	}

	/**
	 * @param pedido the pedido to set
	 */
	public void setPedido(Boolean pedido) {
		this.pedido = pedido;
	}

	/**
	 * @return the valor
	 */
	public Boolean getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Boolean valor) {
		this.valor = valor;
	}

	/**
	 * @return the listaPontosUsuario
	 */
	public List<PontosUsuario> getListaPontosUsuario() {
		return listaPontosUsuario;
	}

	/**
	 * @param listaPontosUsuario the listaPontosUsuario to set
	 */
	public void setListaPontosUsuario(List<PontosUsuario> listaPontosUsuario) {
		this.listaPontosUsuario = listaPontosUsuario;
	}
	
}