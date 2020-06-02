package lt.bit.bandomasisWeb.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
  * Užduotis
    1. Sukurkite klasę Studentas kuri turėtų šiuos laukus:
     id, vardas, pavarde, el. pašto adresas, pažymiai (kolekcija (LinkedList arba ArrayList)).
*/

@Component
@Order(1)
public class Uzduotis1 implements CommandLineRunner {

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */

    @Override
    public void run(String... args) throws Exception {
        String u1 = "  Uzduotis 1: Sukuriau klase Studentas kuri turi nurodytus  laukus";
        String separator = "************************************************************************************";
      //  TimeUnit.SECONDS.sleep(3);
        System.out.println("\u001b[30;1m" + separator);
     //   System.out.println(" \u001b[44m " + separator); // u001b[30;1m
        System.out.println((u1));
        System.out.println(separator + "\u001b[0m");
    }
}
