import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda();
    boolean salir = false;

    //Menú para el usuario

    while (!salir) {
      System.out.println("\n ________________________________________________________________________\n");
      System.out.println("Seleccione una opción:\n");
      System.out.println("1. Añadir un contacto");
      System.out.println("2. Validar si el contacto esta dentro de la lista");
      System.out.println("3. Mostrar o Listar todos los contactos");
      System.out.println("4. Buscar un contacto");
      System.out.println("5. Eliminar un contacto");
      System.out.println("6. Verificar la agenda");
      System.out.println("7. Verificar cuantos espacios libres quedan");
      System.out.println("8. Importar Contactos de emergencia");
      System.out.println("9. Salir");
      System.out.println("\n ________________________________________________________________________\n");
      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {

        //Agregar un contacto
      case 1:
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número del contacto: ");
        String numero = scanner.nextLine();
        Contacto nuevoContacto = new Contacto(nombre, numero);
        agenda.agregarContacto(nuevoContacto);
        break;

        //Validar un contacto
      case 2:
        System.out.print("Ingrese el nombre del contacto a verificar: ");
        String nombreVerificar = scanner.nextLine();
        Contacto contactoVerificar = new Contacto(nombreVerificar, "");
        boolean existe = agenda.existeContacto(contactoVerificar);
        System.out.println("El contacto " + (existe ? "existe" : "no existe") + " en la agenda.");
        break;

        //Mostrar o listar los contacto
      case 3:
        agenda.listarContactos();
        break;

     //Buscar un contacto
      case 4:
        System.out.println("Ingrese el nombre del contacto a buscar:");
        nombre = scanner.nextLine();
        Contacto contacto = agenda.buscarContacto(nombre);
        if (contacto != null) {
          System.out.println("Contacto encontrado: " + contacto);
        } else {
          System.out.println("Contacto no encontrado.");
        }
        break;

        //Eliminar un contacto
      case 5:
        System.out.println("Ingrese el nombre del contacto a eliminar:");
        nombre = scanner.nextLine();
        agenda.eliminarContacto(nombre);
        break;

        //Comprobar agenda llena/vacia
      case 6:
        if (agenda.comprobarAgenda()) {
          System.out.println("No quedan más espacios disponibles.");
        } else {
          System.out.println("Aun nos quedan espacios disponibles en la agenda.");
        }
        break;

        //Numero de espacios disponibles dentro de la agenda
      case 7:
        System.out.println("El número de espacios libres en la agenda: " + agenda.espaciosLibres());
        break;

        //importar contactos
        case 8:
          agenda.importarContactos();
          System.out.println("\nLos contactos de emergencia han sido importados");
          break;

        //salir
      case 9:
        salir = true;
        break;

      default:
        System.out.println("Ingrese una opción válida.");
        break;
    }
  }

        scanner.close();
}
}
