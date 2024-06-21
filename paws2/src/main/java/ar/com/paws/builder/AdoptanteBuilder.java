package ar.com.paws.builder;

import java.util.List;

import ar.com.paws.dominian.Adoptante;
import ar.com.paws.dominian.Direccion;
import ar.com.paws.dominian.Mascota;
import ar.com.paws.dominian.Refugio;
import ar.com.paws.dominian.User;

public class AdoptanteBuilder {
	
	private static Long id;
	private static String nombre;
	private static String telefono;
	private static Direccion direccion;
	private static User user;
	private static List<Mascota> mascotas;
	private static List<Refugio> refugios;
	
	
	public AdoptanteBuilder setId(Long id){
		this.id = id;
		return this;
	}
	
	public AdoptanteBuilder setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public AdoptanteBuilder setTelefono(String telefono){
		this.telefono = telefono;
		return this;
	}
	
	public AdoptanteBuilder setdireccion(Direccion direccion){
		this.direccion = direccion;
		return this;
	}
	
	public AdoptanteBuilder setUser(User user) {
		this.user = user;
		return this;
	}
	
	public AdoptanteBuilder setMascotas(List<Mascota> mascotas) {
			this.mascotas = mascotas;
			return this;
	}
	
	public AdoptanteBuilder setRefugio(List<Refugio> refugios) {
		this.refugios = refugios;
		return this;
	}
	
	public static Adoptante build() {
		return new Adoptante(id,nombre,telefono,direccion,user,mascotas,refugios);
	}
}
