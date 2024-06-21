package ar.com.paws.dominian;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name= "refugio")
public class Refugio {

	
	
	
	
	
	public Refugio() {
	
	}

	public Refugio(Long id2, String nombre2, String telefono2, String email2, String opiniones2, List<Mascota> mascotas2, List<Adoptante> adoptantes2, Direccion direccion2, User user2) {
	
	}
	
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	
	@Column(name= "nombre")
	private String nombre;
	
	
	@Column(name ="telefono")
	private String telefono;
	
	
	@Column(name= "email")
	private String email;
	
	@Column(name = "opiniones")
	private String opiniones;
	
	@ManyToMany(mappedBy = "refugios")
	private List<Adoptante> adoptantes;
	
	@OneToMany(mappedBy = "refugio")
	private List<Mascota> mascotas;
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name = "id_direccion")
	private Direccion direccion;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "refugio_id")
	private User user;
}
