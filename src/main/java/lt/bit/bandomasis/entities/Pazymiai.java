package lt.bit.bandomasis.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pazymiai")

public class Pazymiai {
    /**
     * Apraso duomenis lenteleje pazymiai
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate data;
    private int pazymys;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentas_id")
    private Studentas studentas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Studentas getStudentas() {
        return studentas;
    }

    public void setStudentas(Studentas studentas) {
        this.studentas = studentas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getPazymys() {
        return pazymys;
    }

    public void setPazymys(int pazymys) {
        this.pazymys = pazymys;
    }
}
