package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Proforma {
	@JsonProperty("Proforma encontrada:")
    private ProformaEncontrada proformaEncontrada;

    // Constructor, getters y setters

    public static class ProformaEncontrada {
        private int id;
        private String nombreCliente;
        private String apellidoCliente;
        private String dniCliente;
        private List<Producto> productos;
        private Date fechaDeAlta;
        private long idCliente;
        
        
		public long getIdCliente() {
			return idCliente;
		}
		public void setIdCliente(long idCliente) {
			this.idCliente = idCliente;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombreCliente() {
			return nombreCliente;
		}
		public void setNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
		}
		public String getApellidoCliente() {
			return apellidoCliente;
		}
		public void setApellidoCliente(String apellidoCliente) {
			this.apellidoCliente = apellidoCliente;
		}
		public String getDniCliente() {
			return dniCliente;
		}
		public void setDniCliente(String dniCliente) {
			this.dniCliente = dniCliente;
		}
		public List<Producto> getProductos() {
			return productos;
		}
		public void setProductos(List<Producto> productos) {
			this.productos = productos;
		}
		public Date getFechaDeAlta() {
			return fechaDeAlta;
		}
		public void setFechaDeAlta(Date fechaDeAlta) {
			this.fechaDeAlta = fechaDeAlta;
		}
		@Override
		public String toString() {
			return "ProformaEncontrada [id=" + id + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
					+ apellidoCliente + ", dniCliente=" + dniCliente + ", productos=" + productos + ", fechaDeAlta="
					+ fechaDeAlta + ", idCliente=" + idCliente + "]";
		}
		

        // Constructor, getters y setters
        
    }

	@Override
	public String toString() {
		return "Proforma [proformaEncontrada=" + proformaEncontrada + "]";
	}

	public ProformaEncontrada getProformaEncontrada() {
		return proformaEncontrada;
	}

	public void setProformaEncontrada(ProformaEncontrada proformaEncontrada) {
		this.proformaEncontrada = proformaEncontrada;
	}
	
}
