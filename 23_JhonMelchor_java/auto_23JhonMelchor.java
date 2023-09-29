
package S05_23;

import java.util.Scanner;


public class auto_23 {

    String marca;
    String modelo;
    int año;
    String color;
    String numeroBastidor;
    String motor;
    String transmision;
    String combustible;
    int capacidad;

    public void mostrarInformacion() {
        String informacion = "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Año: " + año + "\n"
                + "Color: " + color + "\n"
                + "Número de Bastidor: " + numeroBastidor + "\n"
                + "Motor: " + motor + "\n"
                + "Transmisión: " + transmision + "\n"
                + "Combustible: " + combustible + "\n"
                + "Capacidad: " + capacidad + " personas/carga";

        System.out.println(informacion);
    }

    public void preguntar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca del automóvil: ");
        marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del automóvil: ");
        modelo = scanner.nextLine();

        System.out.print("Ingrese el año de fabricación del automóvil: ");
        año = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Ingrese el color del automóvil: ");
        color = scanner.nextLine();

        System.out.print("Ingrese el número de bastidor del automóvil: ");
        numeroBastidor = scanner.nextLine();

        System.out.print("Ingrese el tipo y la potencia del motor del automóvil: ");
        motor = scanner.nextLine();

        System.out.print("Ingrese el tipo de transmisión del automóvil: ");
        transmision = scanner.nextLine();

        System.out.print("Ingrese el tipo de combustible que utiliza el automóvil: ");
        combustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad de personas/carga del automóvil: ");
        capacidad = scanner.nextInt();
    }

  
}
