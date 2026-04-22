package com.universidad.notifications;

import com.universidad.model.Usuario;
import com.universidad.enums.EstadoNotificacion;
import com.universidad.service.CanalEnvio;
import java.time.LocalDateTime;

public abstract class Notificacion {
    protected long codigo;
    protected Usuario destinatario;
    protected String mensaje;
    protected LocalDateTime fechaEnvio;
    protected EstadoNotificacion estado;

    // Getters y Setters
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    
    public Usuario getDestinatario() { return destinatario; }
    public void setDestinatario(Usuario d) { this.destinatario = d; }

    public EstadoNotificacion getEstado() { return estado; }
    public void setEstado(EstadoNotificacion estado) { this.estado = estado; }

    public LocalDateTime getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(LocalDateTime fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    // El método polimórfico
    public abstract void enviar(CanalEnvio canal);
}
