package modelo;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {
    int numeroalarmasarevisar;

    public RevisionAlarma(String trabajador, LocalDate fechainicio, String cliente, int numeroalarmasarevisar) {
        super(trabajador = "Revisor Especialista Coontraincendios", fechainicio, cliente);
        this.numeroalarmasarevisar = numeroalarmasarevisar;
    }

    @Override
    double costeMaterial() {
        return 0;
    }
    @Override
    double costeManoObra() {
        return  ((double) numeroalarmasarevisar / 3) * 40;
    }

    @Override
    double costeTotal() {
        return costeManoObra();
    }
    @Override
    String detalleServicio() {
        return "REVISION PERIÓDICA ALARMAS CONTRAINCENDIOS" +
                "\nCliente: "+ getCliente() +
                "\n Fecha revisión: "+ getFechainicio() +
                "\n --------------------------------" +
                "\n Total: " + costeTotal() +
                "\n --------------------------------";
    }

    public int getNumeroalarmasarevisar() {
        return numeroalarmasarevisar;
    }

    public void setNumeroalarmasarevisar(int numeroalarmasarevisar) {
        this.numeroalarmasarevisar = numeroalarmasarevisar;
    }
}