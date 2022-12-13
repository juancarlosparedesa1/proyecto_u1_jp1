package com.example.demo.tienda.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.tienda.modelo.Factura;

public class FacturaRepositoryImpl implements IFacturaRepository{

	private static List<Factura> baseDeDatos = new ArrayList<>();

	@Override
	public void inserta(Factura factura) {
		// TODO Auto-generated method stub
		baseDeDatos.add(factura);
		
	}


}
