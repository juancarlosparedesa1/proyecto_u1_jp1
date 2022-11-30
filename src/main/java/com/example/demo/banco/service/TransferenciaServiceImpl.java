package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;
@Service
public class TransferenciaServiceImpl implements ITransferenciaservice{

	//Aquí hacemos DI de la transferenciaRepository
	
	@Autowired
	private ITransferenciaRepository transferenciaRepository ;
	private ICuentaBancariaService cuentaService;
	@Override
	public List<Transferencia> buscarReporte() {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.buscarTodos();
	}
	@Override
	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//////PASOS PARA LA CUENTA DE ORIGEN/////
	//1er. Paso: Buscar la cuenta origen
		CuentaBancaria origen =this.cuentaService.buscarPorNumero(cuentaOrigen);
	//2do. Paso: Consultar el saldo
		BigDecimal saldoOrigen =origen.getSaldo();
	//3er. Paso: Operación de la transferencia (restamos al saldo de origen)
		BigDecimal nuevoSaldo = saldoOrigen.subtract(monto);
		
	//4to. Paso: Actualización cuenta de origen
	origen.setSaldo(nuevoSaldo);
	this.cuentaService.actualizar(origen);//Aquí mandamos a la BD
	
	//////PASOS PARA LA CUENTA DE DESTINO/////
		//1er. Paso: Buscar la cuenta destino
	CuentaBancaria destino = this.cuentaService.buscarPorNumero(cuentaDestino);
		//2do. Paso: Consultar el saldo
	BigDecimal saldoDestino = destino.getSaldo();
		//3er. Paso: Operación de la transferencia (sumamos al saldo de destino)
	BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		//4to. Paso: Actualización cuenta de destino
		destino.setSaldo(nuevoSaldoDestino);
		this.cuentaService.actualizar(destino);
		
	}
	

}
