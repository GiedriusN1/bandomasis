package lt.bit.bandomasis.services;

import lt.bit.bandomasis.entities.Pazymiai;
import lt.bit.bandomasis.repositories.PazymiaiRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PazymiaiService {

    @Resource
    private PazymiaiRepository pazymiaiRepository;


    public int kursoVidurkis() {
        List<Pazymiai> pazymiai = pazymiaiRepository.findAll();

        int kursoVidurkis = 0;
        for (int i = 0, len = pazymiai.size(); i < len; i++) {
            //   List<Double> paz = pazymiai.get(i).getPazymys();

            int suma = 0;
            kursoVidurkis = 0;
            int kiekis = 0;

            if (!pazymiai.isEmpty()) {
                for (Pazymiai pazymys : pazymiai) {
                    suma += pazymys.getPazymys();
                    kiekis++;
                }
                // return suma / kiekis;
            }
            //   return suma;
            System.out.println("suma " + suma + ", kiekis " + kiekis);

        }

        //   System.out.println(vid);
        return kursoVidurkis;


    }

    public PazymiaiRepository getPazymiaiRepository() {
        return pazymiaiRepository;
    }

    public void setPazymiaiRepository(PazymiaiRepository pazymiaiRepository) {
        this.pazymiaiRepository = pazymiaiRepository;
    }
}


