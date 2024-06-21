package ar.com.paws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.paws.Repository.MascotaRepository;
import ar.com.paws.builder.MascotaBuilder;
import ar.com.paws.dominian.Mascota;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class MascotaServiceImpl implements MascotaService {

	@Autowired
	private MascotaRepository mascotaRepository;
	
	@Override
	public Mascota findById(Long id) {
	
		return this.mascotaRepository.findById(id).orElse(MascotaBuilder.build());
	}

	@Override
	public Mascota save(Mascota mascota) {
		
		return this.mascotaRepository.save(mascota);
	}

	@Override
	public void deleteById(Long id) {
		
		this.mascotaRepository.deleteById(id);

	}

	@Override
	public void update(Mascota mascota) {
		
		this.mascotaRepository.save(mascota);

	}

	@Override
	public List<Mascota> findAll() {
		
		return this.mascotaRepository.findAll();
	}

}
