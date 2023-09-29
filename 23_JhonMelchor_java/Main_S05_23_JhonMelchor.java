
package S05_23;

import java.util.Scanner;


public class Main_S05_23 {

    public static void main(String[] args) {
        
        estudiante_23JhonMelchor estudiante = new estudiante_18();
        estudiante.preguntar();
        estudiante.mostrarInformacion();
        estudiante.emitirSonido();
        estudiante.mover();

       
        libro_23JhonMelchor libro = new libro_18();
        libro.preguntar();
        libro.mostrarInformacion();
        
         

        cuenta_bancaria_23jhonmelchor cuenta = new cuenta_bancaria_18();
        cuenta.preguntar();
        cuenta.mostrarInformacion();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto a depositar: $");
        double montoDeposito = scanner.nextDouble();
        cuenta.realizarDeposito(montoDeposito);
        cuenta.mostrarInformacion();

        System.out.print("Ingrese el monto a retirar: $");
        double montoRetiro = scanner.nextDouble();
        cuenta.realizarRetiro(montoRetiro);
        cuenta.mostrarInformacion();
        
        
        auto_23JhonMelchor auto = new auto_18();
        auto.preguntar();
        auto.mostrarInformacion();
    }
}
