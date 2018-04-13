package br.com.flaprc.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDO", schema = "")
public class Pedido extends FlapRCEntidade {
	
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@Column(name = "id_carrinho")
	private Carrinho carrinho;
	
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
	private List<Pagamento> listaPagamento;
	
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
	private List<Historico> listaHistorico;
	
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
	private List<PontosUsuario> listaPontosUsuario;

}