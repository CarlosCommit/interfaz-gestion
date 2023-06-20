package model;

import java.util.ArrayList;
import java.util.List;

public class Proforma {

	private String nombreCliente;
	private String apellidoCliente;
	private String dniCliente;
	private List<Producto> productos = new ArrayList<Producto>();
	
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
	@Override
	public String toString() {
		return "Proforma [nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", dniCliente="
				+ dniCliente + ", productos=" + productos + "]";
	}
	
	
	
	
	
}
