package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.ejrcicio1.Service.IPropietarioService;
import com.example.demo.ejrcicio1.Service.IVehiculoService;
import com.example.demo.ejrcicio1.modelo.Propietario;
import com.example.demo.ejrcicio1.modelo.Vehiculo;

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
	private IVehiculoService iVehiculoService;
	@Autowired
	private IPropietarioService iPropietarioService;
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaService iTransferenciaService;

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
		cuenta.setTitular("Juan  Pérez");
		cuenta.setSaldo(new BigDecimal(100));

		this.bancariaService.insertar(cuenta);

		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("002");
		cuenta2.setSaldo(new BigDecimal(1000));
		cuenta2.setTipo("C");
		cuenta2.setTitular("Luis Gonzalez");
		this.bancariaService.insertar(cuenta2);

		System.out.println("Saldo consultar");
		CuentaBancaria cuentaActual1 = this.bancariaService.buscarPorNumero("001");
		CuentaBancaria cuentaActual2 = this.bancariaService.buscarPorNumero("002");

		System.out.println("saldos nuevas" + cuentaActual1.getSaldo());
		System.out.println("saldos nuevas" + cuentaActual2.getSaldo());

		System.out.println("Reporte 1");
		for (Transferencia t : this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		this.iTransferenciaService.realizar("001", "002", new BigDecimal(100));

		System.out.println("Reporte 2");
		for (Transferencia t : this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}

		System.out.println("saldos nuevos:");
		CuentaBancaria cuentaConsultada1 = this.bancariaService.buscarPorNumero("001");
		CuentaBancaria cuentaConsultada2 = this.bancariaService.buscarPorNumero("002");

		System.out.println("saldos nuevas" + cuentaConsultada1.getSaldo());
		System.out.println("saldos nuevas" + cuentaConsultada2.getSaldo());

		//opcion1
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Toyota");
		vehi.setPlaca("PDG23323");
		vehi.setPrecio(new BigDecimal(2000));
		vehi.setTipo("P");

//		
		this.iVehiculoService.crear(vehi);
		vehi.setPrecio(new BigDecimal(1000000));
		vehi.setMarca("Chevrolet");

		this.iVehiculoService.modificar(vehi);
		
		//opcion 2
		Propietario propietario = new Propietario();
		propietario.setApellido("Paredes");
		propietario.setCedula("1231231232");
		propietario.setFechaNacimiento(LocalDateTime.of(1989,7,7,12,35));
		
		this.iPropietarioService.guardar(propietario);

		//opcion3
		
	}

}
