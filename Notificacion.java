public abstract class Notificacion {
    private int codigo;
    private String destinatario;
    private String mensaje;

    // Getters y Setters
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public String getDestinatario() { return destinatario; }
    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    // Método que cada hijo debe implementar obligatoriamente
    public abstract void enviar();
}
