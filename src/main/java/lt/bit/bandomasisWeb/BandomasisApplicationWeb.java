package lt.bit.bandomasisWeb;


/*
 Užduotis

1. Sukurkite klasę Studentas kuri turėtų šiuos laukus:
id, vardas, pavarde, el. pašto adresas, pažymiai (kolekcija (LinkedList arba ArrayList)).

2. Vykdymo klasėje (main metode) sukurkite Studentas klasės objektus
talpinančią kolekciją (LinkedList, ArrayList ar kitą).

3. Sukonfigūruokite prisijungimą prie DB bei užpildykite kolekciją duomenimis iš turimos MySQL duomenų bazės lentelės.
Vykdymo klasėje sukurkite statinį metodą uzkrautiDuomenis() kuris užkraus visus vartotojų duomenis iš MySQL į jūsų susikurtą kolekciją.

4. Suprogramuokite kolekcijos išvedimą taip, kad visi studentai kolekcijoje būtų išdėlioti ir
išvedami didėjimo tvarka: pagal pavardę, jei pavardė vienoda, tuomet pagal vardą.

5. Vykdymo klasėje sukurkite statinį metodą int kursoVidurkis(int metai) kuris suskaičiuoja ir gražina visų studentų vidurkį (bendrą).

 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BandomasisApplicationWeb {

	/**
	 * Pagrindinė vykdomoji klasė
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(BandomasisApplicationWeb.class, args);

	}
}
