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
public class IngenieroSoporte extends Empleado implements IActividades {
    public List<String> tecnologiasSoporte;

    public IngenieroSoporte() {
    }

    public IngenieroSoporte(List<String> tecnologiasSoporte, int age, String name, String address, int salary) {
        super(age, name, address, salary);
        this.tecnologiasSoporte = tecnologiasSoporte;
    }

    public List<String> getTecnologiasSoporte() {
        return tecnologiasSoporte;
    }

    public void setTecnologiasSoporte(List<String> tecnologiasSoporte) {
        this.tecnologiasSoporte = tecnologiasSoporte;
    }
    
    public void imprimirTecnologiasSoporte() {
        System.out.print("Tecnologías de soporte: ");
        if (tecnologiasSoporte == null || tecnologiasSoporte.isEmpty()) {
            System.out.println("Ninguna");
        }
        else {
            ((ArrayList)tecnologiasSoporte).forEach(tecnologiaSoporte -> System.out.print(tecnologiaSoporte + ", "));
            System.out.println();
        }
    }
    
    @Override
    public void actividadActual() {
        System.out.println("Actualmente lleva el rol de Ingeniero de Soporte.");
    }
    
    @Override
    public void resolverTickets() {
        System.out.println("Actualmente esta resolviendo los tickets.");
    }
}
