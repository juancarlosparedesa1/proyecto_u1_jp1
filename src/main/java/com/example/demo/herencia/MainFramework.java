package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PacienteTerceraEdadH pacienteTe=new PacienteTerceraEdadH();
//		pacienteTe.setCedula("123456789");
//		pacienteTe.setCodIess("123456789");
//		pacienteTe.setNombre("Daniel");
//		pacienteTe.setTipo("TE");
		
//		PacienteNinoH pacienteTe=new PacienteNinoH();
//		pacienteTe.setCedula("123456789");
//		pacienteTe.setPesonacimiento(8);
//		pacienteTe.setNombre("Daniel");
//		pacienteTe.setTipo("TE");
		
		PacienteCancerH pacienteTe=new PacienteCancerH();
		pacienteTe.setCedula("123456789");
		pacienteTe.setNombre("Daniel");
		pacienteTe.setTipo("C");
		
		MedicoH medico = new MedicoH();
		medico.setCedula("123");
		medico.setNombre("Diana");
		
		CitaMedicaH cita =new CitaMedicaH();
		cita.agendar("123123",  LocalDateTime.of(2022, 12,2,8,30), pacienteTe, medico);
		
	}
}
