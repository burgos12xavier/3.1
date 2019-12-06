package serializacion;

class Administrador extends Empleado{

    public Administrador(String n, double s, int agno, int mes, int dia){

        super(n,s,agno,mes,dia);

        incentivo=0;

    }

    public double getSueldo(){

        double sueldoBase=super.getSueldo();

        return sueldoBase + incentivo;

    }

    public void setIncentivo(double b){

        incentivo=b;
    }


    public String toString(){

        return super.toString() + " Incentivo=" + incentivo;

    }

    private double incentivo;
}