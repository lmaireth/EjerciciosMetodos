import javax.swing.*;

public class Ejercicio4 {

    //Ejercicio 4 ·
    // Metodo con retorno booleano BÁSICO
    //Crea un metodo esPar(int numero) que retorne
    // true si el número es par, o false si no lo es.
    //public static boolean esPar(int numero)

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));

        System.out.println("Es Par: " + esPar(numero));
    }

    public static boolean esPar(int numero){

        if (numero % 2 == 0){
            return true;
        }else {
            return false;
        }

    }

}
