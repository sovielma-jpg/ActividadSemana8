package model;

public abstract class Persona {
    protected String nombre;
    protected String rut;
    protected String telefono;

    public Persona() {

    }

public Persona(String nombre, String rut, String telefono) {
    this.nombre = nombre;
    this.rut = rut;
    this.telefono = telefono;
    }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre){
    this.nombre = nombre;
    }

public String getRut(){
    return rut;
    }

public void setRut(String rut){
    this.rut = rut;
}

public String getTelefono() {
    return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
