package lt.bit.bandomasis.repositories;

import lt.bit.bandomasis.entities.Pazymiai;
import lt.bit.bandomasis.entities.Studentas;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

public interface StudentasRepository extends JpaRepository<Studentas, Integer> {

// galima ir cia metodus kurti
List<Studentas> findAllById(int id);



}
