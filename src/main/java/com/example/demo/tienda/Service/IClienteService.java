package com.example.demo.tienda.Service;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteService {

	public void agregar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);//identificador de cliente
	public void eliminar(String cedula );//con un identifacar siempre
}
