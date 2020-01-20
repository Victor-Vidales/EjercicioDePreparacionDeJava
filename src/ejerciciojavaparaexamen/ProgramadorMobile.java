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
public class ProgramadorMobile extends Programador implements IActividades {
    public List<String> tecnologiasMoviles;
    public int tiempoDeExperiencia; //Entre 1 y 15

    public ProgramadorMobile() {
    }

    public ProgramadorMobile(List<String> tecnologiasMoviles, int tiempoDeExperiencia, List<String> lenguajes, List<String> frameworks, String tituloProfesional, int age, String name, String address, int salary) {
        super(lenguajes, frameworks, tituloProfesional, age, name, address, salary);
        this.tecnologiasMoviles = tecnologiasMoviles;
        this.tiempoDeExperiencia = tiempoDeExperiencia;
    }

    public List<String> getTecnologiasMoviles() {
        return tecnologiasMoviles;
    }

    public void setTecnologiasMoviles(List<String> tecnologiasMoviles) {
        this.tecnologiasMoviles = tecnologiasMoviles;
    }

    public int getTiempoDeExperiencia() {
        return tiempoDeExperiencia;
    }

    public void setTiempoDeExperiencia(int tiempoDeExperiencia) {
        this.tiempoDeExperiencia = tiempoDeExperiencia;
    }
    
    public void imprimirTecnologiasMoviles() {
        System.out.print("Tecnologías móviles: ");
        if (tecnologiasMoviles == null || tecnologiasMoviles.isEmpty()) {
            System.out.println("Ninguna");
        }
        else {
            ((ArrayList)tecnologiasMoviles).forEach(tecnologiaMoviles -> System.out.print(tecnologiaMoviles + ", "));
            System.out.println();
        }
    }
    
    @Override
    public void actividadActual() {
        System.out.println("Actualmente lleva el rol de Programador Movil.");
    }
    
        @Override
    public void mantenimientoAplicacion() {
        System.out.println("Actualmente esta realizando el mantenimiento de la aplicacion.");
    }
}
