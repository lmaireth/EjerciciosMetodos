public class Ejercicio7 {

    //Ejercicio 7 ·
    // Metodo con arreglo como parámetro INTERMEDIO
    //Crea un metodo calcularPromedioClase(double[] calificaciones)
    // que recorra el arreglo recibido y retorne el promedio
    //general del grupo.
    //public static double calcularPromedioClase(double[] calificaciones)

    public static void main(String[] args) {

        double calificaciones [] = {4.0, 3.0, 5.0, 4.5, 2.0};

        double promedio = calcularPromedioClase(calificaciones);

        System.out.println("Promedio de las clase es: " + promedio);

    }
    public static double calcularPromedioClase(double[] calificaciones){

        double suma = 0;
        for(int i = 0; i < calificaciones.length; i++){
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;

    }
}