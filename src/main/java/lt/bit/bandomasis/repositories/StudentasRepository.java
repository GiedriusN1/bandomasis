package lt.bit.bandomasis.repositories;

import lt.bit.bandomasis.entities.Studentas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentasRepository extends JpaRepository<Studentas, Integer> {

    /**
     * Interfeisas uzklausoms formuoti
     * @param id
     * @return
     */

  //  @EntityGraph(attributePaths = {"pazymiai"})
   // Studentas findStudentasById(int id);

 // List<Pazymiai> findByStudentasId(int id);

  //  @Query(value = "SELECT AVG(pazymys) FROM studentai s JOIN pazymiai p ON s.id = p.studentas_id GROUP BY s.id", nativeQuery = true)
   // static int findAverage();

}
