import javax.swing.*;

public class Ejercicio3 {

    //Ejercicio 3 ·
    // Metodo con retorno numérico BÁSICO
    //Crea un metodo calcularAreaRectangulo(double base, double altura)
    //que retorne el área calculada.
    //public static double calcularAreaRectangulo(double base, double altura)

    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));

        System.out.println("El area del Rectangulo es: " + calcularAreaRectangulo(base, altura));
    }

    public static double calcularAreaRectangulo(double base, double altura){
        double area = base*altura;
        return area;
    }

}
