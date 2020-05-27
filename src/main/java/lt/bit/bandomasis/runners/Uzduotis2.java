package lt.bit.bandomasis.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Užduotis
 1. Sukurkite klasę Studentas kuri turėtų šiuos laukus:
 id, vardas, pavarde, el. pašto adresas, pažymiai (kolekcija (LinkedList arba ArrayList)).
 */

@Component
@Order(2)
public class Uzduotis2 implements CommandLineRunner {

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */

    @Override
    public void run(String... args) throws Exception {
        String u1 = "  Uzduotis 2: Studentas klases objektus talpinancia kolekcija sukuriu StudentasService";
        String separator = "************************************************************************************";
        //  TimeUnit.SECONDS.sleep(3);
        System.out.print("\u001b[30;1m"); // + separator);
        //   System.out.println(" \u001b[44m " + separator); // u001b[30;1m
        System.out.println((u1));
        System.out.println(separator + "\u001b[0m");
    }
}
