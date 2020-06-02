package lt.bit.bandomasisWeb.repositories;

import lt.bit.bandomasisWeb.entities.Studentas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentasRepository extends JpaRepository<Studentas, Integer> {

// galima ir cia metodus kurti
List<Studentas> findAllById(int id);



}
