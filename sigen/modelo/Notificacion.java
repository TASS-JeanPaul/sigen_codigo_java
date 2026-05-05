package sigen.modelo;

import java.util.Date;

public class Notificacion {

    private int idNotificacion;
    private String mensaje;
    private Date fechaEnvio;
    private boolean leida;
    private String tipo;
    private Usuario destinatario;

    public Notificacion(int idNotificacion, String mensaje, String tipo, Usuario destinatario) {
        this.idNotificacion = idNotificacion;
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.destinatario = destinatario;
        this.fechaEnvio = new Date();
        this.leida = false;
    }

    public void marcarLeida() {
        this.leida = true;
    }

    // Getters y Setters
    public int getIdNotificacion() { return idNotificacion; }
    public void setIdNotificacion(int idNotificacion) { this.idNotificacion = idNotificacion; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public Date getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(Date fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    public boolean isLeida() { return leida; }
    public void setLeida(boolean leida) { this.leida = leida; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Usuario getDestinatario() { return destinatario; }
    public void setDestinatario(Usuario destinatario) { this.destinatario = destinatario; }
}
