public class Main {
    public static void main(String[] args) {
        GestionNotificaciones gestor = new GestionNotificaciones();

        NotificacionCorreo correo = new NotificacionCorreo();
        correo.setEmail("usuario@ejemplo.com");
        correo.setMensaje("¡Hola! Este es un correo de prueba.");
        gestor.registrarYEnviar(correo);

        NotificacionSMS sms = new NotificacionSMS();
        sms.setTelefono("3001234567");
        sms.setMensaje("Este es un SMS de prueba.");
        gestor.registrarYEnviar(sms);

        System.out.println("\nTotal de notificaciones enviadas: " + gestor.getHistorial().size());
    }
}
