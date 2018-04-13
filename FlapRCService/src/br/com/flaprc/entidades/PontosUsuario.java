package br.com.flaprc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PONTOS_USUARIO", schema = "")
public class PontosUsuario extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_pontos_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@Column(name = "id_pontos")
	private Pontos pontos;
	
	@ManyToOne
	@Column(name = "id_pedido")
	private Pedido pedido;
	
	@Column(name = "qtd_pontos")
	private Integer qtdPontos;

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
	 * @return the pontos
	 */
	public Pontos getPontos() {
		return pontos;
	}

	/**
	 * @param pontos the pontos to set
	 */
	public void setPontos(Pontos pontos) {
		this.pontos = pontos;
	}

	/**
	 * @return the pedido
	 */
	public Pedido getPedido() {
		return pedido;
	}

	/**
	 * @param pedido the pedido to set
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	/**
	 * @return the qtdPontos
	 */
	public Integer getQtdPontos() {
		return qtdPontos;
	}

	/**
	 * @param qtdPontos the qtdPontos to set
	 */
	public void setQtdPontos(Integer qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	
}