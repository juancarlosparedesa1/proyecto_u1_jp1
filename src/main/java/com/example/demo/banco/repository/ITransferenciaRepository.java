package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	static List<Transferencia> baseDatos = new ArrayList<>();
	//CRUD
	
	//depende del sistema utilizar el crud todas las 4r funciones
		//BUSCAR
		public Transferencia buscar(Integer id);//clave primaria//no necesito
		//
		public void actualizar(Transferencia transferencia);//no necestio en el ejmplo
		public void insertar(Transferencia transferencia);
		public void borrar(Integer id);//primarykey//no necesito
		
		public List<Transferencia> buscarTodos();
		
}
