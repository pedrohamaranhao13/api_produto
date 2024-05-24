package br.com.phamtecnologia.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_produto")
@Data
public class Produto {

	@Id
	@Column(name = "id_pk")
	private UUID id;
	
	@Column(name = "nome", length = 50, nullable =false)
	private String nome;
	
	@Column(name = "descricao", length = 150, nullable =false)
	private String descricao;
	
	@Column(name = "preco", precision = 10, scale = 2 , nullable =false)
	private BigDecimal preco;
	
	@Column(name = "quantidade", nullable = false)
	private Integer quantidade;
}
