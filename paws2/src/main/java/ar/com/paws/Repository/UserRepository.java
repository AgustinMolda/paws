package ar.com.paws.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.paws.dominian.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
		public User findByUser(String name);
}
