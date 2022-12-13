package com.example.demo.tienda.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
@Service
public class ClienteRepositoryImpl implements IClienteRepository {
	 //para simular la base de datos

    private static List<Cliente> baseDeDatos = new ArrayList<>();    
    @Override
    public void insertar(Cliente cliente) {
        // TODO Auto-generated method stub
        baseDeDatos.add(cliente);
    }

 

    @Override
    public void actualizar(Cliente cliente) {
        // TODO Auto-generated method stub

    Cliente cli = null;

        for (Cliente client : baseDeDatos) {
            if (client.getCedula().equals(client.getCedula())) {
                cli = client;

            }

            }
             baseDeDatos.remove(cli);
             baseDeDatos.add(cli);
            System.out.println("se actualizo el cliente: " + cli);
    }

 

    @Override
    public Cliente buscar(String cedula) {
        // TODO Auto-generated method stub
    Cliente cli = null;

        for (Cliente client : baseDeDatos) {
            if (client.getCedula().equals(cedula)) {
                cli = client;

            }
    }
        return cli;
    }

 

    @Override
    public void eliminar(String cedula) {
        // TODO Auto-generated method stub
        Cliente client = buscar(cedula);
        baseDeDatos.remove(client);

 

    }
}
