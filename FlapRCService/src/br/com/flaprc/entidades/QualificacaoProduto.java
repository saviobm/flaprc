package br.com.flaprc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "QUALIFICACAO_PRODUTO", schema = "")
public class QualificacaoProduto extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@Column(name = "id_produto")
	private Produto produto;

}