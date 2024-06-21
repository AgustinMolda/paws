package ar.com.paws.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.paws.dominian.Refugio;

@Repository
public interface RefugioRepository extends JpaRepository<Refugio, Long> {

}
