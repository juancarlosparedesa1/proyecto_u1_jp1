package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	private static List<Transferencia> baseDatos = new ArrayList<>();

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		// Insert into Transferencia(
		baseDatos.add(transferencia);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Transferencia> buscarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
