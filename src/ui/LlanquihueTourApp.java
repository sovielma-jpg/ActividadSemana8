package ui;

import javax.swing.JOptionPane;
import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;

public class LlanquihueTourApp {

public static void main(String[] args) {
    GestorEntidades gestor = new GestorEntidades();

int opcion;

do {
    String menu = """
    MENÚ

1. Registrar guía turístico
2. Registrar vehículo
3. Registrar colaborador externo
4. Mostrar entidades registradas
5. Mostrar resumen por tipo
6. Salir

    Seleccione una opción:
""";

opcion = leerEntero(menu);

    switch (opcion) {
                case 1:
                    registrarGuiaTuristico(gestor);
                    break;

                case 2:
                    registrarVehiculo(gestor);
                    break;

                case 3:
                    registrarColaboradorExterno(gestor);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(
                            null,
                            gestor.mostrarTodasLasEntidades(),
                            "Entidades registradas",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 5:
                    JOptionPane.showMessageDialog(
                            null,
                            gestor.contarTiposDeEntidades(),
                            "Resumen por tipo",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 6:
                    JOptionPane.showMessageDialog(
                            null,
                            "Gracias por utilizar el sistema de Llanquihue Tour."
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción inválida. Intente nuevamente.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                    break;
            }

        } while (opcion != 6);
    }

    private static void registrarGuiaTuristico(GestorEntidades gestor) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del guía turístico:");
        String rut = JOptionPane.showInputDialog("Ingrese el RUT del guía turístico:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del guía turístico:");
        String idioma = JOptionPane.showInputDialog("Ingrese el idioma que domina el guía:");
        int experiencia = leerEntero("Ingrese los años de experiencia:");

        GuiaTuristico guia = new GuiaTuristico();

        guia.setNombre(nombre);
        guia.setRut(rut);
        guia.setTelefono(telefono);
        guia.setIdioma(idioma);
        guia.setAniosExperiencia(experiencia);

        gestor.agregarEntidad(guia);

        JOptionPane.showMessageDialog(
                null,
                "Guía turístico registrado correctamente.\n\n" + guia.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static void registrarVehiculo(GestorEntidades gestor) {
        String patente = JOptionPane.showInputDialog("Ingrese la patente del vehículo:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        int capacidad = leerEntero("Ingrese la capacidad de pasajeros:");

        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setPatente(patente);
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setCapacidadPasajeros(capacidad);

        gestor.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(
                null,
                "Vehículo registrado correctamente.\n\n" + vehiculo.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static void registrarColaboradorExterno(GestorEntidades gestor) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del colaborador externo:");
        String rut = JOptionPane.showInputDialog("Ingrese el RUT del colaborador externo:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del colaborador externo:");
        String servicio = JOptionPane.showInputDialog("Ingrese el servicio prestado:");
        double valor = leerDouble("Ingrese el valor del servicio:");

        ColaboradorExterno colaborador = new ColaboradorExterno();

        colaborador.setNombre(nombre);
        colaborador.setRut(rut);
        colaborador.setTelefono(telefono);
        colaborador.setServicioPrestado(servicio);
        colaborador.setValorServicio(valor);

        gestor.agregarEntidad(colaborador);

        JOptionPane.showMessageDialog(
                null,
                "Colaborador externo registrado correctamente.\n\n" + colaborador.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static int leerEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog(null,
                        mensaje,
                        "Llanquihue Tour - Sistema de Gestion",
                        JOptionPane.QUESTION_MESSAGE);

                if (entrada == null) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Finalizado"
                    );

                    System.exit(0);
                }


                numero = Integer.parseInt(entrada);
                valido = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un número entero válido.",
                        "Error de ingreso",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        return numero;
    }

    private static double leerDouble(String mensaje) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog(mensaje);

                if (entrada == null) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Finalizado"
                    );
                }
                System.exit(0);

                numero = Double.parseDouble(entrada);
                valido = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un número válido.",
                        "Error de ingreso",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        return numero;
    }
}
