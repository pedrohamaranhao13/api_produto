package br.com.phamtecnologia.domain.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phamtecnologia.domain.entities.Produto;
import br.com.phamtecnologia.domain.interfaces.ProdutoService;
import br.com.phamtecnologia.dtos.ProdutoPostDto;
import br.com.phamtecnologia.dtos.ProdutoPutDto;
import br.com.phamtecnologia.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	ProdutoRepository produtoRepository;
	
	@Override
	public void create(ProdutoPostDto dto) throws Exception {

		Produto produto = new Produto();
		
		produto.setId(UUID.randomUUID());
		produto.setNome(dto.getNome());
		produto.setPreco(new BigDecimal(dto.getPreco()));
		produto.setQuantidade(dto.getQuantidade());
		produto.setDescricao(dto.getDescricao());
		
		produtoRepository.save(produto);
	}

	@Override
	public void update(ProdutoPutDto dto) throws Exception {
		
		Produto produto = findById(dto.getId());
		
		produto.setId(dto.getId());
		produto.setNome(dto.getNome());
		produto.setPreco(new BigDecimal(dto.getPreco()));
		produto.setQuantidade(dto.getQuantidade());
		produto.setDescricao(dto.getDescricao());
		
		produtoRepository.save(produto);
	}

	@Override
	public void delete(UUID id) throws Exception {
		Produto produto = findById(id);
		produtoRepository.delete(produto);
	}

	@Override
	public List<Produto> findAll() throws Exception {
		return (List<Produto>) produtoRepository.findAll();
	}

	@Override
	public Produto findById(UUID id) throws Exception {
		Optional<Produto> produto = produtoRepository.findById(id);
		if (produto.isEmpty()) 
			throw new IllegalArgumentException("Produto não encontrado. Verifique o ID informado.");
		
		return produto.get();
	}

}
