import java.util.Scanner;

public class ScannerCuentaAuto {
    // Atributos
    private String titular;
    private String numeroCuenta;
    private String tipoAuto;

    // Constructor
    public ScannerCuentaAuto(String titular, String numeroCuenta, String tipoAuto) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.tipoAuto = tipoAuto;
    }

    // Método para mostrar los datos de la cuenta
    public void mostrarDatosCuenta() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Auto: " + tipoAuto);
    }

    public static void main(String[] args) {
        // Utilizando Scanner para obtener datos del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el titular de la cuenta: ");
        String titular = scanner.nextLine();

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        System.out.print("Ingrese el tipo de auto: ");
        String tipoAuto = scanner.nextLine();

        // Creando una instancia de ScannerCuentaAuto con los datos ingresados
        ScannerCuentaAuto cuentaAuto = new ScannerCuentaAuto(titular, numeroCuenta, tipoAuto);

        // Mostrando los datos de la cuenta
        System.out.println("\nDatos de la Cuenta:");
        cuentaAuto.mostrarDatosCuenta();

        // Cerrando el scanner
        scanner.close();
    }
}