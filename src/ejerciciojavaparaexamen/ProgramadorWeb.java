/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojavaparaexamen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victorvidales1
 */
public class ProgramadorWeb extends Programador implements IActividades {
    public List<String> tecnologiasWeb;
    public int tiempoDeExperiencia; //Entre 1 y 15

    public ProgramadorWeb() {
    }

    public ProgramadorWeb(List<String> tecnologiasWeb, int tiempoDeExperiencia, List<String> lenguajes, List<String> frameworks, String tituloProfesional, int age, String name, String address, int salary) {
        super(lenguajes, frameworks, tituloProfesional, age, name, address, salary);
        this.tecnologiasWeb = tecnologiasWeb;
        this.tiempoDeExperiencia = tiempoDeExperiencia;
    }

    
    public List<String> getTecnologiasWeb() {
        return tecnologiasWeb;
    }

    public void setTecnologiasWeb(List<String> tecnologiasWeb) {
        this.tecnologiasWeb = tecnologiasWeb;
    }

    public int getTiempoDeExperiencia() {
        return tiempoDeExperiencia;
    }

    public void setTiempoDeExperiencia(int tiempoDeExperiencia) {
        this.tiempoDeExperiencia = tiempoDeExperiencia;
    }
    
    public void imprimirTecnologiasWeb() {
        System.out.print("Tecnologías web: ");
        if (tecnologiasWeb == null || tecnologiasWeb.isEmpty()) {
            System.out.println("Ninguna");
        }
        else {
            ((ArrayList)tecnologiasWeb).forEach(tecnologiaWeb -> System.out.print(tecnologiaWeb + ", "));
            System.out.println();
        }
    }
    
    @Override
    public void actividadActual() {
        System.out.println("Actualmente lleva el rol de Programador web.");
    }
    
    @Override
    public void diseñoVistaWeb() {
        System.out.println("Actualmente esta realizando el diseño de la vista web.");
    }
}
