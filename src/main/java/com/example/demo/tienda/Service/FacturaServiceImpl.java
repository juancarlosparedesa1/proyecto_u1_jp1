package com.example.demo.tienda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.spring.ItemTO;
import com.example.demo.tienda.Repository.IClienteRepository;
import com.example.demo.tienda.Repository.IFacturaRepository;
import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;

@Service
public class FacturaServiceImpl implements  IFacturaService {

    @Autowired
    private IFacturaRepository iFacturaRepository;

    private IClienteRepository clienteRepository;

 

    @Override
    public void generar(String cedulaCliente, List<ItemTO> detalles) {
        // TODO Auto-generated method stub

        Cliente cli = this.clienteRepository.buscar(cedulaCliente);

        Factura miFactura = new Factura();
        miFactura.setCliente(cli);
        this.iFacturaRepository.inserta(miFactura);

    }




}
