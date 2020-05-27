package lt.bit.bandomasis.services;

import lt.bit.bandomasis.entities.Studentas;
import lt.bit.bandomasis.repositories.StudentasRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class StudentasService {

    @Resource
    private StudentasRepository studentasRepository;

    public StudentasRepository getStudentasRepository() {
        return studentasRepository;
    }

    public void setStudentasRepository(StudentasRepository studentasRepository) {
        this.studentasRepository = studentasRepository;
    }

    public List<Studentas> uzkrautiDuomenis() {
        List<Studentas> visi = studentasRepository.findAll();
            return visi;
    }
}
