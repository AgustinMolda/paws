package ar.com.paws.service;

import java.util.List;

import ar.com.paws.dominian.Mascota;

public interface MascotaService {
	
	public Mascota findById(Long id);
	public Mascota save(Mascota mascota);
	public void deleteById(Long id);
	public void update(Mascota mascota);
	public List<Mascota> findAll();
}
