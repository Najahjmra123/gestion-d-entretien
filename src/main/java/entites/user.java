package entites;

import java.util.HashSet;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;





@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance  (strategy =InheritanceType.TABLE_PER_CLASS)
public class user {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	private String fullname;
	private String email;
	private String password;
	private String niveau;
	//private Role role; ywali many to one
	@ManyToMany(fetch=FetchType.EAGER)
	private Set<role> roles = new HashSet<>();
}
