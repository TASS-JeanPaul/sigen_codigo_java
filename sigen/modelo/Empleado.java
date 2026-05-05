package sigen.modelo;

import java.util.Date;

public class Empleado extends Usuario {

    private int idEmpleado;
    private String cargo;
    private Date fechaIngreso;
    private int diasVacacionesDisp;

    public Empleado(int idUsuario, int idEmpleado, String nombreCompleto,
                    String correoElectronico, String contrasenaAcceso,
                    String areaTrabajo, String cargo, Date fechaIngreso,
                    int diasVacacionesDisp) {
        super(idUsuario, nombreCompleto, correoElectronico, contrasenaAcceso,
              "EMPLEADO", areaTrabajo);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.diasVacacionesDisp = diasVacacionesDisp;
    }

    public void actualizarDiasDisp(int dias) {
        this.diasVacacionesDisp += dias;
    }

    // Getters y Setters
    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public Date getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(Date fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public int getDiasVacacionesDisp() { return diasVacacionesDisp; }
    public void setDiasVacacionesDisp(int diasVacacionesDisp) { this.diasVacacionesDisp = diasVacacionesDisp; }
}
