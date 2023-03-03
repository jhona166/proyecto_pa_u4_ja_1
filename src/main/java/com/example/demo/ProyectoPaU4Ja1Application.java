package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Persona;
import com.example.demo.service.IPersonaService;
@RestController
@SpringBootApplication
public class ProyectoPaU4Ja1Application implements CommandLineRunner{

//	private static final Logger LOG = LoggerFactory.getLogger(ProyectoPaU4Ja1Application.class);
//	@Autowired
//	private IPersonaService iPersonaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU4Ja1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Persona persona = new Persona();
//		persona.setApellido("Velasco");
//		persona.setNombre("Freddy");
//		persona.setCedula("1727501510");
//		persona.setGenero("M");
//		this.iPersonaService.guardar(persona); // guardar
	
//		Persona personaMod = this.iPersonaService.buscarPorId(2); // buscar
//		personaMod.setApellido("Rios");
//		personaMod.setNombre("Marco");
//		personaMod.setCedula("1754613278");
//		this.iPersonaService.actualizar(personaMod); // actualizar
//		
//		this.iPersonaService.eliminar(3);
//		
//		List<Persona> personas = this.iPersonaService.buscarTodos();
//		personas.forEach(lista -> LOG.info(" "+lista)); // buscar Todos
	}

}
