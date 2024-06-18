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
