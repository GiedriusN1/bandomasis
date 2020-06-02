package lt.bit.bandomasis.runners;

import lt.bit.bandomasis.entities.Pazymiai;
import lt.bit.bandomasis.repositories.PazymiaiRepository;
import lt.bit.bandomasis.repositories.StudentasRepository;
import lt.bit.bandomasis.services.PazymiaiService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Component
@Order(5)
public class Uzduotis5 implements CommandLineRunner {

    /**
     * Užduotis 5. Vykdymo klasėje sukurkite statinį metodą int kursoVidurkis(int metai) kuris suskaičiuoja ir gražina visų studentų vidurkį (bendrą).
     */

    @Resource
    private PazymiaiService pazymiaiService;

    @Override
    public void run(String... args) throws Exception {


        String u1 = " Užduotis 5. Vykdymo klasėje sukurkite statinį metodą int kursoVidurkis(int metai) \n +" +
                "kuris suskaičiuoja ir gražina visų studentų vidurkį (bendrą).\n";
        String separator = "************************************************************************************";
        System.out.print("\u001b[30;1m");
        System.out.println((u1));
        System.out.println(separator + "\u001b[0m");


        System.out.print("\u001b[30;1m");

        System.out.println("Kurso vidurkis: " +  pazymiaiService.kursoVidurkis()); // kvieciame metoda ir spausdinam ka grazino

        System.out.println(separator + "\u001b[0m");
    }


}




