package br.com.bennytech.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bennytech.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
