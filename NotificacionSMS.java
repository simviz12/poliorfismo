public class NotificacionSMS extends Notificacion {
    private String telefono;

    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getTelefono() { return telefono; }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al: " + telefono + " | Mensaje: " + getMensaje());
    }
}
