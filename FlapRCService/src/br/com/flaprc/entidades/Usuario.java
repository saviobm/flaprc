/**
 * 
 */
package br.com.flaprc.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidade Usuario.
 * 
 * @author Sávio
 */
@Entity
@Table(name = "USUARIO", schema = "")
public class Usuario extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_classificacao_usuario", referencedColumnName = "id_classificacao_usuario", insertable = false, updatable = false)
	private ClassificacaoUsuario classificacaoUsuario;
	
	@ManyToOne
	@JoinColumn(name = "id_imagem", referencedColumnName = "id_imagem", insertable = false, updatable = false)
	private Imagem imagem;
	
	@Column(name = "nome", length = 300)
	private String nome;
	
	@Column(name = "login", length = 20)
	private String login;
	
	@Column(name = "ativo")
	private Boolean ativo;
	
	@Column(name = "senha", length = 20)
	private String senha;
	
	@Column(name = "cpf", length = 11)
	private String cpf;
	
	@Column(name = "data_nascimento", length = 11)
	private Date dataNascimento;
	
	@Column(name = "qtd_pedidos", length = 11)
	private Integer qtdPedidos;

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
	 * @return the classificacaoUsuario
	 */
	public ClassificacaoUsuario getClassificacaoUsuario() {
		return classificacaoUsuario;
	}

	/**
	 * @param classificacaoUsuario the classificacaoUsuario to set
	 */
	public void setClassificacaoUsuario(ClassificacaoUsuario classificacaoUsuario) {
		this.classificacaoUsuario = classificacaoUsuario;
	}

	/**
	 * @return the imagem
	 */
	public Imagem getImagem() {
		return imagem;
	}

	/**
	 * @param imagem the imagem to set
	 */
	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
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
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the qtdPedidos
	 */
	public Integer getQtdPedidos() {
		return qtdPedidos;
	}

	/**
	 * @param qtdPedidos the qtdPedidos to set
	 */
	public void setQtdPedidos(Integer qtdPedidos) {
		this.qtdPedidos = qtdPedidos;
	}
	
}