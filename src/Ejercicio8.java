import javax.swing.*;

public class Ejercicio8 {

    //Ejercicio 8 ·
    //Metodo que retorna un arreglo INTERMEDIO
    //Crea un metodo generarTablaMultiplicar(int numero)
    //que retorne un arreglo de enteros con los resultados de la tabla de
    //multiplicar del 1 al 10.
    //public static int[] generarTablaMultiplicar(int numero)

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para generar tabla"));

        int[] tabla = generarTablaMultiplicar(numero);

    }
    public static int[] generarTablaMultiplicar(int numero){
        int[] tabla = new int[10];

        for(int i = 1; i <= 10; i++){
            tabla[i-1] = numero * i;
            System.out.println(numero + "x" + i + "=" + tabla[i-1]);
        }
        return tabla;

    }

}
