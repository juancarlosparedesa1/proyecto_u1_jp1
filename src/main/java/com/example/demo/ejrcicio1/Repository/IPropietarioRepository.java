package com.example.demo.ejrcicio1.Repository;

import com.example.demo.ejrcicio1.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar (Propietario propietario);
	public void eliminar(String cedula);
	public Propietario buscar(String cedula);
}
