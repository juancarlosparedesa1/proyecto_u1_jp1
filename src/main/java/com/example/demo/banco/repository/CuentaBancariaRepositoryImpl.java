package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
//implementamos interfaz
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	private static List<CuentaBancaria> baseCuentas=new ArrayList<>();//
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//conexion a la base de datos
				//crud
				//SELECT * FROM CUENTA  C WHERE C.NUMERO= numeroCuenta (repasar SQL)
//		CuentaBancaria cuenta =new CuentaBancaria();
//		cuenta.setNumero(numeroCuenta);
//		cuenta.setSaldo(new BigDecimal(100));
//		cuenta.setTipo("A");
//		cuenta.setTitular("Juan Carlos");
		
		//busqueda sencilla
		CuentaBancaria cuenta=null;
		for(CuentaBancaria cb: baseCuentas) {
			
			if(cb.getNumero().equals(numeroCuenta)) {
				
				cuenta=cb;
			}
			
		}
		System.out.println("Se busca la cuenta:"+numeroCuenta);
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta:"+id);
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza la cuenta:"+cuentaBancaria);

		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		System.out.println("Se inserta la cuentaBancaria");

		baseCuentas.add(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se borra la cuentaBancarua:"+id);

		
	}

}
