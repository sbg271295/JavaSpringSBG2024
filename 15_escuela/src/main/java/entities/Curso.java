package entities;

import java.time.LocalTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="cursos")
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCurso;
	private String nombre;
	private int duracion;
	private LocalTime fechaInicio;
	private int precio;
	
	@ManyToMany()
	@JoinTable(name="matriculas",joinColumns= @JoinColumn(name="usuario",referencedColumnName="usuario"),
	           inverseJoinColumns= @JoinColumn (name="idCurso",referencedColumnName="idCurso"))	
	private Set<Alumno> alumnos;
	
	public Curso(int idCurso, String nombre, int duracion, LocalTime fechaInicio, int precio) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.duracion = duracion;
		this.fechaInicio = fechaInicio;
		this.precio = precio;
	}

	public Curso() {
		super();
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public LocalTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
}
