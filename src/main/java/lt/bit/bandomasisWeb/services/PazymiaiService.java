package lt.bit.bandomasisWeb.services;

import lt.bit.bandomasisWeb.entities.Pazymiai;
import lt.bit.bandomasisWeb.repositories.PazymiaiRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.aspectj.runtime.internal.Conversions.intValue;

@Service
public class PazymiaiService {

    @Resource
    private PazymiaiRepository pazymiaiRepository;

    public int kursoVidurkis() {
        List<Pazymiai> pazymiai = pazymiaiRepository.findAll();
        System.out.println(pazymiai);
        int kursoVidurkis = 0;
        for (int i = 0, len = pazymiai.size(); i < len; i++) {
            int suma = 0;
            kursoVidurkis = 0;
            int kiekis = 0;
                if (!pazymiai.isEmpty()) {
                for (Pazymiai pazymys : pazymiai) {
                    suma += pazymys.getPazymys();
                    kiekis++;
                }

                kursoVidurkis = intValue((suma / kiekis));
            }
        }

        return kursoVidurkis;
    }
}


//        public PazymiaiRepository getPazymiaiRepository() {
//            return pazymiaiRepository;
//        }

//        public void setPazymiaiRepository (PazymiaiRepository pazymiaiRepository){
//            this.pazymiaiRepository = pazymiaiRepository;
//        }




