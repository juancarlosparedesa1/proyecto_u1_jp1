package com.example.demo.herencia;

public class PacienteTerceraEdadH  extends PacienteH{
	private String codIess;

	public String getCodIess() {
		return codIess;
	}

	public void setCodIess(String codIess) {
		this.codIess = codIess;
	}
	
	protected Integer calcularDescuento() {
		System.out.println("Paciente con el 20% de descuento");
		return 20;
	}

}
