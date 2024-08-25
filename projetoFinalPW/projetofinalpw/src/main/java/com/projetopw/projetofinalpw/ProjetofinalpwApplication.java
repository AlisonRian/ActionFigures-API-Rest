package com.projetopw.projetofinalpw;

import com.projetopw.projetofinalpw.core.security.RsaKeyProperties;
import com.projetopw.projetofinalpw.domain.Endereco;
import com.projetopw.projetofinalpw.domain.SecurityUser;
import com.projetopw.projetofinalpw.domain.Usuario;
import com.projetopw.projetofinalpw.repository.SecurityUserRepository;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class ProjetofinalpwApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetofinalpwApplication.class, args);
	}

	@Bean
	ModelMapper modelMapper(){
		return new ModelMapper();
	};

		@Autowired
		SecurityUserRepository securityUserRerpository;
		@Autowired
		BCryptPasswordEncoder encoder;

	@PostConstruct
	public void started() {
		Usuario u = new Usuario();
		u.setNome("Joao");


		Endereco e = new Endereco();
		e.setRua("Rua do Cacete");
		e.setNumero(20);
		e.setCep("59280-000");
		e.setEstado("Rio Grande do Norte");
		e.setBairro("Bairro do Norte");
		e.setRua("Natal");

		u.setEndereco(e);

		SecurityUser securityUser = new SecurityUser();
		securityUser.setUsuario(u);
		securityUser.setUsername("admin");
		securityUser.setPassword(encoder.encode("admin"));

		securityUserRerpository.save(securityUser);
	}
}
