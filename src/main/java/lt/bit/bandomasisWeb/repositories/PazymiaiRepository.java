package lt.bit.bandomasisWeb.repositories;


import lt.bit.bandomasisWeb.entities.Pazymiai;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PazymiaiRepository  extends JpaRepository<Pazymiai, Integer> {

    // Cia galima ideti papildomus metodus
}