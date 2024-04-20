import ElectroMart.Electronicos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static ArrayList<Electronicos> listaDeElectronicos = new ArrayList<Electronicos>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner ns = new Scanner(System.in);
        int opcion;
        while (true) {
            try {
                imprimirMenu();
                opcion = ns.nextInt();
                ns.nextLine();

                if (opcion == 0) {
                    System.out.println("\nHasta pronto...");
                    break;
                }

                switch (opcion) {
                    case 1:
                        agregarElectronico();
                        break;
                    case 2:
                        consultarElectronico();
                        break;
                    case 3:
                        mostrarListaElectronicos();
                        break;
                    default:
                        System.out.println("\nPor favor eliga una opción del menú\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor ingrese un dato valido\n");
                ns.nextLine();
            }
        }
    }

    private static void consultarElectronico() {
    }

    private static void mostrarListaElectronicos() {
    }


    private static void agregarElectronico() {
        Scanner ns = new Scanner(System.in);
        String nombre;
        String modelo;
        String descripcion;
        float precio;

        System.out.println("Ingrese el nombre del aparato electronico:");
        nombre = ns.nextLine();
        System.out.println("Ingrese el modelo del aparato electronico:");
        modelo = ns.nextLine();
        System.out.println("Ingrese la descripción del apárato electronico:");
        descripcion = ns.nextLine();
        System.out.println("Ingrese el precio del aparato electronico:");
        precio = ns.nextFloat();

        Electronicos electronicos = new Electronicos();
        System.out.println("\nElectronico agregado exitosamente...\n");
    }

    private static void imprimirMenu() {
        System.out.println("Seleccione una opcion:\n" + "\t1. Agregar un aparato electronico\n" + "\t2. Consultar aparato electronico\n" + "\t3. Mostrar todos los aparatos electronicos\n" + "\t0. Salir"
        );
        System.out.print("Opcion: ");
    }

    }
}

