import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda();

    //Definir objetos contactos
    Contacto contacto1 = new Contacto(1, "Alisson", "1111111111");
    Contacto contacto2 = new Contacto(2,"karla","222222222");
    Contacto contacto3 = new Contacto(3,"edwars","33333333");

    agenda.agregarContacto(contacto1);
  }
}