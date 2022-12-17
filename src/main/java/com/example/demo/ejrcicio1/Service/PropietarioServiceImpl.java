package com.example.demo.ejrcicio1.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.ejrcicio1.Repository.IPropietarioRepository;
import com.example.demo.ejrcicio1.modelo.Propietario;

public class PropietarioServiceImpl implements IPropietarioService {
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public void elimar(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(cedula);
	}

}
