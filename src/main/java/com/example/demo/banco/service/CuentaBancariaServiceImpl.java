package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
	
	
	@Autowired
	private ICuentaBancariaRepository cuentaRepository ;
	
	
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.buscarPorNumero(numeroCuenta);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.buscar(id);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuentaBancaria);
	}



	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaRepository.borrar(id);
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaRepository.insertar(cuentaBancaria);
	}
	

}
