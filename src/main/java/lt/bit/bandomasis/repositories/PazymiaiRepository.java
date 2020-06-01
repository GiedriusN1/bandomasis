package lt.bit.bandomasis.repositories;


import lt.bit.bandomasis.entities.Pazymiai;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PazymiaiRepository  extends JpaRepository<Pazymiai, Integer> {

    // Cia galima ideti papildomus metodus
}