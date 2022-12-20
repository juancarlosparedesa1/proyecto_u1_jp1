package com.example.demo.ejrcicio1.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.ejrcicio1.modelo.Matricula;

public class MatriculaRepository implements IMatriculaRepository {

	private static List<Matricula> base = new ArrayList<>();
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		base.add(matricula);
		
	}

	
}
