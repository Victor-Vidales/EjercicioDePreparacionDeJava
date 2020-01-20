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
public class EjercicioJavaParaExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Prueba 1: No se puede asignar un objeto de tipo Empleado a uno de tipo Programador, marca error de ejecución debido al casteo, si no se casteara fuera un error de compilación.
        /*Empleado empleadoPrueba1 = new Empleado();
        Programador programadorPrueba1 = ((Programador) empleadoPrueba1);*/
        
        // Prueba 2: No se puede asignar un objeto de tipo Empleado a uno de tipo ProgramadorWeb, marca error de ejecución debido al casteo, si no se casteara fuera un error de compilación.
        /*Empleado empleadoPrueba2 = new Empleado();
        ProgramadorWeb programadorWebPrueba2 = ((ProgramadorWeb) empleadoPrueba2);*/
        
        // Prueba 3: No se puede asignar un objeto de tipo Empleado a uno de tipo ProgramadorMobile, marca error de ejecución debido al casteo, si no se casteara fuera un error de compilación.
        /*Empleado empleadoPrueba3 = new Empleado();
        ProgramadorMobile programadorPrueba3 = ((ProgramadorMobile) empleadoPrueba3);*/
        
        // Prueba 4: No se puede asignar un objeto de tipo Empleado a uno de tipo IngenieroSoporte, marca error de ejecución debido al casteo, si no se casteara fuera un error de compilación.
        /*Empleado empleadoPrueba4 = new Empleado();
        IngenieroSoporte ingenieroSoportePrueba1 = ((IngenieroSoporte) empleadoPrueba4);*/
        
        // Prueba 5: Si se puede asignar un objeto de tipo Programador a uno de tipo Empleado.
        Programador programadorPrueba5 = new Programador();
        Empleado empleadoPrueba5 = programadorPrueba5;
        
        // Prueba 6: Si se puede asignar un objeto de tipo ProgramadorWeb a uno de tipo Empleado.
        ProgramadorWeb programadorWebPrueba6 = new ProgramadorWeb();
        Empleado empleadoPrueba6 = programadorWebPrueba6;
        
        // Prueba 7: Si se puede asignar un objeto de tipo ProgramadorMobile a uno de tipo Empleado.
        ProgramadorMobile programadorMobilePrueba7 = new ProgramadorMobile();
        Empleado empleadoPrueba7 = programadorMobilePrueba7;
        
        // Prueba 8: Si se puede asignar un objeto de tipo IngenieroSoporte a uno de tipo Empleado.
        IngenieroSoporte ingenieroSoportePrueba8 = new IngenieroSoporte();
        Empleado empleadoPrueba8 = ingenieroSoportePrueba8;
        
        // Prueba 9: No se puede asignar un objeto de tipo Programador a uno de tipo ProgramadorWeb, marca error de ejecución debido al casteo, si no se casteara fuera un error de compilación.
        /*Programador programadorPrueba9 = new Programador();
        ProgramadorWeb programadorWebPrueba9 = ((ProgramadorWeb)programadorPrueba9);*/
        
        // Prueba 10: No se puede asignar un objeto de tipo Programador a uno de tipo ProgramadorMobile, marca error de ejecución debido al casteo, si no se casteara fuera un error de compilación.
        /*Programador programadorPrueba10 = new Programador();
        ProgramadorMobile programadorMobilePrueba10 = ((ProgramadorMobile)programadorPrueba10);*/
        
        // Prueba 11: Si se puede asignar un objeto de tipo ProgramadorWeb a uno de tipo Programador.
        ProgramadorWeb programadorWebPrueba11 = new ProgramadorWeb();
        Programador programadorPrueba11 = programadorWebPrueba11;
        
        // Prueba 12: Si se puede asignar un objeto de tipo ProgramadorMobile a uno de tipo Programador.
        ProgramadorMobile programadorMobilePrueba12 = new ProgramadorMobile();
        Programador programadorPrueba12 = programadorMobilePrueba12;
        
        //Prueba de objeto tipo Empleado
        Empleado empleado = new Empleado(
                30,
                "Alfredo",
                "Moctezuma #12",
                (int)Math.floor(Math.random()*(80000-10000+1)+10000)
        );
        System.out.println("El empleado " + empleado.getID() + " es " + empleado.getName() + " de " + empleado.getAge() + " años, vive en "  + empleado.getAddress()  + " y gana $" + empleado.getSalary() + " con un bono de $" + empleado.getBono());
        System.out.println();
        
        //Prueba de objeto tipo Programador
        List<String> lenguajesProgramador = new ArrayList<String>();
        lenguajesProgramador.add("Java");
        lenguajesProgramador.add("C++");
        List<String> frameworksProgramador = new ArrayList<String>();
        frameworksProgramador.add("Laravel");
        frameworksProgramador.add("Angular");
        Programador programador = new Programador(
                lenguajesProgramador,
                frameworksProgramador,
                "Ingeniería en Sistemas computacionales",
                33,
                "Jesús",
                "Ramón Corona",
                (int)Math.floor(Math.random()*(80000-10000+1)+10000)
        );
        System.out.println(programador.toString());
        programador.imprimirLenguajes();
        programador.imprimirFrameworks();
        System.out.println();
        
        //Prueba de objeto tipo ProgramadorWeb
        List<String> lenguajesProgramadorWeb = new ArrayList<String>();
        lenguajesProgramadorWeb.add("Phyton");
        lenguajesProgramadorWeb.add("C");
        List<String> frameworksProgramadorWeb = new ArrayList<String>();
        frameworksProgramadorWeb.add("Angular");
        List<String> tecnologiasWebProgramadorWeb = new ArrayList<String>();
        tecnologiasWebProgramadorWeb.add("Typescript");
        tecnologiasWebProgramadorWeb.add("Javascript");
        tecnologiasWebProgramadorWeb.add("Ajax");
        tecnologiasWebProgramadorWeb.add("Bootstrap");
        ProgramadorWeb programadorWeb = new ProgramadorWeb(
                tecnologiasWebProgramadorWeb,
                (int)Math.floor(Math.random()*15+1),
                lenguajesProgramadorWeb,
                frameworksProgramadorWeb,
                "Ingeniería en Sistemas computacionales",
                21,
                "Omar",
                "Venustiao Carranza #344",
                (int)Math.floor(Math.random()*(80000-10000+1)+10000)
        );
        System.out.println(programadorWeb.toString());
        programadorWeb.actividadActual();
        programadorWeb.diseñoVistaWeb();
        programadorWeb.imprimirLenguajes();
        programadorWeb.imprimirFrameworks();
        programadorWeb.imprimirTecnologiasWeb();
        System.out.println();
        
        //Prueba de objeto tipo ProgramadorWeb
        List<String> lenguajesProgramadorMovil = new ArrayList<String>();
        lenguajesProgramadorMovil.add("PHP");
        lenguajesProgramadorMovil.add("Java");
        List<String> frameworksProgramadorMovil = new ArrayList<String>();
        List<String> tecnologiasMovilesProgramadorMovil = new ArrayList<String>();
        tecnologiasMovilesProgramadorMovil.add("Swift");
        ProgramadorMobile programadorMobile = new ProgramadorMobile(
                tecnologiasMovilesProgramadorMovil,
                (int)Math.floor(Math.random()*15+1),
                lenguajesProgramadorMovil,
                frameworksProgramadorMovil,
                "Ingeniería en Sistemas computacionales",
                43,
                "Ricardo",
                "Pinos #45",
                (int)Math.floor(Math.random()*(80000-10000+1)+10000)
        );
        System.out.println(programadorMobile.toString());
        programadorMobile.actividadActual();
        programadorMobile.mantenimientoAplicacion();
        programadorMobile.imprimirLenguajes();
        programadorMobile.imprimirFrameworks();
        programadorMobile.imprimirTecnologiasMoviles();
        System.out.println();
        
        List<String> tecnologiasDeSoporte = new ArrayList<String>();
        IngenieroSoporte ingenieroSoporte = new IngenieroSoporte(
                tecnologiasDeSoporte,
                54,
                "Ernesto",
                "Pinos #98",
                (int)Math.floor(Math.random()*(80000-10000+1)+10000)
        );
        System.out.println("El empleado " + ingenieroSoporte.getID() + " es " + ingenieroSoporte.getName() + " de " + ingenieroSoporte.getAge() + " años, vive en "  + ingenieroSoporte.getAddress()  + " y gana $" + ingenieroSoporte.getSalary() + " con un bono de $" + ingenieroSoporte.getBono());
        ingenieroSoporte.actividadActual();
        ingenieroSoporte.resolverTickets();
        ingenieroSoporte.imprimirTecnologiasSoporte();
        System.out.println();

    }
    
}