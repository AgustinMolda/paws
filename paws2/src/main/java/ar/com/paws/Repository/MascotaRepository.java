package ar.com.paws.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.paws.dominian.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

}
