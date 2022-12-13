package com.example.demo.tienda.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Detalle;
@Repository
public class DetalleServiceImpl implements IDetalleService {

    private static List<Detalle> baseDeDatos = new ArrayList<>();    

	@Override
	public void insertar(Detalle Detalle) {
		// TODO Auto-generated method stub
		
		baseDeDatos.add(Detalle);
		
	}

	

}
