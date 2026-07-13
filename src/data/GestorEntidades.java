package data;

import java.util.ArrayList;
import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;

public class GestorEntidades {
    private ArrayList<Registrable> entidades;

public GestorEntidades() {
    entidades = new ArrayList<>();
    }

public ArrayList<Registrable> getEntidades() {
    return entidades;
    }

public void setEntidades(ArrayList<Registrable> entidades) {
    this.entidades = entidades;
    }

public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

public String mostrarTodasLasEntidades() {
    StringBuilder resumen = new StringBuilder();

    if (entidades.isEmpty()) {
        return "No existen entidades registradas en el sistema.";
        }

    for (Registrable entidad : entidades) {
        resumen.append(entidad.mostrarResumen()).append("\n");

    if (entidad instanceof GuiaTuristico) {
        GuiaTuristico guia = (GuiaTuristico) entidad;
        resumen.append("Tipo detectado con instanceof: Guía turístico.\n");
        resumen.append("Dato específico: domina el idioma ")
                        .append(guia.getIdioma())
                        .append(".\n");
}
    else if (entidad instanceof Vehiculo) {
        Vehiculo vehiculo = (Vehiculo) entidad;
        resumen.append("Tipo detectado con instanceof: Vehículo.\n");
        resumen.append("Dato específico: capacidad para ")
                        .append(vehiculo.getCapacidadPasajeros())
                        .append(" pasajeros.\n");

}
    else if (entidad instanceof ColaboradorExterno) {
    ColaboradorExterno colaborador = (ColaboradorExterno) entidad;
    resumen.append("Tipo detectado con instanceof: Colaborador externo.\n");
    resumen.append("Dato específico: presta el servicio de ")
                        .append(colaborador.getServicioPrestado())
                        .append(".\n");
}

    resumen.append("--------------------------------------\n");
}

    return resumen.toString();
}

    public String contarTiposDeEntidades() {
    int totalGuias = 0;
    int totalVehiculos = 0;
    int totalColaboradores = 0;

    for (Registrable entidad : entidades) {
        if (entidad instanceof GuiaTuristico) {
                totalGuias++;
        } else if (entidad instanceof Vehiculo) {
                totalVehiculos++;
        } else if (entidad instanceof ColaboradorExterno) {
                totalColaboradores++;
    }
}

    return "Resumen de entidades registradas:\n"
                + "Guías turísticos: " + totalGuias + "\n"
                + "Vehículos: " + totalVehiculos + "\n"
                + "Colaboradores externos: " + totalColaboradores;
    }
}
