package projekti.kahvikauppa;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.springframework.data.jpa.domain.AbstractPersistable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Tuote extends AbstractPersistable<Long> {
    private String nimi;
    private String kuvaus;
    private Integer hinta;      //tämä muutettava vielä bigDecimaliksi!
    private String kuva;
    @ManyToOne
    private Osasto osasto;
}