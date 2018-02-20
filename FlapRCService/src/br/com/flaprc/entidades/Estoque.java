package br.com.flaprc.entidades;

import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "ESTOQUE", schema = "")
public class Estoque extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_estoque")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valor_entrada", precision = 12, scale = 2)
	private BigDecimal valorEntrada;
	
	@Column(name = "data_entrada")
	private Date dataEntrada;
	
	@Column(name = "data_expiracao")
	private Date dataExpiracao;
	
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@Column(name = "perc_desconto", precision = 4, scale = 2)
	private Double percDesconto;
	
	@Column(name = "estimativa_venda")
	private Integer estimativaVenda;
	
	@OneToMany(mappedBy = "estoque", fetch = FetchType.LAZY)
	private List<Produto> listaProduto;

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
	 * @return the valorEntrada
	 */
	public BigDecimal getValorEntrada() {
		return valorEntrada;
	}

	/**
	 * @param valorEntrada the valorEntrada to set
	 */
	public void setValorEntrada(BigDecimal valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	/**
	 * @return the dataEntrada
	 */
	public Date getDataEntrada() {
		return dataEntrada;
	}

	/**
	 * @param dataEntrada the dataEntrada to set
	 */
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	/**
	 * @return the dataExpiracao
	 */
	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	/**
	 * @param dataExpiracao the dataExpiracao to set
	 */
	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	/**
	 * @return the quantidade
	 */
	public Integer getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return the percDesconto
	 */
	public Double getPercDesconto() {
		return percDesconto;
	}

	/**
	 * @param percDesconto the percDesconto to set
	 */
	public void setPercDesconto(Double percDesconto) {
		this.percDesconto = percDesconto;
	}

	/**
	 * @return the estimativaVenda
	 */
	public Integer getEstimativaVenda() {
		return estimativaVenda;
	}

	/**
	 * @param estimativaVenda the estimativaVenda to set
	 */
	public void setEstimativaVenda(Integer estimativaVenda) {
		this.estimativaVenda = estimativaVenda;
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
	
}