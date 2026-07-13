package model;

public class GuiaTuristico extends Persona implements Registrable {
    private String idioma;
    private int aniosExperiencia;

public GuiaTuristico() {
    super();
    }

public GuiaTuristico(String nombre, String rut, String telefono, String idioma, int aniosExperiencia){
     super(nombre, rut, telefono);
     this.idioma = idioma;
     this.aniosExperiencia = aniosExperiencia;
    }

public String getIdioma() {
     return idioma;
    }

public void setIdioma(String idioma) {
     this.idioma = idioma;
    }

public int getAniosExperiencia() {
     return aniosExperiencia;
    }

public void setAniosExperiencia(int aniosExperiencia) {
     this.aniosExperiencia = aniosExperiencia;
    }
 @Override
public String mostrarResumen() {
    return "Guia Turistuco\n"
    + "Nombre: " + getNombre() + "\n"
    + "Rut: " + getRut() + "\n"
    + "Telefono: " + getTelefono() + "\n"
    + "Idioma: " + getIdioma() + "\n"
    + "Años de experiencia: "+ getAniosExperiencia();
    }
}
