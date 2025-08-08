import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Parqueadero {
    private List<Vehiculo> vehiculosEstacionados;
    // Tarifas por hora
    private static final double TARIFA_AUTOMOVIL = 2000;
    private static final double TARIFA_MOTOCICLETA = 1000;
    private static final double TARIFA_CAMION = 3000;

    public Parqueadero() {
        this.vehiculosEstacionados = new ArrayList<>();
    }

    public void registrarEntrada(Vehiculo vehiculo) {
        // Verificar si ya existe un vehículo con la misma placa
        boolean yaExiste = vehiculosEstacionados.stream()
                .anyMatch(