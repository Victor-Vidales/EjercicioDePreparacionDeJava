/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojavaparaexamen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author victorvidales1
 */
public class Programador extends Empleado {
    public List<String> lenguajes;
    public List<String> frameworks;
    public String tituloProfesional;

    public Programador() {
    }

    public Programador(List<String> lenguajes, List<String> frameworks, String tituloProfesional, int age, String name, String address, int salary) {
        super(age, name, address, salary);
        this.lenguajes = lenguajes;
        this.frameworks = frameworks;
        this.tituloProfesional = tituloProfesional;
    }

    public List<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

    public List<String> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(List<String> frameworks) {
        this.frameworks = frameworks;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }
    
    @Override
    public String toString() {
        return "El programador " + this.getID() + " es " + this.getName() + " de " + this.getAge() + " años, vive en "  + this.getAddress()  + " y gana $" + this.getSalary() + ".00 con un bono de $" + this.getBono() + ".00";
    }
    
    public void imprimirLenguajes() {
        System.out.print("Lenguajes de programación: ");
        if (lenguajes == null || lenguajes.isEmpty()) {
            System.out.println("Ninguno");
        }
        else {
            Iterator it = lenguajes.iterator();
            while(it.hasNext()) {
                String lenguaje = (String)it.next();
                System.out.print(lenguaje + ", ");
            }
            System.out.println();
        }
    }
    
    public void imprimirFrameworks() {
        System.out.print("Frameworks: ");
        if (frameworks == null || frameworks.isEmpty()) {
            System.out.println("Ninguno");
        }
        else {
            ((ArrayList)frameworks).forEach(framework -> System.out.print(framework + ", "));
            System.out.println();
        }
    }
}
