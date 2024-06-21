package ar.com.paws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.paws.Repository.AdoptanteRespository;
import ar.com.paws.dominian.Refugio;
import ar.com.paws.service.RefugioService;


@RestController
@RequestMapping("/refugio")
public class RefugioController {
	
	@Autowired
	private RefugioService refugioService;
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Refugio> findById(@PathVariable Long id){
	Refugio ref =	this.refugioService.findById(id);
		
		return ResponseEntity.ok(ref);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<String> findAll() {
		this.refugioService.findAll();
		return ResponseEntity.ok("Lista de refugios");
	}
	
	@PostMapping("/save")
	public Refugio save(@RequestBody Refugio refugio){
		Refugio ref = this.refugioService.save(refugio);
		
		return ref ;
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id){
		this.refugioService.deleteById(id);
		 
		return ResponseEntity.ok("Refugio eliminado del sistema");
	
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Refugio refugio){
		this.refugioService.update(refugio);
		
		return ResponseEntity.ok("Datos del refugio correctament actualizados");
	}
	
	
	
}
