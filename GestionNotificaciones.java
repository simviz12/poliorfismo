import java.util.ArrayList;
import java.util.List;

public class GestionNotificaciones {
    private List<Notificacion> historial = new ArrayList<>();

    public void registrarYEnviar(Notificacion n) {
        n.enviar();
        historial.add(n);
    }

    public List<Notificacion> getHistorial() {
        return historial;
    }
}
