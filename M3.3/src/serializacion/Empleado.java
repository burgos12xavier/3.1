package serializacion;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Serializable {
    public Empleado(String n, double s, int agno, int mes, int dia){

        nombre=n;

        sueldo=s;

        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);

        fechaContrato=calendario.getTime();

    }



    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }


    public void subirSueldo(double porcentaje){

        double aumento=sueldo*porcentaje/100;

        sueldo+=aumento;

    }

    public String toString(){

        return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;

    }

    private String nombre;

    private double sueldo;

    private Date fechaContrato;
}
