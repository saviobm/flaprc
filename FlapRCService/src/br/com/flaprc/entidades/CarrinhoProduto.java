package br.com.flaprc.entidades;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARRINHO_PRODUTO", schema = "")
public class CarrinhoProduto extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CarrinhoProdutoId id;
	
	@ManyToOne
	@Column(name = "id_carrinho", insertable = false, updatable = false)
	private Carrinho carrinho;
	
	@ManyToOne
	@Column(name = "id_produto", insertable = false, updatable = false)
	private Produto produto;
	
	@Column(name = "quantidade")
	private Integer quantidade;

	/**
	 * @return the id
	 */
	public CarrinhoProdutoId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(CarrinhoProdutoId id) {
		this.id = id;
	}

	/**
	 * @return the carrinho
	 */
	public Carrinho getCarrinho() {
		return carrinho;
	}

	/**
	 * @param carrinho the carrinho to set
	 */
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
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
	
}