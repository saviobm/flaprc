package br.com.flaprc.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_PRODUTO", schema = "")
public class ItemProduto {
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="PRODUTO_ITEM_PRODUTO", joinColumns={
		@JoinColumn(name = "id_item_produto", referencedColumnName = "id_item_produto"),
		@JoinColumn(name = "id_produto", referencedColumnName = "id_produto")})
	private List<Produto> listaProduto;

}