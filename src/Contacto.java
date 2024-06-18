//se declara la clase contacto que es publica por cual cual puede ser accedida desde otras clases, con los
// atributos privados (nombre y numero de telefono)siguiendo el principio de encapsulación, los cuales no pueden ser accedidos  directamente
// desde fuera de la clase.
public class Contacto {

    private String nombre;
    private String numero;
    //Se declara el metodo constructor que toma dos parametros (nombre y numero de telefono), posterior se le asigna a
    //los atributos de la instancia this.nombre y this.numero.
    public Contacto(String nombre, String numero){

        this.nombre = nombre;
        this.numero = numero;
    }

    // se declara los getters and setters, los cuales son públicos y devuelven los valores de los atributos "nombre" y "numero",
    // lo pual permiten acceder y modificar los atributos de la clase.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    // El metodo "toString" heredado de la clase object permite convertir los datos del objeto en una cadena de texto.
    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + numero + '\'' +
                '}';
    }
}


