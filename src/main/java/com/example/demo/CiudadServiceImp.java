package com.example.demo;

import org.springframework.stereotype.Service;

@Service("CiudadServiceImp")
public class CiudadServiceImp implements  CiudadService{

    Ciudad ciudad = new Ciudad();

    public String getNombre() {
        return ciudad.getNombre();
    }

    public void setNombre(String nombre) {
        ciudad.setNombre(nombre);
    }

    public int getNumeroHabitantes() {
        return ciudad.getNumeroHabitantes();
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        ciudad.setNumeroHabitantes(numeroHabitantes);
    }

    public String toString() {
        return "CiudadServiceImp{" +
                "ciudad =" + ciudad +
                '}';
    }
}