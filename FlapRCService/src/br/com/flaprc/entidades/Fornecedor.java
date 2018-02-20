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

@Entity
@Table(name = "FORNECEDOR", schema = "")
public class Fornecedor extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idFornecedor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFornecedor;
	
	@Column(name = "nomeFantasia")
	private String nomeFantasia;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "observacao")
	private String observacao;
	
	@OneToMany(mappedBy = "fornecedor", fetch = FetchType.LAZY)
	private List<ProdutoFornecedor> listaProdutoFornecedor;

	/**
	 * @return the idFornecedor
	 */
	public Long getIdFornecedor() {
		return idFornecedor;
	}

	/**
	 * @param idFornecedor the idFornecedor to set
	 */
	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
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
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

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

}