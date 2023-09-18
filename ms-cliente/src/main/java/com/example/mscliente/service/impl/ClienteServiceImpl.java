package com.example.mscliente.service.impl;

import com.example.mscliente.entity.Cliente;
import com.example.mscliente.repository.ClienteRepository;
import com.example.mscliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository ClienteRepository;
    @Override
    public List<Cliente> listar() {
        return ClienteRepository.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return ClienteRepository.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return ClienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> listarPorId(Integer id) {
        return ClienteRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
    ClienteRepository.deleteById(id);
    }
}
