public class Constructor2 {
    String nombre;
    double precio;

    public Constructor2(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public void mostrarProducto(){
        System.out.println("Producto: "+nombre);
        System.out.println("Precio: "+precio);
    }
}
