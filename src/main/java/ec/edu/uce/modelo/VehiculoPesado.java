package ec.edu.uce.modelo;

public class VehiculoPesado {
private String marca,modelo,placa, tipo, propietario;
	
//	para que el cilindraje este expresada en centimetros cubicos, y no de manera decimal
	private int peso;
	
	
 
//	Se que es BigDecimal, pero por tiempo no he podido usarlo
	private double precio;
	private double valorMatricula = precio * 0.15;
	
// 	Setters y Getters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public int getPeso() {
		return peso;
	}
	public void setCilindraje(int peso) {
		this.peso = peso;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	@Override
	public String toString() {
		return "VehiculoPesado [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", tipo=" + tipo
				+ ", propietario=" + propietario + ", peso=" + peso + ", precio=" + precio + ", valorMatricula="
				+ valorMatricula + "]";
	}
	
	
	
	
	
	
	
	

}
