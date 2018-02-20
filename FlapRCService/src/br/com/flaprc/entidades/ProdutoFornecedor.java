package br.com.flaprc.entidades;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO_FORNECEDOR", schema = "")
public class ProdutoFornecedor extends FlapRCEntidade {
	
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_produto_fornecedor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@ManyToOne
	@JoinColumn(name = "id_fornecedor", referencedColumnName = "id_fornecedor")
	private Fornecedor fornecedor;
	
	@ManyToOne
	@JoinColumn(name = "id_produto", referencedColumnName = "id_produto")
	private Produto produto;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "perc_desconto")
	private BigDecimal percDesconto;
	
	@Column(name = "qtd_desconto")
	private Integer qtdDesconto;

	/**
	 * @return the fornecedor
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	/**
	 * @return the percDesconto
	 */
	public BigDecimal getPercDesconto() {
		return percDesconto;
	}

	/**
	 * @param percDesconto the percDesconto to set
	 */
	public void setPercDesconto(BigDecimal percDesconto) {
		this.percDesconto = percDesconto;
	}

	/**
	 * @return the qtdDesconto
	 */
	public Integer getQtdDesconto() {
		return qtdDesconto;
	}

	/**
	 * @param qtdDesconto the qtdDesconto to set
	 */
	public void setQtdDesconto(Integer qtdDesconto) {
		this.qtdDesconto = qtdDesconto;
	}
	
}