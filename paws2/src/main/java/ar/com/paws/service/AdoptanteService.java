package ar.com.paws.service;

import java.util.List;

import ar.com.paws.dominian.Adoptante;

public interface AdoptanteService {
	public Adoptante save(Adoptante adoptante);
	public Adoptante findById(Long id);
	public void deleteById(Long id);
	public void update(Adoptante adoptante);
	public List<Adoptante> findALl();
}
