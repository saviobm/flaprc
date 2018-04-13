package br.com.flaprc.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALCADAS", schema = "")
public class Alcadas extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_alcadas")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@Column(name = "id_alcadas_pai")
	private Alcadas alcadasPai;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="USUARIO_ALCADA", joinColumns={
		@JoinColumn(name = "id_alcadas", referencedColumnName = "id_alcadas"),
		@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")})
	private List<Usuario> listaUsuario;
	
	@Column(name = "sigla", length = 3)
	private String sigla;
	
	@Column(name = "descricao", length = 300)
	private String descricao;

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
	 * @return the alcadasPai
	 */
	public Alcadas getAlcadasPai() {
		return alcadasPai;
	}

	/**
	 * @param alcadasPai the alcadasPai to set
	 */
	public void setAlcadasPai(Alcadas alcadasPai) {
		this.alcadasPai = alcadasPai;
	}

	/**
	 * @return the listaUsuario
	 */
	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	/**
	 * @param listaUsuario the listaUsuario to set
	 */
	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
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

}