package com.example.demo.ejrcicio1.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejrcicio1.Repository.IMatriculaRepository;
import com.example.demo.ejrcicio1.Repository.IPropietarioRepository;
import com.example.demo.ejrcicio1.Repository.IVehiculoRepository;
import com.example.demo.ejrcicio1.modelo.Matricula;
import com.example.demo.ejrcicio1.modelo.Propietario;
import com.example.demo.ejrcicio1.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		Propietario pro = this.iPropietarioRepository.buscar(cedula);
		matricula.setPropietario(pro);

		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);
		
		BigDecimal valor = null;
		if (vehiculo.getTipo().equals("P")) {
			valor = vehiculo.getPrecio().multiply(new BigDecimal(0.15));
			
			
		}else {
			//Liviano
			valor = vehiculo.getPrecio().multiply(new BigDecimal(0.15));

			
		}
		
		//-1 el valor de izquierda es menor
		//0 son iguales
		//1 izquierda mayor
		
		if (valor.compareTo(new BigDecimal(2000))>1) {
			
			BigDecimal descuento = valor.multiply(new BigDecimal(0.07));
		}
		matricula.setValorMatrciula(null);

	}

}
