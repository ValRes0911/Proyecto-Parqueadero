public class Automovil extends Vehiculo {
    private String tipoCombustible;

    public Automovil(String placa, String marca, String modelo, String tipoCombustible) {
        super(placa, marca, modelo); // Llama al constructor de la clase base
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return String.format("Automóvil [%s, Combustible: %s]", super.toString(), tipoCombustible);
    }
}