package br.com.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.workshopmongo.domain.User;
import br.com.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Vitoria", "vitoria@gmail.com");
		User nailton = new User(null, "Nailton", "nailton@gmail.com");
		User mercia = new User(null, "Mercia", "mercia@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, nailton, mercia));
	}

}
