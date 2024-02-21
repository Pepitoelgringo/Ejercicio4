package modelo;

import java.time.LocalDate;

public abstract class Servicio {
    String trabajador;
    LocalDate fechainicio;
    String cliente;

    public Servicio(String trabajador, LocalDate fechainicio, String cliente) {
        this.trabajador = trabajador;
        this.fechainicio = fechainicio;
        this.cliente = cliente;
    }

    abstract double costeMaterial(); //Este método calculará el total gastado en material.

    abstract double costeManoObra(); //Este método calculará el total gastado en mano de obra.

    abstract double costeTotal(); //Este método calculará el coste total del servicio.
    abstract String detalleServicio(); //Este método devolverá una cadena con información detallada de lo que
    //ha costado el Servicio

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}