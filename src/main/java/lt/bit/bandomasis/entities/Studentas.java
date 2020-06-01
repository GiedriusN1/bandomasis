package lt.bit.bandomasis.entities;

import lt.bit.bandomasis.repositories.StudentasRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Entity
@Table(name = "studentai")
@NamedEntityGraph(name = "Studentu.pazymiai", attributeNodes = @NamedAttributeNode("pazymiai"))

public class Studentas {
    /**
     * Apraso duomenu struktura duomenu bazes lenteleje studentas
     */

    @Id
    private int id;

    private String vardas;
    private String pavarde;
    private String elPastas;

    @OneToMany(mappedBy = "studentas", fetch = FetchType.EAGER)
    private List<Pazymiai> pazymiai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getElPastoAdresas() {
        return elPastas;
    }

    public void setElPastoAdresas(String elPastoAdresas) {
        this.elPastas = elPastas;
    }

    public List<Pazymiai> getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(List<Pazymiai> pazymiai) {
        this.pazymiai = pazymiai;
    }


//    public static List<Studentas> uzkrautiDuomenisStatic() {
//        StudentasRepository studentasRepository = new StudentasRepository() {
//            @Override
//            public List<Studentas> findAll() {
//                return null;
//            }
//
//            @Override
//            public List<Studentas> findAll(Sort sort) {
//                return null;
//            }
//
//            @Override
//            public List<Studentas> findAllById(Iterable<Integer> integers) {
//                return null;
//            }
//
//            @Override
//            public <S extends Studentas> List<S> saveAll(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void flush() {
//
//            }
//
//            @Override
//            public <S extends Studentas> S saveAndFlush(S entity) {
//                return null;
//            }
//
//            @Override
//            public void deleteInBatch(Iterable<Studentas> entities) {
//
//            }
//
//            @Override
//            public void deleteAllInBatch() {
//
//            }
//
//            @Override
//            public Studentas getOne(Integer integer) {
//                return null;
//            }
//
//            @Override
//            public <S extends Studentas> List<S> findAll(Example<S> example) {
//                return null;
//            }
//
//            @Override
//            public <S extends Studentas> List<S> findAll(Example<S> example, Sort sort) {
//                return null;
//            }
//
//            @Override
//            public Page<Studentas> findAll(Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends Studentas> S save(S entity) {
//                return null;
//            }
//
//            @Override
//            public Optional<Studentas> findById(Integer integer) {
//                return Optional.empty();
//            }
//
//            @Override
//            public boolean existsById(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public long count() {
//                return 0;
//            }
//
//            @Override
//            public void deleteById(Integer integer) {
//
//            }
//
//            @Override
//            public void delete(Studentas entity) {
//
//            }
//
//            @Override
//            public void deleteAll(Iterable<? extends Studentas> entities) {
//
//            }
//
//            @Override
//            public void deleteAll() {
//
//            }
//
//            @Override
//            public <S extends Studentas> Optional<S> findOne(Example<S> example) {
//                return Optional.empty();
//            }
//
//            @Override
//            public <S extends Studentas> Page<S> findAll(Example<S> example, Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends Studentas> long count(Example<S> example) {
//                return 0;
//            }
//
//            @Override
//            public <S extends Studentas> boolean exists(Example<S> example) {
//                return false;
//            }
//        };
//        return Objects.requireNonNull(studentasRepository.findAll());
//    }

}





