package com.lucasdss.desafio_Beca.controller;
	
import  java.util.List ;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.modelo.Transacao;
	
	@RestController
	@RequestMapping("/transacao")
	
	public class TransacaoController {

		
		@PostMapping
		public ResponseEntity<Transacao> depositar (@RequestBody Transacao transacao){
			transacao.setIdTransacao(2L);
			return ResponseEntity.created(null).body(transacao);
		}
		

		@DeleteMapping("/{id}")
		public ResponseEntity<?> saldo (@PathVariable Long id){
			return ResponseEntity.noContent().build();
		//return ResponseEntity(HttpStatus.OK);
		}


		@GetMapping
		public ResponseEntity<List<Transacao>> listar(){

			return new ResponseEntity<List<Transacao>>(HttpStatus.OK);
		}
		
		
		@GetMapping("/{id}")
		public ResponseEntity<Transacao> lisbuscarPorId(@PathVariable Long id){
			
			return new ResponseEntity<> (HttpStatus.OK);
		}

}