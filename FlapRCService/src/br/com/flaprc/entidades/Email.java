package br.com.flaprc.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMAIL", schema = "")
public class Email extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_email")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@Column(name = "id_usuario")
	private Usuario usuario;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "ativo")
	private Boolean ativo;
	
	@OneToMany(mappedBy = "email", fetch = FetchType.LAZY)
	private List<Indicacao> listaIndicacao;

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
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the ativo
	 */
	public Boolean getAtivo() {
		return ativo;
	}

	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
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