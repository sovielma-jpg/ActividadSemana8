package model;

public class ColaboradorExterno extends Persona implements Registrable {
    private String servicioPrestado;
    private double valorServicio;

public ColaboradorExterno() {
    super();
    }

public ColaboradorExterno(String nombre, String rut, String telefono, String servicioPrestado, double valorServicio) {
    super(nombre, rut, telefono);
    this.servicioPrestado = servicioPrestado;
    this.valorServicio = valorServicio;
    }

public String getServicioPrestado() {
    return servicioPrestado;
    }

public void setServicioPrestado(String servicioPrestado) {
    this.servicioPrestado = servicioPrestado;
    }

public double getValorServicio() {
    return valorServicio;
    }

public void setValorServicio(double valorServicio) {
    this.valorServicio = valorServicio;
    }

@Override
public String mostrarResumen() {
    return "Colaborador Externo\n"
    + "Nombre: " + getNombre() + "\n"
    + "RUT: " + getRut() + "\n"
    + "Teléfono: " + getTelefono() + "\n"
    + "Servicio prestado: " + getServicioPrestado() + "\n"
    + "Valor del servicio: $" + getValorServicio();
    }
}
