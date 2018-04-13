/**
 * 
 */
package br.com.flaprc.entidades;

import java.util.Date;
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
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private List<Carrinho> listaCarrinho;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private List<Email> listaEmail;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="USUARIO_ALCADA", joinColumns={
		@JoinColumn(name = "id_alcadas", referencedColumnName = "id_alcadas"),
		@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")})
	private List<Alcadas> listaAlcadas;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private List<Mensagem> listaMensagem;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private List<QualificacaoProduto> listaQualificacaoProduto;

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

	/**
	 * @return the listaEmail
	 */
	public List<Email> getListaEmail() {
		return listaEmail;
	}

	/**
	 * @param listaEmail the listaEmail to set
	 */
	public void setListaEmail(List<Email> listaEmail) {
		this.listaEmail = listaEmail;
	}

	/**
	 * @return the listaAlcadas
	 */
	public List<Alcadas> getListaAlcadas() {
		return listaAlcadas;
	}

	/**
	 * @param listaAlcadas the listaAlcadas to set
	 */
	public void setListaAlcadas(List<Alcadas> listaAlcadas) {
		this.listaAlcadas = listaAlcadas;
	}

	/**
	 * @return the listaMensagem
	 */
	public List<Mensagem> getListaMensagem() {
		return listaMensagem;
	}

	/**
	 * @param listaMensagem the listaMensagem to set
	 */
	public void setListaMensagem(List<Mensagem> listaMensagem) {
		this.listaMensagem = listaMensagem;
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
	
}