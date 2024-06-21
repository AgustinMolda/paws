package ar.com.paws.dominian;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "direccion")
public class Direccion {
	
	
	
	public Direccion() {
	
	}

	public Direccion(Long id2, String pais2, String provincia2, String cuidad, String barrio2, String direccion2,
			Adoptante adoptante2, Refugio refugio2) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="pais")
	private String pais;
	
	@Column(name ="provincia")
	private String provincia;
	
	@Column(name = "cuidad")
	private String ciudad;
	
	@Column(name= "barrio")
	private String barrio;
	
	@Column(name ="direccion")
	private String direccion;
	
	@OneToOne(mappedBy = "direccion")
	private Adoptante adoptante;
	
	@OneToOne(mappedBy = "direccion")
	private Refugio refugio;

	
}
