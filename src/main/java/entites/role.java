package entites;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class role {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private Long id;
	@Enumerated(EnumType.STRING)
	private Erole name;
}
