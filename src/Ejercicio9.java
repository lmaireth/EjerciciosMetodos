import javax.swing.*;

public class Ejercicio9 {

    //Ejercicio 9 ·
    // Lógica condicional interna AVANZADO
    //Crea un metodo clasificarNota(double nota) que retorne
    //un String : "Reprobado" , "Aprobado" o "Excelente" , según
    //rangos que definas tú mismo.
    //public static String clasificarNota(double nota)

    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su nota: "));

        System.out.println("Nota: " + clasificarNota(nota));

    }
    public static String clasificarNota(double nota){

        if(nota < 3.0){
            return "Reprovado";
        }else if(nota <= 4.5){
            return "Aprovado";
        }else{
            return "Excelente";
        }

    }
}
