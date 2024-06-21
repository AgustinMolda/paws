package ar.com.paws.dominian;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
@Entity
@Table(name = "users" ) 
public class User {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "user", unique = true)
	private String user;
	
	@Column(name= "password") 
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(
			name= "user_rol",
			joinColumns = @JoinColumn(name= "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name= "rol_id", referencedColumnName = "id")
			)
	List<Rol> role;
	
	
	

	public User() {
		
	}
	
	

	public User(Long id, String user, String password, List<Rol> role) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.role = role;
	}



	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	
	
}
