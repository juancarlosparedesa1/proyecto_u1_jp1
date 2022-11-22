package com.example.demo.herencia;

public class PacienteTerceraEdadH extends PacienteH{
	public String getCodIess() {
		return codIess;
	}
	public Integer calcularDescuento(){
		System.out.println("Paciente tercera edad con el 20 descuento");
		return 20;
	}

	public void setCodIess(String codIess) {
		this.codIess = codIess;
	}

	private String codIess;
	
}
