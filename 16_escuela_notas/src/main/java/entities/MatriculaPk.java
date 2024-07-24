package entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

@Embeddable
public class MatriculaPk {
	
	private String usuario;
	private int idCurso;

	public MatriculaPk(String usuario, int idCurso) {
		super();
		this.usuario = usuario;
		this.idCurso = idCurso;
	}

	public MatriculaPk() {
	}
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	

}
