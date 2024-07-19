package model;

import java.time.LocalDateTime;

public class VentaDto {
	
       private int idVenta;
       private String usuario;
       private String TituloLibro;
       private LocalDateTime fecha;
       
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTituloLibro() {
		return TituloLibro;
	}
	public void setTituloLibro(String tituloLibro) {
		TituloLibro = tituloLibro;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public VentaDto(int idVenta, String usuario, String tituloLibro, LocalDateTime fecha) {
		super();
		this.idVenta = idVenta;
		this.usuario = usuario;
		TituloLibro = tituloLibro;
		this.fecha = fecha;
	}
	public VentaDto() {
		
	} 
       
}
