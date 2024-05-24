package br.com.phamtecnologia.domain.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.phamtecnologia.domain.entities.Produto;

public interface ProdutoService {

	void create (Produto produto) throws Exception;
	void update (Produto produto) throws Exception;
	void delete (UUID id) throws Exception;
	
	List<Produto> findAll() throws Exception;
	Produto findByI(UUID id) throws Exception;
}
