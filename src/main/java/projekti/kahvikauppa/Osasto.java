package projekti.kahvikauppa;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Osasto extends AbstractPersistable<Long> {
    private String osasto;
    private Long osastoIDP;
}