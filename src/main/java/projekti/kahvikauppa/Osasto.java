package projekti.kahvikauppa;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractPersistable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Osasto extends AbstractPersistable<Long> {
    private String nimi;
    private int osastoIDP;
    @OneToMany(mappedBy = "osasto")
    private List<Tuote> tuotteet;
}