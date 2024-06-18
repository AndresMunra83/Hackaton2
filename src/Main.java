import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda();

    //Definir objetos contactos
    Contacto contacto1 = new Contacto("Alisson", "1111111111");
    Contacto contacto2 = new Contacto("karla", "222222222");
    Contacto contacto3 = new Contacto("edwars", "33333333");
    
    // Agregar contactos a la agenda
    agenda.agregarContacto(contacto1);
    agenda.agregarContacto(contacto2);
    agenda.agregarContacto(contacto3);
    
    // Intentar agregar un contacto que ya existe
    Contacto contacto4 = new Contacto("Andres", "222222222");
    agenda.agregarContacto(contacto4);
    
    // Mostrar los contactos en la agenda
    System.out.println("Contactos en la agenda:");
    for (Contacto contacto : agenda.getContactos()) {
      System.out.println(contacto.getNombre() + ": " + contacto.getNumero());
    }
  }
}
