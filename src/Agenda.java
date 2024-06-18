import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private int cantidad;

    public Agenda(int cantidad) {
        this.contactos = new ArrayList<>();
        this.cantidad = cantidad;
    }

    public Agenda() {
        this(10);
    }
    
    public void agregarContacto(Contacto nuevoContacto) {
        if (comprobarAgenda()) {
            System.out.println("No se puede agregar el contacto. La agenda está llena.");
            return;
        }
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nuevoContacto.getNombre()) && contacto.getNumero().equals(nuevoContacto.getNumero())) {
                System.out.println("No se puede agregar el contacto. Ya existe un contacto con ese nombre y número.");
                return;
            }
        }
        contactos.add(nuevoContacto);
        System.out.println("Contacto agregado correctamente: " + nuevoContacto.getNombre());
    }
    
    public boolean existeContacto(Contacto c) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(c.getNombre())) {
                return true;
            }
        }
        return false;
    }
    
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        for (Contacto contacto : contactos) {
            System.out.println(contacto.getNombre() + ": " + contacto.getNumero());
        }
    }
    
    public void buscaContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println(nombre + ": " + contacto.getNumero());
                return;
            }
        }
        System.out.println("No se encontró el contacto con nombre: " + nombre);
    }
    
    public void importarContactos() {
        Contacto[] contactosEmergencia = {
                new Contacto("Línea de emergencia", "123"),
                new Contacto("Policía Nacional", "112"),
                new Contacto("Policía de Tránsito", "127"),
                new Contacto("Bomberos", "119"),
                new Contacto("Cruz Roja", "132"),
                new Contacto("Servicio de Ambulancias", "125"),
        };
        
        for (Contacto contacto : contactosEmergencia) {
            agregarContacto(contacto);
        }
    }
    
    public List<Contacto> getContactos() {
        return contactos;
    }
    // metodo para eliminar contacto de el array contactos

    public void eliminarContacto(String nombre){
        for(int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)){
                contactos.remove(i);
                System.out.println("el contacto fue eliminado con éxito " + contactos.get(i));
            }else{
                System.out.println("el contacto no fue encontrado");
            }
        }
    }

    public boolean comprobarAgenda(){
        return contactos.size() == cantidad;

    }

    public int espaciosLibres(){
        return cantidad - contactos.size();

    }

}
