package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController()
public class Controlador1 {

    @Autowired
    ArrayList<CiudadService> ciudades;

    @PostMapping("/controlador1/addciudad")
    public String ciudadAdd(@RequestBody Ciudad ciudad){
        CiudadService c = new CiudadServiceImp();
        c.setNombre(ciudad.getNombre());
        c.setNumeroHabitantes(ciudad.getNumeroHabitantes());
        ciudades.add(c);
        return ciudad.toString() + " añadida";
    }

}