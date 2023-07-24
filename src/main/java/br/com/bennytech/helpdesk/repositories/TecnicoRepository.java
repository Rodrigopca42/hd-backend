package br.com.bennytech.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bennytech.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
