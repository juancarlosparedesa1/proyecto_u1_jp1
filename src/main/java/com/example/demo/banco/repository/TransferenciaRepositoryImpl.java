package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.Transferencia;
//aqui va todo lo referente a la base de datos
//vamos hacer metodos mocks

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public Transferencia buscar(Integer id) {
		
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
