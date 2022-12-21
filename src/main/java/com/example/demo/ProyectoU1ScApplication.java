package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner; //ejecuta en consola
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IGestorMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

	@Autowired
    private IVehiculoService iVehiculoService;

    @Autowired
    private IPropietarioService iPropietarioService;

    @Autowired
    private IGestorMatriculaService iGestorMatriculaService;
    

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Vehiculo vehi = new Vehiculo();
		Vehiculo vehi1=new Vehiculo();
        vehi1.setMarca("chevrolete");
        vehi1.setPlaca("psg120");
        vehi1.setPrecio(new BigDecimal(20000));
        vehi1.setTipo("P");

        this.iVehiculoService.crear(vehi1);

        vehi1.setPrecio(new BigDecimal(10000));
        vehi1.setMarca("toyota");

        this.iVehiculoService.modificar(vehi1);

        Propietario propietario=new Propietario();
        propietario.setApellido("Paredes");
        propietario.setCedula("1789448444");
        propietario.setFechaNacimiento(LocalDateTime.of(1989,7,7,12,35 ));
        propietario.setNombre("Juan Carlos");

        this.iPropietarioService.guardar(propietario);

        //opcion3
        this.iGestorMatriculaService.matricular("1789448444", "psg120");
		
		

	}

}
