package com.example.demo.tienda.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.Repository.IClienteRepository;
import com.example.demo.tienda.modelo.Cliente;
	
@Service
public class ClienteServiceImpl implements IClienteService {
	 //para simular la base de datos
	@Autowired
    private IClienteRepository clienteRepository;   
    @Override
    //manejo funcionalidedes del negocio LOGICA DE negocio
    public void agregar(Cliente cliente) {
        // TODO Auto-generated method stub
    	this.clienteRepository.insertar(cliente);
    }
	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}
	
	

 

    
    
}
