package modelo;

import java.util.Date;

public class Usuario {
	
	private String nombreCompleto;
	private Date date = null;
	private String ciudadResidencia;
	private String paqueteAbono;
	
	
	public Usuario(String nombreCompleto, String ciudadResidencia, String paqueteAbono) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.date = new Date();
		this.ciudadResidencia = ciudadResidencia;
		this.paqueteAbono = paqueteAbono;
	
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


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
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


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [nombreCompleto=");
		builder.append(nombreCompleto);
		builder.append(", date=");
		builder.append(date);
		builder.append(", ciudadResidencia=");
		builder.append(ciudadResidencia);
		builder.append(", paqueteAbono=");
		builder.append(paqueteAbono);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
