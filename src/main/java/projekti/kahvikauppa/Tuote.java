package projekti.kahvikauppa;

import java.math.BigDecimal;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Tuote {
    private String nimi;
    private String kuvaus;
    private BigDecimal hinta;
    private String kuva;
}