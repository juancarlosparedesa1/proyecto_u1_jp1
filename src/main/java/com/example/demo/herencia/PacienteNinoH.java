package com.example.demo.herencia;

public class PacienteNinoH extends PacienteH {
	private int pesonacimiento;

	public int getPesonacimiento() {
		return pesonacimiento;
	}

	public void setPesonacimiento(int pesonacimiento) {
		this.pesonacimiento = pesonacimiento;
	}
	

	protected Integer calcularDescuento() {
		System.out.println("Paciente Niño con el 10% de descuento");
		return 10;
	}

}
