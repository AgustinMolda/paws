package ar.com.paws.builder;

import java.util.List;

import org.springframework.jmx.export.assembler.MethodExclusionMBeanInfoAssembler;

import ar.com.paws.dominian.Adoptante;
import ar.com.paws.dominian.Direccion;
import ar.com.paws.dominian.Mascota;
import ar.com.paws.dominian.Refugio;
import ar.com.paws.dominian.User;

public class RefugioBuilder {
	
	private static Long id;
	private static String nombre;
	private static String telefono;
	private static String email;
	private static String opiniones;
	private static List<Adoptante> adoptantes;
	private static List<Mascota> mascotas;
	private static Direccion direccion;
	private static User user;
	
	
	public RefugioBuilder id(Long id){
		this.id = id;
		return this;
	}
	
	public RefugioBuilder nombre(String nombre){
		this.nombre = nombre;
		return this;
		
	}
	
	public RefugioBuilder telefono (String telefono){
		this.telefono = telefono;
		return this;
	}
	
	public RefugioBuilder email (String email){
		this.email = email;
		return this;
	}
	
	public RefugioBuilder opiniones(String opiniones){
		this.opiniones = opiniones;
		return this;
	}
	public RefugioBuilder  mascotas(List<Mascota> mascotas){
		this.mascotas = mascotas;
		return this;
	}
	
	public RefugioBuilder adoptantes (List<Adoptante> adoptantes){
		this.adoptantes = adoptantes;
		return this;
	}
	
	public RefugioBuilder direccion (Direccion direccion){
		this.direccion = direccion;
		return this;
	}
	
	public RefugioBuilder user(User user){
		this.user = user;
		return this;
	}
	
	public static Refugio build(){
		return new Refugio(id,nombre,telefono,email,opiniones,mascotas,adoptantes,direccion,user);
	}
}
