package lt.bit.bandomasis.runners;
import lt.bit.bandomasis.entities.Pazymiai;
import lt.bit.bandomasis.entities.Studentas;
import lt.bit.bandomasis.repositories.StudentasRepository;
import lt.bit.bandomasis.services.StudentasService;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 4. Suprogramuokite kolekcijos išvedimą taip, kad visi studentai kolekcijoje būtų išdėlioti ir
 išvedami didėjimo tvarka: pagal pavardę, jei pavardė vienoda, tuomet pagal vardą.
 */



@Component
@Order(4)
public class Uzduotis4 implements CommandLineRunner{

    @Resource
    private StudentasRepository studentasRepository;

    @Override
    public void run(String... args) throws Exception {


        String u1 = " Uzduotis 4. Suprogramuokite kolekcijos išvedimą taip, kad visi studentai kolekcijoje būtų išdėlioti ir\n" +
                "išvedami didėjimo tvarka: pagal pavardę, jei pavardė vienoda, tuomet pagal vardą. \n";
        String separator = "************************************************************************************";
        System.out.print("\u001b[30;1m"); // + separator);
        System.out.println((u1));
        System.out.println("\u001b[0m");

        Sort pavardeSort = Sort.by("pavarde");
        Sort vardasSort = Sort.by("vardas");
        Sort bendrasSort = pavardeSort.and(vardasSort);
        List<Studentas> studentai = studentasRepository.findAll(bendrasSort);

//        List<Studentas> studentai;
//        studentai = StudentasService.gautiSurusiuotusStudentus();

        System.out.print("\u001b[30;1m");
        System.out.println("Rasta studentu " + studentai.size());
        studentai.forEach(std -> System.out.println(std.getId() + " " + std.getPavarde() + " " + std.getVardas() + " " + std.getElPastoAdresas()));

        System.out.println(separator + "\u001b[0m");
        }

    }


