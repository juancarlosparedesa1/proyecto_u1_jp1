package com.example.demo.tienda.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.tienda.modelo.Factura;
import com.example.demo.tienda.modelo.Producto;

public class IProductoRepositoryImpl implements IProductoRepository{

	private static List<Producto> baseDeDatos = new ArrayList<>();

	@Override
	public void inserta(Producto producto) {
		// TODO Auto-generated method stub
		baseDeDatos.add(producto);
		
	}


}
