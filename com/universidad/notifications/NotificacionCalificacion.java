package com.universidad.notifications;

import com.universidad.enums.EstadoNotificacion;
import com.universidad.service.CanalEnvio;
import java.time.LocalDateTime;

public class NotificacionCalificacion extends Notificacion {
    private String materia;
    private double nota;

    public void setMateria(String m) { this.materia = m; }
    public void setNota(double n) { this.nota = n; }

    @Override
    public void enviar(CanalEnvio canal) {
        this.estado = EstadoNotificacion.PROCESANDO;
        canal.procesarEnvio(this);
        this.estado = EstadoNotificacion.ENVIADO;
        this.fechaEnvio = LocalDateTime.now();
    }
}
