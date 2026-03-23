/*Encapsulación (private, getters y setters)
 La encapsulación significa proteger los
 datos de una clase para que no se modifiquen directamente.
 Un getter sirve para obtener el valor de una variable.
 Un setter sirve para modificar el valor de una variable. */

public class Tema1 {
    private String nombre;
    private int edad;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
