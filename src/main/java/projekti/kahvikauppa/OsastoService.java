package projekti.kahvikauppa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OsastoService {
    @Autowired
    private OsastoRepository osastoRepository;

    public List<Osasto> list() {
        return osastoRepository.findAll();
    }
    
    public void add(String nimi, Integer osastoIDP) {
        Osasto osasto = new Osasto();
        osasto.setNimi(nimi);
        osasto.setOsastoIDP(osastoIDP);
        osastoRepository.save(osasto);
    }
}