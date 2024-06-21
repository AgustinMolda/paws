package ar.com.paws.dominian;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
@Table(name= "adoptante")
public class Adoptante {
	
	
	
	
	
	
	public Adoptante() {
		
	}



	public Adoptante(Long id, String nombre, String telefono, Direccion direccion, User user, List<Mascota> mascotas,
			List<Refugio> refugios) {
		
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.user = user;
		this.mascotas = mascotas;
		this.refugios = refugios;
	}
	
	

	



	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "nombre")
	private String nombre;
	
	@Column(name = "telefono")
	private String telefono;
	
	@OneToOne(cascade = {CascadeType.ALL} ) 
	@JoinColumn(name = "id_direccion")
	private Direccion direccion;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "id_usuario")
	private User user;
	
	@OneToMany(mappedBy = "adoptante")
	private List<Mascota> mascotas;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "refugio_adoptante",
			joinColumns = @JoinColumn(name = "adoptante_id" , referencedColumnName = "id" ),
			inverseJoinColumns = @JoinColumn(name = "refugio_id" , referencedColumnName = "id")
			)
	private List<Refugio> refugios;
}
