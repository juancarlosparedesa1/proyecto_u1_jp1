package com.example.demo.ejrcicio1.Service;

import com.example.demo.ejrcicio1.modelo.Propietario;

public interface IPropietarioService {

	public void guardar(Propietario propietario);
	public void elimar(String cedula);
}
