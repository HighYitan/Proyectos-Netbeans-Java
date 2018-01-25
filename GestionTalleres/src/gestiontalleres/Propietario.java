package gestiontalleres;

import java.util.ArrayList;

public class Propietario {
    //Atributos
    private ArrayList<Vehiculo> propiedades;
    private String dni;
    private String nombre;
    private int telefono;
    private int alta;
    //Métodos
    public Propietario(String dni, String nombre, int telefono, int alta) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.alta = alta;
        this.propiedades = new ArrayList();
    }
    public void setPropiedades(ArrayList<Vehiculo> propiedades) {
        this.propiedades = new ArrayList();
    }
    public ArrayList<Vehiculo> getPropiedades() {       
        return propiedades;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setAlta(int alta) {
        this.alta = alta;
    }
    public int getAlta() {
        return alta;
    }
    public void addVehiculo(Vehiculo asdf){
        this.propiedades.add(asdf);
    }
    public void reportVehiculos(){
        for (int i = 0; i < this.propiedades.size(); i++) {
            System.out.println(
                    "Matricula " + this.propiedades.get(i).getMatricula()
                    + " Marca " + this.propiedades.get(i).getMarca()
                    + " Modelo " + this.propiedades.get(i).getModelo()
                    + " Color " + this.propiedades.get(i).getColor()
                    + " Estacionado " + this.propiedades.get(i).getEstacionado()              
            );
        }
    }
}
