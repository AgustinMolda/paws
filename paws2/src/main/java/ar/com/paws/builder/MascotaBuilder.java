package ar.com.paws.builder;

import ar.com.paws.dominian.Adoptante;
import ar.com.paws.dominian.Mascota;
import ar.com.paws.dominian.Refugio;

public class MascotaBuilder {
	
	private static Long id;
	private static String nombre;
	private static String especie;
	private static String raza;
	private static String foto;
	private static String estado;
	private static Adoptante adoptante;
	private static Refugio refugio;
	
	public MascotaBuilder id(Long id) {
		this.id = id;
		return this;
	}
	
	public MascotaBuilder nombre(String nombre){
		this.nombre = nombre;
		return this;
	}
	
	public MascotaBuilder especie(String especie) {
		this.especie = especie;
		return this;
	}
	
	public MascotaBuilder foto(String foto) {
		this.foto = foto;
		return this;
	}
	
	public MascotaBuilder estado(String estado) {
		this.estado = estado;
		return this;
	}
	
	public MascotaBuilder adoptante(Adoptante adoptante) {
		this.adoptante = adoptante;
		return this;
	}
	
	public MascotaBuilder refugio(Refugio refugio){
		this.refugio = refugio;
		return this;
	}
	
	public static Mascota build() {
		return new Mascota(id,nombre,especie,raza,foto,estado,adoptante,refugio);
	}
}
