public class NotificacionSMS extends Notificacion {
    private String telefono; // Usamos String por seguridad con los ceros iniciales

    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getTelefono() { return telefono; }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al: " + telefono + " | Mensaje: " + getMensaje());
    }
}
