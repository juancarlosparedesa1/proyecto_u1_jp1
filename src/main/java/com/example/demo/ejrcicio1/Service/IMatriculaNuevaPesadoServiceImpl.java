package com.example.demo.ejrcicio1.Service;

import org.springframework.stereotype.Service;

@Service("Pesado")
public class IMatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService {

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado pesado");
		System.out.println("Calculo del descuento 20000");
	}

}
