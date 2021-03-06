package lt.bit.bandomasisWeb.services;

import lt.bit.bandomasisWeb.entities.Studentas;
import lt.bit.bandomasisWeb.repositories.StudentasRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentasService {

    @Resource
    private StudentasRepository studentasRepository;

    // nenaudojamas metodas
//    public List<Studentas> gautiStudentusPagalMetus(int metai) {
//        List<Studentas> studentas = studentasRepository.findAll();
//        return studentas.stream()
//                .filter(std -> std.getPazymiai().stream().anyMatch(pazymys -> pazymys.getData().getYear() == metai))
//                .collect(Collectors.toList());
//    }




// metodas gautiSurusiuotusStudentus neveikia, nes reikia kad jis butu statinis todel rusiuoju runneryje 4 Uzduotis
    public  List<Studentas> gautiSurusiuotusStudentus() {
        Sort pavardeSort = Sort.by("pavarde");
        Sort vardasSort = Sort.by("vardas");
        Sort bendrasSort = pavardeSort.and(vardasSort);
        List<Studentas> studentas = studentasRepository.findAll(bendrasSort);
        return new ArrayList<>(studentas);
    }


    public StudentasRepository getStudentasRepository() {
        return studentasRepository;
    }

    public void setStudentasRepository(StudentasRepository studentasRepository) {
        this.studentasRepository = studentasRepository;
    }

    public List<Studentas> uzkrautiDuomenis() {
        return studentasRepository.findAll();
    }
}
