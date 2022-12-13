package com.example.demo.tienda.Service;

import java.util.List;

import com.example.demo.spring.ItemTO;

public interface IFacturaService {
	
	//conceptos de negocio generar
	public void generar(String cedulaCliente,List<ItemTO> detalles);
}
