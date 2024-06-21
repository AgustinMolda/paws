package ar.com.paws.service;

import java.util.List;

import ar.com.paws.dominian.Direccion;

public interface DireccionService {
	
	public Direccion save(Direccion direccion);
	public Direccion findById(Long id);
	public void deleteById(Long id);
	public void update(Direccion direccion);
	public List<Direccion> findAll();
	
}
