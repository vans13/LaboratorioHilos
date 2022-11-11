/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author adm
 *//* Clase que define las características de un objeto 
 * que denominaremos Hilo e imprime el nombre y tiempo de espera
 */

public class Hilos extends Thread {

    private String nombre;
    private int retardo;

    // Constructor para inicializar el nombre del hilo y tiempo de retardo
    public Hilos(String s, int d) {
        nombre = s;
        retardo = d;
    }

    // El metodo run() ejecuta
    // threads. Cuando run() termina el thread muere
    public void run() {

        // Con el método sleep retrasamos la ejecución el tiempo especificado
        try {
            sleep(retardo);
        } catch (InterruptedException e) {
        }

        // Imprimimos el nombre y tiempo que hemos retardado el hilo
        System.out.println("Prueba Hilos: " + nombre + " " + retardo);
    }
}
