package com.example.demo.ejrcicio1.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.ejrcicio1.Repository.IVehiculoRepository;
import com.example.demo.ejrcicio1.modelo.Vehiculo;

public class VehiculoServiceImpl implements IVehiculoService {
	@Autowired
	private IVehiculoRepository ivehiculoRepository;

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.ivehiculoRepository.buscar(placa);
	}

	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.ivehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.ivehiculoRepository.actualizar(vehiculo);

	}

	@Override
	public void quitar(String placa) {
		// TODO Auto-generated method stub
		//this.ivehiculoRepository.borrar(vehiculo);

	}

}
