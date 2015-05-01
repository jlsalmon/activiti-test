package mypackage;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO
 *
 * @author Justin Lewis Salmon
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

  Person findByUsername(String username);

}

