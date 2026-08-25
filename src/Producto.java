import java.util.ArrayList;

//Ejercicio 10 · Reto integrador: mini inventario RETO FINAL
//Diseña un sistema simple de inventario usando una clase Producto (con atributos nombre, precio y cantidad) y una lista
//ArrayList<Producto> . Debe incluir al menos:
//agregarProducto(...) — decide tú si debe ser static o de instancia, según cómo estructures la clase principal
//calcularValorTotalInventario(ArrayList<Producto> productos) — retorna double
//mostrarInventario(ArrayList<Producto> productos) — void, imprime todo formateado
//Este ejercicio obliga a decidir conscientemente cuándo usar static y cuándo no, combinando todos los conceptos vistos en
//el taller.
//ArrayList clases static vs instancia integrador

public class Producto {

    String nombre;
    double precio;
    int cantidad;

    static ArrayList<Producto> productos = new ArrayList<>();

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public static void agregarProducto(String nombre, double precio, int cantidad) {

        Producto producto = new Producto(nombre, precio, cantidad);
        productos.add(producto);
    }

    public static double calcularValorTotalInventario() {

        double total = 0;

        for (Producto producto : productos) {
            total = total + producto.precio * producto.cantidad;
        }

        return total;
    }

    public static void mostrarInventario() {

        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.nombre);
            System.out.println("Precio: " + producto.precio);
            System.out.println("Cantidad: " + producto.cantidad);
        }

        System.out.println("Total: " + calcularValorTotalInventario());
    }

    public static void main(String[] args) {

        agregarProducto("Arroz", 5000, 10);
        agregarProducto("Leche", 4000, 5);
        agregarProducto("Pan", 3000, 8);

        mostrarInventario();
    }
}
