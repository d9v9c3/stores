package com.team.stores.DTO;


public class ProductoDTO {

	private double precio;
	private String nombre;
	private String tipo;
	private String marca;
	private boolean stock;

	public ProductoDTO() {
		
	}

	public ProductoDTO(double precio, String nombre, String tipo, String marca, boolean stock) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}
	

}
