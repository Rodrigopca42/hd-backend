package br.com.bennytech.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.bennytech.helpdesk.services.DBService;

@Configuration
@Profile("teste")
public class testConfig {

	@Autowired
	private DBService dbservice;
	@Bean
	public void instanciaDB() {
		this.dbservice.instanciaDB();
	}
	
	
}
