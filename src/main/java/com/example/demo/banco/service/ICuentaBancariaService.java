package com.example.demo.banco.service;

import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
 
public interface ICuentaBancariaService {
	
	//busqueda
	//Métodos a considerar de la lógica de negocios
//Aquí creamos los métodos Crud que implementamos en la capa de Repository
	public CuentaBancaria buscarPorNumero(String numeroCuenta);

	//BUSCAR
	public CuentaBancaria buscar(Integer id);//clave primaria
	//
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);//primarykey
}
