package ar.com.paws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.paws.dominian.Adoptante;
import ar.com.paws.service.AdoptanteService;

@RestController
@RequestMapping("/adoptante")
public class AdoptanteController {
	
	@Autowired
	private AdoptanteService adoptanteService; 
	
	
	@PostMapping("/save")
	public ResponseEntity<Adoptante> save(@RequestBody Adoptante adoptante){
		
		
		return ResponseEntity.ok(this.adoptanteService.save(adoptante));
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Adoptante> findById(@PathVariable Long id){
		Adoptante adoptante  = this.adoptanteService.findById(id);
		
		if(adoptante != null) {
			return ResponseEntity.ok(adoptante);
		}else {
			return ResponseEntity.notFound().build();
		}
		

	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id){
		this.adoptanteService.deleteById(id);
		
		return ResponseEntity.ok("adoptante eliminado");
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Adoptante adoptante){
		this.adoptanteService.update(adoptante);
		
		return ResponseEntity.ok("Datos del adoptante acutalizados!");
	}
	
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Adoptante>> findAll(){
		List<Adoptante> adoptantes = this.adoptanteService.findALl();
		
	
		return ResponseEntity.ok(adoptantes);
	}
	
}
