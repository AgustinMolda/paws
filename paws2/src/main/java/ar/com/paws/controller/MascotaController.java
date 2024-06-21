package ar.com.paws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.paws.dominian.Mascota;
import ar.com.paws.service.MascotaService;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
	
	@Autowired
	private MascotaService mascotaService;
	
	
	@GetMapping("/find/{id}")
	public ResponseEntity<String> findById(@PathVariable Long id){
		this.mascotaService.findById(id);
		return ResponseEntity.ok("Mascota encontrada");
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<String> findAll(){
		this.mascotaService.findAll();
		
		return ResponseEntity.ok("Lista de mascotas");
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<Mascota> save(@RequestBody Mascota mascota){
		
		
		return ResponseEntity.ok(this.mascotaService.save(mascota));
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		this.mascotaService.deleteById(id);
		
		return ResponseEntity.ok("Mascota fuera del sistema");
	}
	
	public ResponseEntity<String> update(@RequestBody Mascota mascota){
		this.mascotaService.update(mascota);
		
		return ResponseEntity.ok("Datos de la mascota correctamente acutalizado");
	}
	
	
}
