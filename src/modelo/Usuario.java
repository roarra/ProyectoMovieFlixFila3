package modelo;

import java.util.Date;

public class Usuario {
	
	private String nombreCompleto;
	private String fechaNacimiento;
	private String ciudadResidencia;
	private String paqueteAbono;
	private Date fechaRegistro;
	
	
	public Usuario(String nombreCompleto, String fechaNacimiento, String ciudadResidencia, String paqueteAbono, Date fechaRegistro) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadResidencia = ciudadResidencia;
		this.paqueteAbono = paqueteAbono;
		this.fechaRegistro = fechaRegistro;
	
	}


	public Usuario() {
		super();
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	public String getfechaNacimiento() {
		return fechaNacimiento;
	}


	public void setfechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getCiudadResidencia() {
		return ciudadResidencia;
	}


	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}


	public String getPaqueteAbono() {
		return paqueteAbono;
	}


	public void setPaqueteAbono(String paqueteAbono) {
		this.paqueteAbono = paqueteAbono;
	}
	
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [nombreCompleto=");
		builder.append(nombreCompleto);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", ciudadResidencia=");
		builder.append(ciudadResidencia);
		builder.append(", paqueteAbono=");
		builder.append(paqueteAbono);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}


	public Usuario crearUsuario(String nombreCompleto, String fechaNacimiento, String ciudadResidencia, String paqueteAbono, Date fechaRegistro){
		
		Usuario u = new Usuario();
		
		u.setNombreCompleto(nombreCompleto);
		u.setfechaNacimiento(fechaNacimiento);
		u.setCiudadResidencia(ciudadResidencia);
		u.setPaqueteAbono(paqueteAbono);
			
			return u;
			
			
			
	}
	
	
	
	
}
