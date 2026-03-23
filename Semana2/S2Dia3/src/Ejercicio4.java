public class Ejercicio4 {
    String producto;
    double precio;

    public Ejercicio4(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }
    public void mostrarProducto(){
        System.out.println("Producto: " +producto);
        System.out.println("Costo: " +precio);
    }
}
