package com.example.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {
	
	private String CuentaOrigen;
	private String cuentaDestino;
	private LocalDateTime fecha;
	private BigDecimal monto;
	private String numero;
	
	//METODOS GET Y SET
	public String getCuentaOrigen() {
		return CuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		CuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
