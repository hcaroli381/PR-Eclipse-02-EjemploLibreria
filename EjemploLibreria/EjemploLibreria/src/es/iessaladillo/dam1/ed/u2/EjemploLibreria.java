package es.iessaladillo.dam1.ed.u2;

import org.joda.time.LocalDate;   // importamos clase de la librería externa

public class EjemploLibreria {
    public static void main(String[] args) {
        LocalDate hoy = new LocalDate(); //fecha local
        LocalDate futuro = hoy.plusDays(10);    // Fecha dentro de 10 días
        System.out.println("Hoy es: " + hoy) ;  //mostramos por consola la fecha de hoy (+hoy para mostrar LocalDate hoy)
        System.out.println("Dentro de 10 dias será: "+futuro); //mostramos por consola la fecha en 10 dias (+futuro para mostrar LocalDate en futuro)
        
    }
}