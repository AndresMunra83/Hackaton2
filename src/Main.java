import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda();
    boolean salir = false;

    //Definir objetos contactos

    Contacto contacto1 = new Contacto("Alisson", "1111111111");
    Contacto contacto2 = new Contacto("karla", "222222222");
    Contacto contacto3 = new Contacto("edwars", "33333333");

    //Menú para el usuario

//    while (!salir) {
//      System.out.println("Seleccione una opción:");
//      System.out.println("1. Añadir un contacto");
//      System.out.println("2. Validar si el contacto esta dentro de la lista");
//      System.out.println("3. Mostrar o Listar todos los contactos");
//      System.out.println("4. Buscar un contacto");
//      System.out.println("5. Eliminar un contacto");
//      System.out.println("6. Verificar la agenda");
//      System.out.println("7. Verificar cuantos espacios libres quedan");
//      System.out.println("8. Importar Contactos de emergencia");
//      System.out.println("9. Salir");
//      int opcion = scanner.nextInt();
//      scanner.nextLine();
//
//      switch (opcion) {
//
//        //Agregar un contacto
//      case 1:
//        System.out.println("Ingrese nombre:");
//        String nombre = scanner.nextLine();
//        System.out.println("Ingrese teléfono:");
//        String numero = scanner.nextLine();
//        agenda.agregarContacto(nombre,numero);
//        break;
//
//        //Validar un contacto
//      case 2:
//        System.out.println("Ingrese nombre del contacto a verificar:");
//        nombre = scanner.nextLine();
//        if (agenda.existeContacto(nombre)) {
//          System.out.println("El contacto si existe dentro de la lista.");
//        } else {
//          System.out.println("El contacto no existe dentro de la lista.");
//        }
//        break;
//
//        //Mostrar o listar los contacto
//      case 3:
//        agenda.listarContactos();
//        break;
//
//     //Buscar un contacto
//      case 4:
//        System.out.println("Ingrese el nombre del contacto a buscar:");
//        nombre = scanner.nextLine();
//        Contacto contacto = agenda.buscarContacto(nombre);
//        if (contacto != null) {
//          System.out.println("Contacto encontrado: " + contacto);
//        } else {
//          System.out.println("Contacto no encontrado.");
//        }
//        break;
//
//        //Eliminar un contacto
//      case 5:
//        System.out.println("Ingrese el nombre del contacto a eliminar:");
//        nombre = scanner.nextLine();
//        agenda.eliminarContacto(nombre);
//        break;
//
//        //Comprobar agenda llena/vacia
//      case 6:
//        if (agenda.comprobarAgenda()) {
//          System.out.println("La agenda esta llena.");
//        } else {
//          System.out.println("La agenda está vacía.");
//        }
//        break;
//
//        //Numero de espacios disponibles dentro de la agenda
//      case 7:
//        System.out.println("El número de espacios libres en la agenda: " + agenda.espaciosLibres());
//        break;
//
//        //importar contactos
//      case 8:
//        System.out.println("los contactos de emergencia han sido importados" + agenda.importarContactos);
//        break;
//
//        //salir
//      case 9:
//        salir = true;
//        break;
//
//      default:
//        System.out.println("Ingrese una opción válida.");
//        break;
//    }
//  }
//
//        scanner.close();
}
}
