package com.lucasdss.desafio_Beca.repository;

<<<<<<< Updated upstream
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasdss.desafio_Beca.modelo.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Optional<Pessoa> findByNome(String nome);
	Pessoa findByCpf (String cpf);
	Pessoa salvar(Pessoa pessoa);
=======
import  java.util.Optional ;

import  org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;
import  com.lucasdss.desafio_Beca.modelo.Pessoa;

@Repository
public class PessoaRepository {
	
	 public interface PessoaService extends JpaRepository<Pessoa, Long> {
		 
		Optional<Pessoa> findByNome (String nome);
		Pessoa findByCpf (String cpf);
	}
>>>>>>> Stashed changes

}