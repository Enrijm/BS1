package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController()
public class Controlador1 {

    @Autowired
    ArrayList<CiudadService> ciudades;

    @Autowired
    @Qualifier("PersonaServiceImp")
    PersonaService personaService;
    @Autowired
    @Qualifier("bean1")
    PersonaService personaService1;

    @Autowired
    @Qualifier("bean2")
    PersonaService personaService2;

    @Autowired
    @Qualifier("bean3")
    PersonaService personaService3;

    @PostMapping("/controlador1/addciudad")
    public String ciudadAdd(@RequestBody Ciudad ciudad){
        CiudadService c = new CiudadServiceImp();
        c.setNombre(ciudad.getNombre());
        c.setNumeroHabitantes(ciudad.getNumeroHabitantes());
        ciudades.add(c);
        return ciudad.toString() + " añadida";
    }

    @GetMapping("/controlador1/bean/{bean}")
    public String getPersonaBean(@PathVariable String bean){
        switch(bean){
            case "bean1":
                return personaService1.toString();
            case "bean2":
                return personaService2.toString();
            case "bean3":
                return personaService3.toString();
            default:
                return "Parámetros inválidos";
        }
    }

    @PostMapping("/controlador1/addpersona")
    public String personaAdd(@RequestBody Persona persona){
        PersonaService p = new PersonaServiceImp();
        p.setNombre(persona.getNombre());
        p.setEdad(persona.getEdad());
        p.setCiudad(persona.getCiudad());
        return p.toString()+ " añadida";
    }
    @GetMapping("/controlador1/addpersona2")
    public String getPersona2(@RequestHeader String nombre, @RequestHeader String ciudad, @RequestHeader String edad){
        personaService.setNombre(nombre);
        personaService.setEdad(edad);
        personaService.setCiudad(ciudad);
        return personaService.toString();
    }

    @GetMapping("/controlador1/getciudad")
    public List<CiudadService> getCiudades(){
        return ciudades;
    }


}