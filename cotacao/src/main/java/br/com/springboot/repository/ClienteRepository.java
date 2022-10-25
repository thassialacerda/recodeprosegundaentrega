package br.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long >{

}
