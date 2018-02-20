/**
 * 
 */
package br.com.flaprc.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entidade Imagem.
 * 
 * @author Sávio
 */
@Entity
@Table(name = "IMAGEM", schema = "")
public class Imagem extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_imagem")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Lob
	@Column(name = "imagem")
	private byte [] imagem;
	
	@Column(name = "descricao", length = 200)
	private String descricao;
	
	@OneToMany(mappedBy = "imagem", fetch = FetchType.LAZY)
	private List<Carrinho> listaCarrinho;

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
	 * @return the imagem
	 */
	public byte[] getImagem() {
		return imagem;
	}

	/**
	 * @param imagem the imagem to set
	 */
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
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
	 * @return the listaCarrinho
	 */
	public List<Carrinho> getListaCarrinho() {
		return listaCarrinho;
	}

	/**
	 * @param listaCarrinho the listaCarrinho to set
	 */
	public void setListaCarrinho(List<Carrinho> listaCarrinho) {
		this.listaCarrinho = listaCarrinho;
	}
	
}