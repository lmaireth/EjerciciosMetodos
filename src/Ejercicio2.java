import javax.swing.*;

public class Ejercicio2 {

    //Ejercicio 2 ·
    // Metodo void con parámetros BÁSICO
    //Crea un metodo saludarEstudiante(String nombre, int edad)
    // que imprima un saludo personalizado usando ambos datos.
    //public static void saludarEstudiante(String nombre, int edad)

    public static void main(String[] args) {
        saludarEstudiante("Leidy Maireth", 18);
    }
    public static void saludarEstudiante (String nombre, int edad){
        System.out.println("Nombre del estudiante : " + nombre + "\n" + "Edad: " + edad );
    }

}