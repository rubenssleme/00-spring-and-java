package com.curso2020.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso2020.curso.model.entities.Produto;
import com.curso2020.curso.repository.ProdutoRepositorio;

@Service
public class ProdutoServico {

	@Autowired
	private ProdutoRepositorio repositorio;

	public List<Produto> findAll() {
		return repositorio.findAll();

	}

	public Produto findById(Long id) {
		Optional<Produto> obj = repositorio.findById(id);
		return obj.get();
	}

	public Produto insert(Produto obj) {
		return repositorio.save(obj);
	}
}
