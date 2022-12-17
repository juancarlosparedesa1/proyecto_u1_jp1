package com.example.demo.ejrcicio1.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.ejrcicio1.modelo.Vehiculo;

public class VehiculoRepositoryImpl implements IVehiculoRepository {


	
	private static List<Vehiculo> base = new ArrayList<>();
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=null;
		for (Vehiculo v :base ) {
			if (v.getPlaca().equals(placa)) {
				vehiculo=v;
				
			}
			
		}
		return vehiculo;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		base.add(vehiculo);
	}

	@Override
	public Vehiculo void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo vehi=null;

		for (Vehi v :base ) {
			if (v.getPlaca().equals(vehiculo.getPlaca())) {
				vehi=v;
				
			}
			base.remove(vehi);I
			base.add(vehiculo);
		}
		return vehiculo;
		
	}
	

	@Override
	public void borrar(Vehiculo placa) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(placa));
	}
	

}
