package gestiontalleres;

import java.util.ArrayList;

public class Taller {
    //Atributos
    private ArrayList<Propietario> cliente;
    private ArrayList<String> nombreCliente;
    private ArrayList<Vehiculo> propiedades;
    private String direccion;
    private String nombre;
    private int codigo;
    private int telefono;
    //Métodos
    public Taller(int codigo, String nombre, String direccion, int telefono){
        this.codigo=codigo;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.cliente = new ArrayList();
        this.propiedades = new ArrayList();
    }
    public void setCliente(ArrayList<Propietario> cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Propietario> getCliente() {
        return cliente;
    }
    public void setVehiculo(ArrayList<Vehiculo> propiedades) {
        this.propiedades = propiedades;
    }
    public ArrayList<Vehiculo> getVehiculo() {
        return propiedades;
    }
    public void setNombreCliente(ArrayList<String> nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public ArrayList<String> getNombreCliente() {
        return nombreCliente;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setNombreTaller(String nombre){
        this.nombre=nombre;
    }
    public String getNombreTaller(){
        return nombre;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setTelTaller(int telefono){
        this.telefono=telefono;
    }
    public int getTelTaller(){
        return telefono;
    }
    public void addCliente(Propietario a) {
        this.cliente.add(a);
    }
    public void addVehiculo(Vehiculo asdf) {
        this.propiedades.add(asdf);
    }
    public void reportClientes() {
        for (int i = 0; i < this.cliente.size(); i++) {
            System.out.println(
                    "DNI " + this.cliente.get(i).getDni()
                    + " Nombre " + this.cliente.get(i).getNombre()
                    + " Telefono " + this.cliente.get(i).getTelefono()
                    + " Fecha de alta " + this.cliente.get(i).getAlta()
                    + " Compras " + this.cliente.get(i).getPropiedades()            
            );
        }
    }
    public void reportVehiculos() {
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