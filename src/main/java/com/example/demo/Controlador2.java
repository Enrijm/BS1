package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador2 {

    @Autowired
    ArrayList<CiudadService> ciudades;


    @GetMapping("/controlador2/getciudad")
    public String getCiudades(){
        return ciudades.toString();
    }

}