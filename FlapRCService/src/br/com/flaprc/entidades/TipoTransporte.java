/**
 * 
 */
package br.com.flaprc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidade Tipo Transporte.
 * 
 * @author Sávio
 */
@Entity
@Table(name = "TIPO_TRANSPORTE", schema = "")
public class TipoTransporte extends FlapRCEntidade {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_transporte", columnDefinition = "id_tipo_transporte")
	private Integer id;
	
	
	

}
