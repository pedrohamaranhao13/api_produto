package br.com.phamtecnologia.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProdutoPostDto {

	@Size(min = 8, max = 100, message = "Nome do produto deve ter de 8 a 100 caracteres.")
	@NotBlank(message = "Informe o nome do produto")
	private String nome;
	
	@NotBlank(message = "Informe a descrição do produto. ")
	private String descricao;
	
	@Min(value = 1, message = "Preço deve ser maior ou igual a 1.")
	private Double preco;
	
	@Min(value = 1, message = "Quantidade deve ser maior ou igual a 1.")
	private Integer quantidade;
	
}
