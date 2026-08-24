public class Estudiante {

    //Ejercicio 6 ·
    // Static vs. instancia INTERMEDIO
    //Crea una clase Estudiante con un atributo nota .
    // Agrega un metodo de instancia mostrarBoletin() que use this.nota
    //para imprimir el resultado del propio estudiante, y un
    // metodo static compararNotas(double n1, double n2) que no dependa
    //de ningún objeto, solo compare dos valores recibidos como parámetro.
    //Explica por escrito por qué uno debe ser static y el otro no.
    //public void mostrarBoletin() // de instancia
    //public static double compararNotas(double n1, double n2)

    double nota;

        public void mostrarBoletin(){
            System.out.println("Nota" + this.nota);
        }
        public static double compararNotas(double n1, double n2){

            if (n1>n2){
                return n1;
            }else{
                return n2;
            }
        }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nota = 4.5;
        estudiante1.mostrarBoletin();

        double mayor = compararNotas(4.5 , 4.0);

        System.out.println("La nota mayor es: " + mayor);

    }
}
//public void mostrarBoletin() no debe ser static porque utiliza this.nota
//que pertenece a cada objeto (estudiante) y guarda la nota de cada uno de ellos
//mientras que compararNotas(double n1, double n2) utiliza parametro para comparar
// que nota es mayor y no necesita un objeto o utiliza this.nota