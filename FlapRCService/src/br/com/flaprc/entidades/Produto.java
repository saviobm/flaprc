package br.com.flaprc.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO", schema = "")
public class Produto extends FlapRCEntidade {
	
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_produto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
	private List<ProdutoFornecedor> listaProdutoFornecedor;
	
	@OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
	private List<CarrinhoProduto> listaCarrinhoProduto;
	
	@ManyToOne
	@Column(name = "id_estoque")
	private Estoque estoque;
	
	@ManyToOne
	@Column(name = "id_categoria")
	private Categoria categoria;
	
	@ManyToOne
	@Column(name = "id_unidade")
	private Unidade unidade;
	
	@OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
	private List<QualificacaoProduto> listaQualificacaoProduto;
	
	@OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
	private List<IntencaoProduto> listaItencaoProduto;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "id_item_produto", referencedColumnName = "id_item_produto"),
		@JoinColumn(name = "id_produto", referencedColumnName = "id_produto")})
	private List<ItemProduto> listaItemProduto;
	
	@OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
	private List<Indicacao> listaIndicacao;

	/**
	 * @return the listaProdutoFornecedor
	 */
	public List<ProdutoFornecedor> getListaProdutoFornecedor() {
		return listaProdutoFornecedor;
	}

	/**
	 * @param listaProdutoFornecedor the listaProdutoFornecedor to set
	 */
	public void setListaProdutoFornecedor(List<ProdutoFornecedor> listaProdutoFornecedor) {
		this.listaProdutoFornecedor = listaProdutoFornecedor;
	}

	/**
	 * @return the listaCarrinhoProduto
	 */
	public List<CarrinhoProduto> getListaCarrinhoProduto() {
		return listaCarrinhoProduto;
	}

	/**
	 * @param listaCarrinhoProduto the listaCarrinhoProduto to set
	 */
	public void setListaCarrinhoProduto(List<CarrinhoProduto> listaCarrinhoProduto) {
		this.listaCarrinhoProduto = listaCarrinhoProduto;
	}

	/**
	 * @return the estoque
	 */
	public Estoque getEstoque() {
		return estoque;
	}

	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
	 * @return the listaQualificacaoProduto
	 */
	public List<QualificacaoProduto> getListaQualificacaoProduto() {
		return listaQualificacaoProduto;
	}

	/**
	 * @param listaQualificacaoProduto the listaQualificacaoProduto to set
	 */
	public void setListaQualificacaoProduto(List<QualificacaoProduto> listaQualificacaoProduto) {
		this.listaQualificacaoProduto = listaQualificacaoProduto;
	}

	/**
	 * @return the listaItencaoProduto
	 */
	public List<IntencaoProduto> getListaItencaoProduto() {
		return listaItencaoProduto;
	}

	/**
	 * @param listaItencaoProduto the listaItencaoProduto to set
	 */
	public void setListaItencaoProduto(List<IntencaoProduto> listaItencaoProduto) {
		this.listaItencaoProduto = listaItencaoProduto;
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
	 * @return the listaIndicacao
	 */
	public List<Indicacao> getListaIndicacao() {
		return listaIndicacao;
	}

	/**
	 * @param listaIndicacao the listaIndicacao to set
	 */
	public void setListaIndicacao(List<Indicacao> listaIndicacao) {
		this.listaIndicacao = listaIndicacao;
	}
	
}