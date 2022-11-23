package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.herencia.CitaMedicaH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1JaApplication implements CommandLineRunner {

	@Autowired
	private PacienteTerceraEdadSB pacienteTE;
	@Autowired
	private CitaMedicaSB citaMedicaSB;
	@Autowired
	private MedicoSB medicoSB;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JaApplication.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		//System.out.println(pacienteCancer);
		this.pacienteTE.setCodigoIESS("1234234");
		this.pacienteTE.setCedula("1726897299");
		this.pacienteTE.setTipo("");
		this.pacienteTE.setCedula("174564656");
		
		System.out.println(pacienteTE);
		CitaMedicaH cita= new CitaMedicaH();
		citaMedicaSB.agendar("123123", LocalDateTime.of(2022, 12, 2, 8, 30),pacienteTE, medicoSB);
	}

}
