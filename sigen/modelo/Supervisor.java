package sigen.modelo;

public class Supervisor extends Usuario {

    private int idSupervisor;
    private String areaResponsable;
    private String nivelAprobacion;

    public Supervisor(int idUsuario, int idSupervisor, String nombreCompleto,
                      String correoElectronico, String contrasenaAcceso,
                      String areaTrabajo, String areaResponsable,
                      String nivelAprobacion) {
        super(idUsuario, nombreCompleto, correoElectronico, contrasenaAcceso,
              "SUPERVISOR", areaTrabajo);
        this.idSupervisor = idSupervisor;
        this.areaResponsable = areaResponsable;
        this.nivelAprobacion = nivelAprobacion;
    }

    // Getters y Setters
    public int getIdSupervisor() { return idSupervisor; }
    public void setIdSupervisor(int idSupervisor) { this.idSupervisor = idSupervisor; }

    public String getAreaResponsable() { return areaResponsable; }
    public void setAreaResponsable(String areaResponsable) { this.areaResponsable = areaResponsable; }

    public String getNivelAprobacion() { return nivelAprobacion; }
    public void setNivelAprobacion(String nivelAprobacion) { this.nivelAprobacion = nivelAprobacion; }
}
