package br.generation.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.generation.com.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	
    public List <Tema> findAllByDescricaoContainingIgnoreCase (String descricao);


}
