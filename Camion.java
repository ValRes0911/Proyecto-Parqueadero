public class Camion extends Vehiculo {
    private double capacidadCarga; // En toneladas

    public Camion(String placa, String marca, String modelo, double capacidadCarga) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return String.format("Camión [%s, Carga: %.2f Toneladas]", super.toString(), capacidadCarga);
    }
}