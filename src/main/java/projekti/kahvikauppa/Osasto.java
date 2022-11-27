package projekti.kahvikauppa;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Osasto {
    private String osasto;
    private Long osastoIDP;
}