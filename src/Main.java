import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Se crea un objeto llamado Agenda que gestionará los contactos.
    Agenda agenda = new Agenda();
    boolean salir = false; //Se inicializa una variable booleana que controla el bucle del MENU

    //Menú para el usuario, Se usa un WHITE el cual terminará una vez el usuario seleccione la opción 9

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

      switch (opcion) {   //Se inicia el SWICH de los casos

        //Agregar un contacto, lee el nombre y el numero, los cuales almacena en un
        // nuevoContacto para finalmente agregarlo a la agenda
      case 1:
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número del contacto: ");
        String numero = scanner.nextLine();
        Contacto nuevoContacto = new Contacto(nombre, numero);
        agenda.agregarContacto(nuevoContacto);
        break;

        //Validar un contacto
        //linea 48: Se crea un objeto contacto
        //linea 49: verifica si el contacto ya existe en la agenda
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

     //Buscar un contacto, compueba que el contacto si esta en la agenda, de lo
        // contrario sale del if e imprime que el contacto no fue encontrado
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

        //Eliminar un contacto elimina el contacto de la agenda, teniendo en cuenta la variable del nombre
      case 5:
        System.out.println("Ingrese el nombre del contacto a eliminar:");
        nombre = scanner.nextLine();
        agenda.eliminarContacto(nombre);
        break;

        //Comprobar agenda llena/vacia comprueba si la agenda esta llena, teniendo en cuenta el el numero
        // predeterminado de espacios dispuestos en la clase Agenda
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

        //importar contactos, se crea una lista predeterminada de contactos de emergencia,
        // con el fin de importar los contactos.
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
