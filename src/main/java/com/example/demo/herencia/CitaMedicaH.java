package com.example.demo.herencia;

import java.time.LocalDateTime;

public class CitaMedicaH {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private MedicoH medico;
	private PacienteH paciente;
	
	public void agendar(String numero, LocalDateTime fechaCita,PacienteH ph,MedicoH mh) {
		//delegar el new a otra clase
		//Delegacion de la creador de instancias
		Integer valordescuento= ph.calcularDescuento();
		System.out.println("valor:"+valordescuento);
		
		this.medico=mh;
		this.guardarCita(this);
	}
	
	private void guardarCita(CitaMedicaH citaMedicaH) {
		//Insert en la base de datos, guardar la cita
		System.out.println(citaMedicaH);
		
		
		
	}
	//SET Y GET

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public MedicoH getMedico() {
		return medico;
	}

	public void setMedico(MedicoH medico) {
		this.medico = medico;
	}

	public PacienteH getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteH paciente) {
		this.paciente = paciente;
	}
	
	
//comentarios

}
