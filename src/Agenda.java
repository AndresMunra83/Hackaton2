import java.util.ArrayList;
import java.util.List;

public class Agenda {
    // Atributos de clase Agenda
    private List<Contacto> contactos; // Lista para almacenar los contactos
    private int cantidad; // Capacidad máxima de la agenda

    // Constructor de Clase Agenda con capacidad especificada
    public Agenda(int cantidad) {
        this.contactos = new ArrayList<>();
        this.cantidad = cantidad;
    }

    // Constructor de Clase Agenda con capacidad por defecto
    public Agenda() {
        this(10);
    }

    // Método para agregar un nuevo contacto
    public void agregarContacto(Contacto nuevoContacto) {
        // Verifica si la agenda está llena
        if (comprobarAgenda()) {
            System.out.println("No se puede agregar el contacto. La agenda está llena.");
            return;
        }
        
        // Verifica si ya existe un contacto con el mismo nombre y número
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nuevoContacto.getNombre())
                    && contacto.getNumero().equals(nuevoContacto.getNumero())) {
                System.out.println("No se puede agregar el contacto. Ya existe un contacto con ese nombre y número.");
                return;
            }
        }
        
        // Agrega el contacto si no hay duplicados y la agenda no está llena
        contactos.add(nuevoContacto);
        System.out.println("Contacto agregado correctamente: " + nuevoContacto.getNombre());
    }

    // Método para verificar si un contacto existe
    public boolean existeContacto(Contacto c) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(c.getNombre())) {
                return true;
            }
        }
        return false;
    }

    // Método para listar todos los contactos de la agenda
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        for (Contacto contacto : contactos) {
            System.out.println(contacto.getNombre() + ": " + contacto.getNumero());
        }
    }

    // Método para buscar un contacto por nombre
    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    // Método para eliminar contacto de el array contactos
    public void eliminarContacto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(i);
                System.out.println("El contacto fue eliminado con éxito.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El contacto no fue encontrado.");
        }
    }

    // Método para verificar la disponibilidad de la agenda
    public boolean comprobarAgenda() {
        return contactos.size() == cantidad;
    }

    // Método para verificar la cantidad de espacios disponibles en la agenda
    public int espaciosLibres() {
        return cantidad - contactos.size();
    }

    // Método para importar contactos de emergencia predefinidos
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

    // Método getter para obtener la lista de contactos
    public List<Contacto> getContactos() {
        return contactos; 
    }
}
