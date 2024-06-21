package ar.com.paws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.paws.Repository.RefugioRepository;
import ar.com.paws.builder.RefugioBuilder;
import ar.com.paws.dominian.Refugio;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RefugioServiceImpl implements RefugioService {
	
	@Autowired
	private RefugioRepository refugioRepository;
	
	@Override
	public Refugio save(Refugio refugio) {
	
		return this.refugioRepository.save(refugio);
	}

	@Override
	public Refugio findById(Long id) {
		
		return this.refugioRepository.findById(id).orElse(RefugioBuilder.build());
	}

	@Override
	public void deleteById(Long id) {
		
		this.refugioRepository.deleteById(id);
		
	}

	@Override
	public void update(Refugio refugio) {
		
		this.refugioRepository.save(refugio);
		
	}

	@Override
	public List<Refugio> findAll() {
		
		return this.refugioRepository.findAll();
	}

}
