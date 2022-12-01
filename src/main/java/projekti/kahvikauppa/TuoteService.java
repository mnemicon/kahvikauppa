package projekti.kahvikauppa;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuoteService {
    @Autowired
    private TuoteRepository tuoteRepository;
    @Autowired
    private OsastoRepository osastoRepository;

    public List<Tuote> list() {
        return tuoteRepository.findAll();
    }
    public Tuote get(Long tuoteId) {
        return tuoteRepository.getById(tuoteId);
    }

    public void add(String nimi, String kuvaus, int hinta, String kuva) {
        Tuote tuote = new Tuote();
        tuote.setNimi(nimi);;
        tuote.setKuvaus(kuvaus);
        tuote.setHinta(hinta);
        tuote.setKuva(kuva);
        tuoteRepository.save(tuote);
    }
    public void assign(Long tuoteId, Long osastoId) {
        Tuote t = tuoteRepository.getById(tuoteId);
        Osasto o = osastoRepository.getById(osastoId);
        t.setOsasto(o);
        tuoteRepository.save(t);
    }
}