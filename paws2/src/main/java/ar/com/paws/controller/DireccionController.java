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

import ar.com.paws.dominian.Direccion;
import ar.com.paws.service.DireccionService;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

	@Autowired
	private DireccionService direccionService;
	
	@GetMapping("/find/{id}")
	public ResponseEntity<String> findById(@PathVariable Long id){
		this.direccionService.findById(id);
		return ResponseEntity.ok("Direccion encontrada");
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<String> findAll(){
		this.direccionService.findAll();
		return ResponseEntity.ok("Lista de direcciones");
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Direccion direccion){
		this.direccionService.save(direccion);
		
		return ResponseEntity.ok("direccion guardada correctamente");
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id){
		this.direccionService.deleteById(id);
		
		return ResponseEntity.ok("Direccion elmininada del sistema");
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Direccion direccion){
		this.direccionService.update(direccion);
		return ResponseEntity.ok("Datos de la direccion actualizados correctamente");
	}
	
}
