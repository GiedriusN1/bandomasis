package lt.bit.bandomasis.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "pazymiai")

public class Pazymiai {
    /**
     * Apraso duomenis lenteleje pazymiai
     */
    @EmbeddedId
    private int id;

    private int studentasId;
    private LocalDate data;
    private int pazymys;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentasId() {
        return studentasId;
    }

    public void setStudentasId(int studentasId) {
        this.studentasId = studentasId;
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
