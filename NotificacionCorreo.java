public class NotificacionCorreo extends Notificacion {
    private String email;

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    @Override
    public void enviar() {
        System.out.println("Enviando Correo a: " + email + " | Mensaje: " + getMensaje());
    }
}
