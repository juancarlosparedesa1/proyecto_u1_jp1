package com.example.demo.ejrcicio1.Service;

import com.example.demo.ejrcicio1.modelo.Vehiculo;

public interface IVehiculoService {

	public Vehiculo buscar(String placa);
	public void crear(Vehiculo vehiculo);
	public void modificar(Vehiculo vehiculo);
	public void quitar(String placa);
}
