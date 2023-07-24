package br.com.bennytech.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bennytech.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
