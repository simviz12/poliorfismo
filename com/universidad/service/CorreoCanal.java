package com.universidad.service;

import com.universidad.notifications.Notificacion;

public class CorreoCanal implements CanalEnvio {
    @Override
    public void procesarEnvio(Notificacion n) {
        System.out.println("Enviando correo a: " + n.getDestinatario().getCorreo());
        System.out.println("Mensaje: " + n.getMensaje());
    }
}
