package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PacienteH pacienteTE= new PacienteTerceraEdadH();
		pacienteTE.setCedula("123434234");
		pacienteTE.setCodigoIESS("123423434");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("TE");
		
		MedicoH medico=new MedicoH();
		medico.setCedula("1234234");
		medico.setNombre("Diana");
		CitaMedicaH cita=new CitaMedicaH();
		cita.agendar("12342", LocalDateTime.of(2022, 12,2,8,30), pacienteTE, medico);
	}

}


