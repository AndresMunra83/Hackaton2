import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    
    public Agenda() {
        this.contactos = new ArrayList<>();
    }
    
    public void agregarContacto(Contacto nuevoContacto) {
        // Verificar si el contacto ya existe por nombre
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nuevoContacto.getNombre()) && contacto.getNumero().equals(nuevoContacto.getNumero()) ) {
                System.out.println("No se puede agregar el contacto. Ya existe un contacto con ese nombre.");
                return;
            }
        }
        
        // Si no existe, añadir el contacto a la lista
        contactos.add(nuevoContacto);
        System.out.println("Contacto agregado correctamente: " + nuevoContacto.getNombre());
    }
    
    public List<Contacto> getContactos() {
        return contactos;
    }
}
