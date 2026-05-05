package sigen.modelo;

import java.util.Date;

public class Vacaciones extends Solicitud {

    private int idVacaciones;
    private int diasSolicitados;
    private String periodo;

    public Vacaciones(int idSolicitud, int idVacaciones, String descripcion,
                      Empleado solicitante, Date fechaInicio, Date fechaFin,
                      int diasSolicitados, String periodo) {
        super(idSolicitud, descripcion, solicitante, fechaInicio, fechaFin);
        this.idVacaciones = idVacaciones;
        this.diasSolicitados = diasSolicitados;
        this.periodo = periodo;
    }

    // Getters y Setters
    public int getIdVacaciones() { return idVacaciones; }
    public void setIdVacaciones(int idVacaciones) { this.idVacaciones = idVacaciones; }

    public int getDiasSolicitados() { return diasSolicitados; }
    public void setDiasSolicitados(int diasSolicitados) { this.diasSolicitados = diasSolicitados; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }
}
