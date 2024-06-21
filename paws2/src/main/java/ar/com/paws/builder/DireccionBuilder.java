package ar.com.paws.builder;

import ar.com.paws.dominian.Adoptante;
import ar.com.paws.dominian.Direccion;
import ar.com.paws.dominian.Refugio;

public class DireccionBuilder {
	private static Long id;
	private static String pais;
	private static String provincia;
	private static String cuidad;
	private static String barrio;
	private static String direccion;
	private static Adoptante adoptante;
	private static Refugio refugio;
	
	public DireccionBuilder setId(Long id){
		this.id = id;
		return this;
	}
	
	public DireccionBuilder setPais(String pais) {
		this.pais = pais;
		return this;
	}
	
	public DireccionBuilder setProvincia(String provincia) {
		this.provincia = provincia;
		return this;
	}
	
	public DireccionBuilder setCiudad(String ciudad){
		this.cuidad = cuidad;
		return this;
	}
	
	public DireccionBuilder setBarrio(String barrio) {
		this.barrio = barrio;
		return this;
	}
	
	public DireccionBuilder setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}
	
	public DireccionBuilder setAdoptante(Adoptante adoptante) {
		this.adoptante = adoptante;
		return this;
	}
	
	public DireccionBuilder setRefugio(Refugio refugio) {
		this.refugio = refugio;
		return this;
	}
	
	public static Direccion build() {
		return new Direccion(id, pais, provincia, cuidad,barrio,direccion,adoptante,refugio);
	}
}
