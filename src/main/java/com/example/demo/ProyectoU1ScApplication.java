package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner; //ejecuta en consola
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;
import com.example.demo.ejrcicio1.Service.IMatriculaNuevaService;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService ipropietarioService;
	@Autowired
	private IMatriculaService matriculaService;
	
	//implementar
	@Qualifier("liviano")
	//@Qualifier("pesado")
	@Autowired
	private IMatriculaNuevaService ImatriculaNuevaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// Matricula

		// Opcion1
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Tocyota");
		vehi.setPlaca("ABC1234342");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("P");
		this.vehiculoService.crear(vehi);
		vehi.setMarca("Nissan");
		vehi.setPrecio(new BigDecimal(15000));
		this.vehiculoService.modificar(vehi);

		// Opcion2
		Propietario propietario = new Propietario();
		propietario.setApellido("Paredes");
		propietario.setNombre("Juan");
		propietario.setCedula("1234234324");
		propietario.setFechaNaciemiento(LocalDateTime.of(1999, 12, 12, 12, 12));
		ipropietarioService.guardar(propietario);
		
		//logica de negocio no deberia estar aqui
		if (vehi.getTipo().equals("P")) {
			this.ImatriculaNuevaService.matricular("1234234", "pd2343");
			
		}else {
			this.ImatriculaNuevaService.matricular("1234234", "pd2343");

			
		}

		// Opcion 3
		this.matriculaService.matricular("1234234324", "ABC1234342");
		
	}

}
