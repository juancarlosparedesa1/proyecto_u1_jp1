package com.example.demo.ejrcicio1.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.ejrcicio1.modelo.Propietario;

public class PropietarioServiceImpl implements IPropietarioRepository {

	private static List<Propietario> base = new ArrayList<>();
	
	
	
	private Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario=null;
		for (Propietario p : base ) {
			if (p.getCedula().equals(cedula)) {
				propietario=p;
			}
			return propietario;
		}
		return propietario;
	}
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		
		base.add(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(cedula));
	}

}
