## Bandomoji užduotis

1. Sukurkite klasę Studentas kuri turėtų šiuos laukus:
id, vardas, pavarde, el. pašto adresas, pažymiai (kolekcija (LinkedList arba ArrayList)).

Sukurta:
* [Studentas.java](https://github.com/GiedriusN1/bandomasis/src/main/java/lt/bit/bandomasis/entities/Studentas.java)

2. Vykdymo klasėje (main metode) sukurkite Studentas klasės objektus
talpinančią kolekciją (LinkedList, ArrayList ar kitą).

3. Sukonfigūruokite prisijungimą prie DB bei užpildykite kolekciją duomenimis iš turimos MySQL duomenų bazės lentelės.
Vykdymo klasėje sukurkite statinį metodą uzkrautiDuomenis() kuris užkraus visus vartotojų duomenis iš MySQL į jūsų susikurtą kolekciją.

4. Suprogramuokite kolekcijos išvedimą taip, kad visi studentai kolekcijoje būtų išdėlioti ir
išvedami didėjimo tvarka: pagal pavardę, jei pavardė vienoda, tuomet pagal vardą.

5. Vykdymo klasėje sukurkite statinį metodą int kursoVidurkis(int metai) kuris suskaičiuoja ir gražina visų studentų vidurkį (bendrą).



### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/gradle-plugin/reference/html/#build-image)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

