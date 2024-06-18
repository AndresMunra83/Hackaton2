import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contacto> contactos;

    // constructor para el array list

    public Agenda (){
        this.contactos = new ArrayList<>();
    }
    // se crea metodo añadir contacto
    public void agregarContacto(int id, String nombre, String numero){
        Contacto nuevoContacto = new Contacto( id,nombre,numero);
        contactos.add(nuevoContacto);
        System.out.println("El contacto ha sido creado exitosamente: " + nuevoContacto);
    }

    public void agregarContacto(Contacto contacto1) {
    }
}
