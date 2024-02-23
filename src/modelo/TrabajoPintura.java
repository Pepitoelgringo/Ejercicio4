package modelo;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    double superficie; //– Es la superficie a pintar (metros cuadrados).
    double preciopintura; //– Es el precio de un litro de pintura.
    double precio;

     public TrabajoPintura(String trabajador, LocalDate fechainicio, String cliente, double superficie, double preciopintura) {
        super(trabajador, fechainicio, cliente);
        this.superficie = superficie;
        this.preciopintura = preciopintura;
    }

    @Override
    double costeMaterial() {
        return (superficie / 7.8) * preciopintura;
    }

    @Override
    double costeManoObra() {
        return (superficie / 10) * 9.5 ;
    }

    @Override
    public double costeTotal() {
        this.precio = (costeMaterial()+costeManoObra());
        if (superficie < 50) {
        return this.precio*1.15;
        } else
            return  this.precio;
    }
@Override
    public String detalleServicio() {
        return "TRABAJO DE PINTURA" +
                "\n Cliente: " + getCliente()+
                "\n Fecha de inicio: " + getFechainicio()+
                "\n ---------------------------" +
                "\n Pintor: "+ getTrabajador() +
                "\n Coste Material: "+ costeMaterial() +
                "\n Coste Mano de obra: "+ costeManoObra() +
                "\n Coste adicional: " + precio*0.15 +
                "\n Coste total del servicio: " + costeTotal();
    }


    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPreciopintura() {
        return preciopintura;
    }

    public void setPreciopintura(double preciopintura) {
        this.preciopintura = preciopintura;
    }
}