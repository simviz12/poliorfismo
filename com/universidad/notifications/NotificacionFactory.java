package com.universidad.notifications;

import com.universidad.model.Usuario;

public class NotificacionFactory {
    public static Notificacion crearCalificacion(Usuario u, String materia, double nota) {
        NotificacionCalificacion nc = new NotificacionCalificacion();
        nc.setDestinatario(u);
        nc.setMateria(materia);
        nc.setNota(nota);
        nc.setMensaje("Nota de " + materia + ": " + nota);
        return nc;
    }
}
