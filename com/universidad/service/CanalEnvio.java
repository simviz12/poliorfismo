package com.universidad.service;

import com.universidad.notifications.Notificacion;

public interface CanalEnvio {
    void procesarEnvio(Notificacion n);
}
