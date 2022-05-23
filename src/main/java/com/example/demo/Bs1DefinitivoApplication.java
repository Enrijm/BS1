package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Bs1DefinitivoApplication {

	public static void main(String[] args) {

		SpringApplication.run(Bs1DefinitivoApplication.class, args);

	}


	@Bean
	ArrayList<CiudadService> createCiudad(){
		ArrayList<CiudadService> ciudades = new ArrayList<>();
		CiudadService c = new CiudadServiceImp();
		c.setNombre("Jaen");
		c.setNumeroHabitantes(100000);
		ciudades.add(c);
		return ciudades;
	}

//	@Bean(name = "bean1")
//	PersonaService getPersonaService1(){
//		PersonaService p = new PersonaServiceImp();
//		p.createPersona(new Persona("Rubén", "25", "Torredonjimeno"));
//		return p;
//	}
//
//	@Bean(name = "bean2")
//	PersonaService getPersonaService2(){
//		PersonaService p = new PersonaServiceImp();
//		p.createPersona(new Persona("Daniel", "30", "Sevilla"));
//		return p;
//	}
//
//	@Bean(name = "bean3")
//	PersonaService getPersonaService3(){
//		PersonaService p = new PersonaServiceImp();
//		p.createPersona(new Persona("Ana", "21", "Madrid"));
//		return p;
//	}
}