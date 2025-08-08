public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int cilindraje) {
        super(placa, marca, modelo);
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return String.format("Motocicleta [%s, Cilindraje: %dcc]", super.toString(), cilindraje);
    }
}