package com.example.demo.tienda.Repository;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteRepository {

	public void insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);//identificador de cliente
	public void eliminar(String cedula );//con un identifacar siempre
}
