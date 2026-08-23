import javax.swing.*;

public class Ejercicio5 {

    //Ejercicio 5 ·
    // Sobrecarga de métodos INTERMEDIO
    //Crea dos versiones de calcularPromedio : una que reciba
    // dos notas individuales y otra que reciba un arreglo completo de
    //notas. Ambas deben retornar double .
    //public static double calcularPromedio(double nota1, double nota2)
    //public static double calcularPromedio(double[] notas)

    public static void main(String[] args) {

        //promedio notas individuales

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota 1:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota 2:"));

        System.out.println("Promedio: " + calcularPromedio(nota1, nota2));

        //arreglo

        double[] notas = {nota1, nota2, 4.5, 3.8};

        System.out.println("Promedio arreglo: " + calcularPromedio(notas));
    }
    public static double calcularPromedio(double nota1, double nota2){

        return  (nota1 + nota2) / 2;

    }
    public static double calcularPromedio(double[] notas) {

        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        return total / notas.length;
    }

}