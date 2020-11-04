package org.mateusribeiro.blogPessoal.repository;

import java.util.List;

import org.mateusribeiro.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContainIgnoreCase(String titulo);
}
