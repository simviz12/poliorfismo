package com.universidad.main;

import com.universidad.model.Estudiante;
import com.universidad.notifications.Notificacion;
import com.universidad.notifications.NotificacionFactory;
import com.universidad.service.CanalEnvio;
import com.universidad.service.CorreoCanal;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos un usuario (Estudiante)
        Estudiante est = new Estudiante();
        est.setNombre("Carlos Benavides");
        est.setCorreo("carlos.b@ucc.edu.co");

        // 2. Usamos la Factory para crear la notificación
        Notificacion notaFinal = NotificacionFactory.crearCalificacion(est, "Programación III", 4.8);

        // 3. Elegimos el canal (Strategy)
        CanalEnvio miCanal = new CorreoCanal();

        // 4. Enviamos
        notaFinal.enviar(miCanal);
        
        System.out.println("Proceso finalizado con éxito.");
    }
}
