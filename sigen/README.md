# SIGEN · Sistema de Gestión de Novedades Laborales

> Backend en Java para gestionar solicitudes de permisos, vacaciones, licencias y novedades laborales de una organización, con flujos de aprobación por supervisor, notificaciones a usuarios y trazabilidad mediante auditoría y reportes.

**Lenguaje:** Java (sin framework — POJOs y servicios planos)
**Paquetes:** `sigen.modelo`, `sigen.servicios`
**Estado:** Esqueleto inicial — modelo de dominio definido, servicios con firmas declaradas pendientes de implementación

---

## Tabla de contenidos

1. [¿Qué es SIGEN?](#qué-es-sigen)
2. [Estructura del proyecto](#estructura-del-proyecto)
3. [Modelo de dominio](#modelo-de-dominio)
4. [Servicios](#servicios)
5. [Cómo compilar y ejecutar](#cómo-compilar-y-ejecutar)
6. [Estado actual y próximos pasos](#estado-actual-y-próximos-pasos)

---

## ¿Qué es SIGEN?

SIGEN es un sistema pensado para que los empleados de una organización registren novedades laborales (permisos, vacaciones, licencias) y los supervisores las aprueben o rechacen, dejando registro auditable de cada acción.

Tres roles principales:

- **Empleado** — solicita permisos, vacaciones o licencias y consulta su historial.
- **Supervisor** — aprueba o rechaza solicitudes en su área de responsabilidad.
- **Sistema** — emite notificaciones, registra auditoría y permite generar reportes administrativos.

---

## Estructura del proyecto

```
sigen/
├── modelo/         # Entidades del dominio (POJOs)
│   ├── Usuario.java
│   ├── Empleado.java          (extends Usuario)
│   ├── Supervisor.java        (extends Usuario)
│   ├── Solicitud.java         (abstract)
│   ├── Permiso.java           (extends Solicitud)
│   ├── Vacaciones.java        (extends Solicitud)
│   ├── Licencia.java          (extends Solicitud)
│   ├── Novedad.java           (extends Solicitud)
│   ├── Notificacion.java
│   ├── Reporte.java
│   └── Auditoria.java
└── servicios/      # Lógica de negocio
    ├── ServicioAutenticacion.java
    ├── ServicioGestionSolicitudes.java
    ├── ServicioAprobacion.java
    ├── ServicioNotificaciones.java
    ├── ServicioNovedadesLaborales.java
    └── ServicioReportesAuditoria.java
```

---

## Modelo de dominio

### Jerarquía de usuarios

`Usuario` es la clase base con los campos comunes (`idUsuario`, `nombreCompleto`, `correoElectronico`, `contrasenaAcceso`, `rolUsuario`, `areaTrabajo`, `estadoActivo`). Especializa en:

| Clase | Campos propios | Rol asignado |
|---|---|---|
| **Empleado** | `idEmpleado`, `cargo`, `fechaIngreso`, `diasVacacionesDisp` | `"EMPLEADO"` |
| **Supervisor** | `idSupervisor`, `areaResponsable`, `nivelAprobacion` | `"SUPERVISOR"` |

### Jerarquía de solicitudes

`Solicitud` es una clase **abstracta** que define el ciclo de vida común: `PENDIENTE` → `APROBADA` / `RECHAZADA` / `CANCELADA`, con métodos `aprobar()`, `rechazar(motivo)` y `cancelar()`. Cada subclase añade los campos propios de su tipo:

| Clase | Campos propios |
|---|---|
| **Permiso** | `motivo`, `tipoPermiso`, `diasSolicitados` |
| **Vacaciones** | `diasSolicitados`, `periodo` |
| **Licencia** | `tipoLicencia`, `docSoporte`, `remunerada` |
| **Novedad** | `tipoNovedad`, `justificada`, `docSoporte` |

### Soporte transversal

- **Notificacion** — mensaje dirigido a un `Usuario`, con tipo, fecha de envío y bandera `leida`.
- **Reporte** — documento generado (Excel, PDF, etc.) con tipo, contenido y autor.
- **Auditoria** — registro inmutable de una acción ejecutada por un usuario, con timestamp.

---

## Servicios

Cada servicio agrupa operaciones por dominio funcional:

| Servicio | Responsabilidad |
|---|---|
| **ServicioAutenticacion** | Verifica credenciales (`iniciarSesion`) |
| **ServicioGestionSolicitudes** | Registra licencias, permisos y vacaciones; consulta historial, días disponibles y estado; permite cancelar |
| **ServicioAprobacion** | Aprueba o rechaza una `Solicitud`, con comentarios de revisión |
| **ServicioNotificaciones** | Envía notificaciones al destinatario y consulta las recibidas por un usuario |
| **ServicioNovedadesLaborales** | Registra novedades laborales |
| **ServicioReportesAuditoria** | Registra y consulta auditoría, genera reportes y exporta información |

> Las firmas están definidas; los cuerpos están como esqueletos pendientes de conectar con la capa de persistencia.

---

## Cómo compilar y ejecutar

El proyecto no usa Maven ni Gradle todavía — se compila directo con `javac` desde la raíz del repositorio (un nivel por encima de `sigen/`).

```powershell
# Desde la raíz del repo (donde está la carpeta sigen/)
javac -d out sigen/modelo/*.java sigen/servicios/*.java
```

Esto deja los `.class` en `out/sigen/modelo/` y `out/sigen/servicios/`, respetando la estructura de paquetes.

Aún no hay clase `main`, así que el código se consume importando los paquetes desde otro módulo:

```java
import sigen.modelo.Empleado;
import sigen.servicios.ServicioGestionSolicitudes;
```

### Requisitos

- JDK 8 o superior (el código solo usa `java.util.Date` y `java.util.List`, sin features modernas)

---

## Estado actual y próximos pasos

**Lo que ya existe:**
- Modelo de dominio completo con herencia (Usuario/Empleado/Supervisor, Solicitud/Permiso/Vacaciones/Licencia/Novedad)
- Firmas de los seis servicios principales
- Encapsulación con getters/setters en todas las entidades

**Lo que falta:**
- Implementar la lógica real de los servicios (hoy son esqueletos)
- Capa de persistencia (DAO + base de datos)
- Punto de entrada (`main`) o capa de presentación (CLI / API REST)
- Pruebas unitarias
- Build tool (Maven o Gradle) para gestión de dependencias y empaquetado
