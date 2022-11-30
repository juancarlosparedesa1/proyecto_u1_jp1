package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaservice {
	//Usaremos para buscar todas las transferencias
	public List<Transferencia> buscarReporte();
	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto);
	

}
