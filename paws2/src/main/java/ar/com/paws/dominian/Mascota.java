package ar.com.paws.dominian;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name= "mascota")
public class Mascota {
	
	
	
	
	public Mascota() {
	
	}
	
	

	public Mascota(Long id, String nombre, String especie, String raza, String foto, String estado, Adoptante adoptante,
			Refugio refugio) {
		
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.foto = foto;
		this.estado = estado;
		this.adoptante = adoptante;
		this.refugio = refugio;
	}
	
	
	


	public Mascota(Long id, String nombre, String especie, String raza) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
	}





	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "especie")
	private String especie;
	
	@Column(name  = "raza")
	private String raza;
	
	@Column(name ="foto")
	private String foto;
	
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne()
	@JoinColumn(name = "adoptante_id")
	private Adoptante adoptante;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name = "refugio_id")
	private Refugio refugio;
}
