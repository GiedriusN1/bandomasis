package lt.bit.bandomasis.entities;

import javax.persistence.*;
import java.util.List;

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
    private String elPastoAdresas;

    @OneToMany(mappedBy = "id.studentai" , fetch = FetchType.LAZY)
    private List<Pazymiai>pazymiai;

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
        return elPastoAdresas;
    }

    public void setElPastoAdresas(String elPastoAdresas) {
        this.elPastoAdresas = elPastoAdresas;
    }

    public List<Pazymiai> getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(List<Pazymiai> pazymiai) {
        this.pazymiai = pazymiai;
    }
}
