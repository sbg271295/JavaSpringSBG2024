package dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import entities.Alumno;

public interface AlumnosDao extends JpaRepository<Alumno,String>{
//Dos formas para llegar al idCurso en base a la relacion establecida entre entidades;
	@Query("select distinct(a) from Alumno a join a.matriculas m where m.curso.idCurso=?1")
	//@Query("select distinct(a) from Alumno a join a.matriculas m where m.matriculaPk.idCurso=?1")
	List<Alumno> findByIdCurso(int idCurso);

}