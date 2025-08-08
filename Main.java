import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- Sistema de Gestión de Parqueadero ---");
            System.out.println("1. Registrar entrada de vehículo");
            System.out.println("2. Registrar salida de vehículo");
            System.out.println("3. Listar vehículos estacionados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la placa: ");
                        String placa = scanner.nextLine();
                        System.out.print("Ingrese la marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Ingrese el modelo: ");
                        String modelo = scanner.nextLine();

                        System.out.println("Seleccione el tipo de vehículo:");
                        System.out.println("  a) Automóvil");
                        System.out.println("  b) Motocicleta");
                        System.out.println("  c) Camión");
                        System.out.print("Opción: ");
                        String tipo = scanner.nextLine();

                        Vehiculo vehiculo = null;
                        switch (tipo.toLowerCase()) {
                            case "a":
                                System.out.print("Ingrese tipo de combustible: ");
                                String combustible = scanner.nextLine();
                                vehiculo = new Automovil(placa, marca, modelo, combustible);
                                break;
                            case "b":
                                System.out.print("Ingrese el cilindraje: ");
                                int cilindraje = Integer.parseInt(scanner.nextLine());
                                vehiculo = new Motocicleta(placa, marca, modelo, cilindraje);
                                break;
                            case "c":
                                System.out.print("Ingrese la capacidad de carga (toneladas): ");
                                double carga = Double.parseDouble(scanner.nextLine());
                                vehiculo = new Camion(placa, marca, modelo, carga);
                                break;
                            default:
                                System.out.println("Tipo de vehículo no válido.");
                                break;
                        }

                        if (vehiculo != null) {
                            parqueadero.registrarEntrada(vehiculo);
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese la placa del vehículo que sale: ");
                        String placaSalida = scanner.nextLine();
                        parqueadero.registrarSalida(placaSalida);
                        break;
                    case 3:
                        parqueadero.listarVehiculosEstacionados();
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la opción.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}