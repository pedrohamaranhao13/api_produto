package br.com.phamtecnologia.domain.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.phamtecnologia.domain.entities.Produto;
import br.com.phamtecnologia.dtos.ProdutoPostDto;
import br.com.phamtecnologia.dtos.ProdutoPutDto;

public interface ProdutoService {

	void create (ProdutoPostDto dto) throws Exception;
	void update (ProdutoPutDto dto) throws Exception;
	void delete (UUID id) throws Exception;
	
	List<Produto> findAll() throws Exception;
	Produto findById(UUID id) throws Exception;
}
