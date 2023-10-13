//Nicolás Concuá
//Universidad del valle de Guatemala
//Carnet: 23197
//Fecha de entrega: 12/10/2023
//Ejercicio de herencia con polimorfismo
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        String opcion = "";
        String registro = "";
        Biblioteca biblioteca = new Biblioteca();
        int librosEnBiblioteca = biblioteca.contarLibros();
        int revistasEnBiblioteca = biblioteca.contarRevistas();
        int articulosEnBiblioteca = biblioteca.contarArticulos();
        ArrayList<Cliente> listaClientes = new ArrayList<>();


        // Crear y agregar libros a la biblioteca
        Libro libro1 = new Libro(1, "El Principito", "Ficción", 5, Documento.Estado.DISPONIBLE, "Antoine de Saint-Exupéry", "Editorial A");
        Libro libro2 = new Libro(2, "Cien Años de Soledad", "Ficción", 3, Documento.Estado.DISPONIBLE, "Gabriel García Márquez", "Editorial B");

        // Crear y agregar revistas a la biblioteca
        Revista revista1 = new Revista(3, "National Geographic", "Ciencia", 10, Documento.Estado.DISPONIBLE, 2023, 5);
        Revista revista2 = new Revista(4, "Time", "Actualidad", 8, Documento.Estado.DISPONIBLE, 2023, 9);

        // Crear y agregar artículos a la biblioteca
        Articulo articulo1 = new Articulo(5, "El Cambio Climático", "Ciencia", 15, Documento.Estado.DISPONIBLE, "Artículo sobre el cambio climático.", LocalDate.now());
        Articulo articulo2 = new Articulo(6, "Inteligencia Artificial", "Tecnología", 12, Documento.Estado.DISPONIBLE, "Artículo sobre inteligencia artificial.", LocalDate.now());

        // Agregar los objetos a la biblioteca
        biblioteca.agregarDocumento(libro1);
        biblioteca.agregarDocumento(libro2);
        biblioteca.agregarDocumento(revista1);
        biblioteca.agregarDocumento(revista2);
        biblioteca.agregarDocumento(articulo1);
        biblioteca.agregarDocumento(articulo2);
        
        while (go){
            printMenu();
            opcion = sc.nextLine();
            System.out.println("");

            switch (opcion){
                case "7":
                    System.out.println("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese su carnet: ");
                    int carnet = sc.nextInt();
                    System.out.println("Ingrese cuantos prestamos ha realizado: ");
                    int limitePrestamos = sc.nextInt();
                    Cliente cliente = new Cliente(carnet, nombre, limitePrestamos);
                    listaClientes.add(cliente);
                    System.out.println("Cliente agregado con exito");
                    break;
                case "1":
                    System.out.println("Ingrese el tipo de documento que desea agregar: ");
                    System.out.println("1. Libro");
                    System.out.println("2. Revista");
                    System.out.println("3. Articulo");
                    System.out.println("4. Regresar al menu principal");
                    System.out.println("\nIngrese el numero de la opcion que desea realizar: ");
                    int opcion2 = sc.nextInt();
                    System.out.println("");
                    if (opcion2==1){
                        System.out.println("Ingrese el id del libro: ");
                        int id = sc.nextInt();
                        System.out.println("Ingrese el titulo del libro: ");
                        String titulo = sc.nextLine();
                        System.out.println("Ingrese la materia del libro: ");
                        String materia = sc.nextLine();
                        System.out.println("Ingrese la cantidad de ejemplares del libro: ");
                        int cantidadEjemplares = sc.nextInt();
                        System.out.println("Ingrese el estado del libro: ");
                        String estado = sc.nextLine();
                        System.out.println("Ingrese el autor del libro: ");
                        String autor = sc.nextLine();
                        System.out.println("Ingrese la editorial del libro: ");
                        String editorial = sc.nextLine();
                        Libro libro = new Libro(id, titulo, materia, cantidadEjemplares, Documento.Estado.valueOf(estado), autor, editorial);
                        biblioteca.agregarDocumento(libro);
                        System.out.println("Libro agregado con exito");
                    }
                    else if (opcion2==2){
                        System.out.println("Ingrese el id de la revista: ");
                        int id = sc.nextInt();
                        System.out.println("Ingrese el titulo de la revista: ");
                        String titulo = sc.nextLine();
                        System.out.println("Ingrese la materia de la revista: ");
                        String materia = sc.nextLine();
                        System.out.println("Ingrese la cantidad de ejemplares de la revista: ");
                        int cantidadEjemplares = sc.nextInt();
                        System.out.println("Ingrese el estado de la revista: ");
                        String estado = sc.nextLine();
                        System.out.println("Ingrese el año de la revista: ");
                        int anio = sc.nextInt();
                        System.out.println("Ingrese el numero de la revista: ");
                        int numero = sc.nextInt();
                        Revista revista = new Revista(id, titulo, materia, cantidadEjemplares, Documento.Estado.valueOf(estado), anio, numero);
                        biblioteca.agregarDocumento(revista);
                        System.out.println("Revista agregada con exito");
                    }
                    else if (opcion2==3){
                        System.out.println("Ingrese el id del articulo: ");
                        int id = sc.nextInt();
                        System.out.println("Ingrese el titulo del articulo: ");
                        String titulo = sc.nextLine();
                        System.out.println("Ingrese la materia del articulo: ");
                        String materia = sc.nextLine();
                        System.out.println("Ingrese la cantidad de ejemplares del articulo: ");
                        int cantidadEjemplares = sc.nextInt();
                        System.out.println("Ingrese el estado del articulo: ");
                        String estado = sc.nextLine();
                        System.out.println("Ingrese la descripcion del articulo: ");
                        String descripcion = sc.nextLine();
                        System.out.println("Ingrese la fecha de publicacion del articulo: ");
                        String fecha = sc.nextLine();
                        Articulo articulo = new Articulo(id, titulo, materia, cantidadEjemplares, Documento.Estado.valueOf(estado), descripcion, LocalDate.parse(fecha));
                        biblioteca.agregarDocumento(articulo);
                        System.out.println("Articulo agregado con exito");
                    }
                    else if (opcion2==4){
                        break;
                    }
                    else{
                        System.out.println("Opcion invalida");
                    }
                case "2":
                    System.out.println("Ingrese el id del documento que desea devolver: ");
                    int id = sc.nextInt();
                    biblioteca.devolverDocumento(id);
                    break;
                case "3":              
                System.out.println("Libros en la biblioteca: " + librosEnBiblioteca);
                System.out.println("Revistas en la biblioteca: " + revistasEnBiblioteca);
                System.out.println("Artículos en la biblioteca: " + articulosEnBiblioteca);
                break;
                case "4":
                ArrayList<Libro> libros = biblioteca.obtenerLibros();
                if (libros.isEmpty()) {
                    System.out.println("No hay libros en la biblioteca.");
                } else {
                    System.out.println("Información de los libros en la biblioteca:");
                    for (Libro libro : libros) {
                        System.out.println("Título: " + libro.getTitulo());
                        System.out.println("Autor: " + libro.getAutor());
                        System.out.println("Materia: " + libro.getMateria());
                        System.out.println();
                    }
                }
                break;
                case "5":
            
                case "6":
                    System.out.println("Gracias por usar la biblioteca UVG");
                    go = false;
                    break;
                }
            }


    }
    public static void printMenu(){
        System.out.println("Bienvenido a las opciones de la biblioteca UVG");
        System.out.println("7. Porfavor presione el el numero 7 para regustrarse en la biblioteca y luego usar las diferentes opciones ");
        System.out.println("1. Agregar un documento");
        System.out.println("2. Devolver el tutulo de una publicacion cualquiera, dado su id");
        System.out.println("3. Calcular la cantidad de documentos de las materias");
        System.out.println("4. Mostrar la información (título, autor, materia) de todos los libros que posee la biblioteca.");
        System.out.println("5. Pedir un documento, libro, articulo o revista prestado");
        System.out.println("6. salir");
        System.out.println("\nIngrese el numero de la opcion que desea realizar: ");
    }
}