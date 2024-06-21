package ar.com.paws.service;

import java.util.List;

import ar.com.paws.dominian.Refugio;

public interface RefugioService {
	
	public Refugio save(Refugio refugio);
	public Refugio findById(Long id);
	public void deleteById(Long id);
	public void update(Refugio refugio);
	public List<Refugio> findAll();
	
}
