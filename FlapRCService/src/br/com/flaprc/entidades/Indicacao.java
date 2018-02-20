package br.com.flaprc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INDICACAO", schema = "")
public class Indicacao {
	
	@ManyToOne
	@Column(name = "id_combo")
	private Combo combo;
	
	@ManyToOne
	@Column(name = "id_produto")
	private Produto produto;
	
	

}
