package ar.com.paws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.paws.Repository.AdoptanteRespository;
import ar.com.paws.builder.AdoptanteBuilder;
import ar.com.paws.dominian.Adoptante;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdoptanteServiceImpl implements AdoptanteService {
	
	@Autowired
	private AdoptanteRespository adoptanteRepository;
	
	
	@Override
	public Adoptante save(Adoptante adoptante) {
		
		return this.adoptanteRepository.save(adoptante);
	}

	@Override
	public Adoptante findById(Long id) {
		
		return this.adoptanteRepository.findById(id).orElse(AdoptanteBuilder.build());
	}

	@Override
	public void deleteById(Long id) {
		this.adoptanteRepository.deleteById(id);

	}

	@Override
	public void update(Adoptante adoptante) {
		this.adoptanteRepository.save(adoptante);

	}

	@Override
	public List<Adoptante> findALl() {
		
		return this.adoptanteRepository.findAll();
	}

}
