package com.example.demo.ejrcicio1.Repository;

import com.example.demo.ejrcicio1.modelo.Vehiculo;

public interface IVehiculoRepository {

	public Vehiculo buscar(String placa);
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void borrar(Vehiculo placa);
}
