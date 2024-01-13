package entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Domain {
	@Id //cle primar
	@GeneratedValue(strategy =GenerationType.AUTO)
	//attribut
	private Long id;
	private String nomdomain;
	private String description;

}
