package projekti.kahvikauppa;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Toimittaja extends AbstractPersistable<Long> {
    private String nimi;
    private String yhteyshenkilo;
    private String yhteyshenkilonEmail;
}