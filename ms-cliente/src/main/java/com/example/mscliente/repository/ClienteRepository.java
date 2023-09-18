package com.example.mscliente.repository;

import com.example.mscliente.entity.Cliente;
import jakarta.ws.rs.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
