package ar.com.paws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.paws.Repository.DireccionRepository;
import ar.com.paws.builder.DireccionBuilder;
import ar.com.paws.dominian.Direccion;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class DireccionServiceImpl implements DireccionService {

	@Autowired
	private DireccionRepository direccionRepository;
	
	@Override
	public Direccion save(Direccion direccion) {
		
		return this.save(direccion);
	}

	@Override
	public Direccion findById(Long id) {
	
		return this.direccionRepository.findById(id).orElse(DireccionBuilder.build());
	}

	@Override
	public void deleteById(Long id) {
		
		this.direccionRepository.deleteById(id);

	}

	@Override
	public void update(Direccion direccion) {
		
		this.direccionRepository.save(direccion);

	}

	@Override
	public List<Direccion> findAll() {
		
		return this.direccionRepository.findAll();
	}

}
