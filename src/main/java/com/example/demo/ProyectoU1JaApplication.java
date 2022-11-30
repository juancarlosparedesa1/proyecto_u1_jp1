package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.herencia.CitaMedicaH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1JaApplication implements CommandLineRunner {

//	@Autowired
//	private PacienteTerceraEdadSB pacienteTE;
//	@Autowired
//	private CitaMedicaSB citaMedicaSB;
//	@Autowired
//	private MedicoSB medicoSB;
//	@Autowired
//	private PacienteCancerSB cancerSB;
	@Autowired
	private ICuentaBancariaService bancariaService;
//	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JaApplication.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumero("001");
		cuenta.setTipo("A");
		cuenta.setTitular("Washo Pérez");
		cuenta.setSaldo(new BigDecimal(100));
		
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("002");
		cuenta2.setSaldo(new BigDecimal(1000));
		
		cuenta2.setTipo("C");
		cuenta2.setTitular("María Paredes");
		
//		System.out.println("Spring Boot");
//		//System.out.println(pacienteCancer);
//		this.pacienteTE.setCodigoIESS("1234234");
//		this.pacienteTE.setCedula("1726897299");
//		this.pacienteTE.setTipo("");
//		this.pacienteTE.setCedula("174564656");
//		
//		this.cancerSB.setCedula("17275023");
//		this.cancerSB.setNombre("smith");
//		this.cancerSB.setTipo("D");
//		
//		this.medicoSB.setCedula("0400726164");
//		this.medicoSB.setNombre("Alicia");
//		
//		System.out.println(pacienteTE);
//		CitaMedicaH cita= new CitaMedicaH();
//		citaMedicaSB.agendar("123123", LocalDateTime.of(2022, 12, 2, 8, 30),pacienteTE, medicoSB);
	}

}
