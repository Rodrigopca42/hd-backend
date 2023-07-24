package br.com.bennytech.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.bennytech.helpdesk.domain.Chamado;
import br.com.bennytech.helpdesk.domain.Cliente;
import br.com.bennytech.helpdesk.domain.Tecnico;
import br.com.bennytech.helpdesk.domain.enums.Perfil;
import br.com.bennytech.helpdesk.domain.enums.Prioridade;
import br.com.bennytech.helpdesk.domain.enums.Status;
import br.com.bennytech.helpdesk.repositories.ChamadoRepository;
import br.com.bennytech.helpdesk.repositories.PessoaRepository;

@Service
public class DBService {
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	
	
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Rodrigo Cardoso", "672.652.190-15", "rodrigo@email.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Ricardo Machado" , "903.347.070-56", "ricardo@email.com",encoder.encode("123"));
		//tec2.addPerfil(Perfil.ADMIN);
		Tecnico tec3 = new Tecnico(null, "Claudio Oliveira", "271.068.470-54", "claudio@email.com", encoder.encode("123"));
		//tec3.addPerfil(Perfil.ADMIN);
		Tecnico tec4 = new Tecnico(null, "Tim Berners-Lee", "162.720.120-39", "lee@email.com", encoder.encode("123"));
		//tec4.addPerfil(Perfil.ADMIN);
		Tecnico tec5 = new Tecnico(null, "Linus Torvalds", "778.556.170-27", "linus@email.com", encoder.encode("123"));
		//tec5.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Alexandre Luiz", "031.255.190-80", "alex@email.com", encoder.encode("123"));
		Cliente cli2 = new Cliente(null, "Marie Curie", "322.429.140-06", "curie@email.com",encoder.encode("123"));
		Cliente cli3 = new Cliente(null, "Charles Darwin", "792.043.830-62", "darwin@email.com", encoder.encode("123"));
		Cliente cli4 = new Cliente(null, "Stephen Hawking", "177.409.680-30", "hawking@email.com", encoder.encode("123"));
		Cliente cli5 = new Cliente(null, "Max Planck", "081.399.300-83", "planck@email.com", encoder.encode("123"));

		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "Primerio chamado", tec1, cli1);
		Chamado cha2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 2", "Teste chamado 2", tec1, cli2);
		Chamado cha3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 3", "Teste chamado 3", tec2, cli3);
		Chamado cha4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 4", "Teste chamado 4", tec3, cli3);
		Chamado cha5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 5", "Teste chamado 5", tec2, cli1);
		Chamado cha6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 7", "Teste chamado 6", tec1, cli5);
		
		
		
		
		pessoaRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));
		pessoaRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(cha1, cha2, cha3, cha4, cha5));
	}
	 
}
