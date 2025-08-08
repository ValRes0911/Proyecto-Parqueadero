import java.time.LocalDateTime;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected LocalDateTime horaEntrada;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horaEntrada = LocalDateTime.now(); // Se asigna la hora actual al crear el objeto
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    @Override
    public String toString() {
        return String.format("Placa: %s, Marca: %s, Modelo: %s", placa, marca, modelo);
    }
}