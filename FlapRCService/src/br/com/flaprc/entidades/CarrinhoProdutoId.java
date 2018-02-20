package br.com.flaprc.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CarrinhoProdutoId extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_carrinho")
	private Long idCarrinho;
	
	@Column(name = "id_produto")
	private Long idProduto;

	/**
	 * @return the idCarrinho
	 */
	public Long getIdCarrinho() {
		return idCarrinho;
	}

	/**
	 * @param idCarrinho the idCarrinho to set
	 */
	public void setIdCarrinho(Long idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	/**
	 * @return the idProduto
	 */
	public Long getIdProduto() {
		return idProduto;
	}

	/**
	 * @param idProduto the idProduto to set
	 */
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	
}