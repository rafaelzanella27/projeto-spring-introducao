package com.estudos.projetospringintroducao.service;

import com.estudos.projetospringintroducao.model.Cliente;
import com.estudos.projetospringintroducao.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    ClientesRepository repository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente (Cliente cliente){

    }
}
