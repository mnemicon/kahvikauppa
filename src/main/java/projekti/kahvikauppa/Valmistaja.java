package projekti.kahvikauppa;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Valmistaja extends AbstractPersistable<Long> {
    private String nimi;
    private String url;
}