/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojavaparaexamen;

/**
 *
 * @author victorvidales1
 */
public interface IActividades {
    void actividadActual();
    
    default void diseñoVistaWeb(){
        System.out.print("Este empleado no lleva a cabo el diseño de la vista web.");
    }
    
    default void mantenimientoAplicacion(){
        System.out.print("Este empleado no lleva a cabo el mantenimiento de la aplicacion.");
    }
    
    default void resolverTickets(){
        System.out.print("Este empleado no resuelve los tickets.");
    }
}
