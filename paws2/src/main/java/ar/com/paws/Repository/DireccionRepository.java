package ar.com.paws.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.paws.dominian.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

}
