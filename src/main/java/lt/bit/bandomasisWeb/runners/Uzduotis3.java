package lt.bit.bandomasisWeb.runners;

import lt.bit.bandomasisWeb.entities.Pazymiai;
import lt.bit.bandomasisWeb.entities.Studentas;
import lt.bit.bandomasisWeb.services.StudentasService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Užduotis
 1. Sukurkite klasę Studentas kuri turėtų šiuos laukus:
 id, vardas, pavarde, el. pašto adresas, pažymiai (kolekcija (LinkedList arba ArrayList)).
 */



@Component
@Order(3)
public class Uzduotis3 implements CommandLineRunner {

    @Resource // galime be sios anotacijos bet tada reikia kurti konstruktoriu
    private StudentasService studentasService;

    @Override
    public void run(String... args) throws Exception {
        List<Studentas> visiDuomenys = new ArrayList<>();

        visiDuomenys = studentasService.uzkrautiDuomenis();  // kvieciame metoda uzkrautiDuomenis() is StudentasService

        // testas su static metodu klaseje Studentas
      //  List<Studentas> visiDuomenysStatic = new ArrayList<>();
      //  visiDuomenysStatic = Studentas.uzkrautiDuomenisStatic();

        String u1 = "  Uzduotis 3:  prisijungimas prie DB sukonfiguruotas,\n" +
                "   klaseje StudentasService sukurtas nestatinis metodas uzkrautiDuomenis() \n";
        String separator = "************************************************************************************";

        System.out.println("\u001b[30;1m" + separator);
      //  System.out.println("\u001b[44m" + separator);
        System.out.println((u1)  + "\u001b[0m");


        for (Studentas studentas : visiDuomenys) {
            // negraziai spausdina
            //    System.out.println(studentas.getVardas() + " " + studentas.getPavarde() + " " + Arrays.deepToString(new List[]{studentas.getPazymiai()}));
            //    System.out.println(studentas.getVardas() + " " + studentas.getPavarde() + " " +  studentas.getPazymiai().toString());


            System.out.println("\u001b[30;1m" + studentas.getVardas() + " " + studentas.getPavarde());
            for (Pazymiai pazymys : studentas.getPazymiai()) {

                System.out.println(pazymys.getData() + " " + pazymys.getPazymys());
            }


          //  System.out.println("  " + visiDuomenys);

        }
        System.out.println(separator + "\u001b[0m");

    }
}
