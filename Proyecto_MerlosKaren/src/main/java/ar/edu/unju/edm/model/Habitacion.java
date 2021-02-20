package ar.edu.unju.edm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Habitacion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Integer idhabitacion;
	@Column
	private String detallesHab;
	@Column
	private int numHab;
	@Column
	private double costo;
	@Column
	private String disponibilidad;
	@Column
	private String tipo;
	
	public Habitacion() {
		super();
	}

	public Habitacion(Integer idhabitacion, String detallesHab, int numHab, double costo, String disponibilidad,
			String tipo) {
		super();
		this.idhabitacion = idhabitacion;
		this.detallesHab = detallesHab;
		this.numHab = numHab;
		this.costo = costo;
		this.disponibilidad = disponibilidad;
		this.tipo = tipo;
	}

	public Integer getIdhabitacion() {
		return idhabitacion;
	}

	public void setIdhabitacion(Integer idhabitacion) {
		this.idhabitacion = idhabitacion;
	}

	public String getDetallesHab() {
		return detallesHab;
	}

	public void setDetallesHab(String detallesHab) {
		this.detallesHab = detallesHab;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(costo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((detallesHab == null) ? 0 : detallesHab.hashCode());
		result = prime * result + ((disponibilidad == null) ? 0 : disponibilidad.hashCode());
		result = prime * result + ((idhabitacion == null) ? 0 : idhabitacion.hashCode());
		result = prime * result + numHab;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitacion other = (Habitacion) obj;
		if (Double.doubleToLongBits(costo) != Double.doubleToLongBits(other.costo))
			return false;
		if (detallesHab == null) {
			if (other.detallesHab != null)
				return false;
		} else if (!detallesHab.equals(other.detallesHab))
			return false;
		if (disponibilidad == null) {
			if (other.disponibilidad != null)
				return false;
		} else if (!disponibilidad.equals(other.disponibilidad))
			return false;
		if (idhabitacion == null) {
			if (other.idhabitacion != null)
				return false;
		} else if (!idhabitacion.equals(other.idhabitacion))
			return false;
		if (numHab != other.numHab)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Habitacion [idhabitacion=" + idhabitacion + ", detallesHab=" + detallesHab + ", numHab=" + numHab
				+ ", costo=" + costo + ", disponibilidad=" + disponibilidad + ", tipo=" + tipo + "]";
	}
	
	

}
