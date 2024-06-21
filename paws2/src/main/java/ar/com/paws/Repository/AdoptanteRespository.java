package ar.com.paws.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.paws.dominian.Adoptante;

@Repository
public interface AdoptanteRespository extends JpaRepository<Adoptante, Long> {

}
