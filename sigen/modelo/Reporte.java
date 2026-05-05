package sigen.modelo;

import java.util.Date;

public class Reporte {

    private int idReporte;
    private String tipo;
    private Date fechaGeneracion;
    private String contenido;
    private String formato;
    private Usuario creadoPor;

    public Reporte(int idReporte, String tipo, String contenido, String formato, Usuario creadoPor) {
        this.idReporte = idReporte;
        this.tipo = tipo;
        this.contenido = contenido;
        this.formato = formato;
        this.creadoPor = creadoPor;
        this.fechaGeneracion = new Date();
    }

    // Getters y Setters
    public int getIdReporte() { return idReporte; }
    public void setIdReporte(int idReporte) { this.idReporte = idReporte; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Date getFechaGeneracion() { return fechaGeneracion; }
    public void setFechaGeneracion(Date fechaGeneracion) { this.fechaGeneracion = fechaGeneracion; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    public Usuario getCreadoPor() { return creadoPor; }
    public void setCreadoPor(Usuario creadoPor) { this.creadoPor = creadoPor; }
}
