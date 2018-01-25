package gestiontalleres;

import java.util.ArrayList;

public class GestionTalleres {
    //Atributos
    private ArrayList<Propietario> clientes;
    private ArrayList<Taller> talleres;
    private ArrayList<Vehiculo> vehiculos;
    //Metodos
    public GestionTalleres(){
        this.clientes=new ArrayList();
        this.talleres=new ArrayList();
        this.vehiculos=new ArrayList();
    }
    public void setClientes(ArrayList<Propietario> clientes){
        this.clientes=clientes;
    }
    public ArrayList<Propietario> getClientes(){
        return clientes;
    }
    public void setTalleres(ArrayList<Taller> talleres){
        this.talleres=talleres;
    }
    public ArrayList<Taller> getTalleres(){
        return talleres;
    }
    public void setVehiculos(ArrayList<Vehiculo> vehiculos){
        this.vehiculos=vehiculos;
    }
    public ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    public Taller crearTaller(int codigo, String nombre, String direccion,
    int telefono){
        Taller at = new Taller(codigo, nombre, direccion, telefono);
        this.talleres.add(at);
        return at;
    }
    public void crearVehiculo(String matricula, String marca, String modelo, 
    String color, boolean estacionado){
        Vehiculo asdf = new Vehiculo(matricula, marca, modelo, color, 
        estacionado);
        this.vehiculos.add(asdf);
    }
    public void nuevoCliente(String dni, String nombre, int telefono, int alta){
        Propietario a = new Propietario (dni, nombre, telefono, alta);
        this.clientes.add(a);
    }
    public void infoCliente(Propietario a){
        System.out.println(
        a.getNombre() + " con DNI " + a.getDni() + ", su teléfono es " 
        + a.getTelefono() + " y se dió de alta el " + a.getAlta()
        );
    }
    public void infoTaller(Taller at){
        System.out.println(
        at.getNombreTaller() + " con código de taller número " + at.getCodigo()
        + ", su teléfono es "+ at.getTelTaller() 
        + " y la dirección del taller es " + at.getDireccion()
        );
    }
    public void infoVehiculo(Vehiculo asdf){
        System.out.println(
        "El " + asdf.getMarca() + asdf.getModelo() + " de matricula " 
        + asdf.getMatricula() + " y de color " + asdf.getColor()
        );
    }
    public void reportClientes(){
        for (int i = 0; i < this.clientes.size(); i++) {
            System.out.println(
                    "DNI " + this.clientes.get(i).getDni()
                    + " Nombre " + this.clientes.get(i).getNombre()
                    + " Telefono " + this.clientes.get(i).getTelefono()
                    + " Fecha de alta " + this.clientes.get(i).getAlta()
                    + " Compras " + this.clientes.get(i).getPropiedades()            
            );
        }
    }
    public void reportTalleres(){
        for (int i = 0; i < this.talleres.size(); i++) {
            System.out.println(
                    "Codigo " + this.talleres.get(i).getCodigo()
                    + " Nombre del taller " 
                    + this.talleres.get(i).getNombreTaller()
                    + " Telefono del taller " 
                    + this.talleres.get(i).getTelTaller()
                    + " Calle del taller " + this.talleres.get(i).getDireccion()            
            );
        }
    }
    public void reportVehiculos(){
        for (int i = 0; i < this.vehiculos.size(); i++) {
            System.out.println(
                    "Matricula " + this.vehiculos.get(i).getMatricula()
                    + " Marca " + this.vehiculos.get(i).getMarca()
                    + " Modelo " + this.vehiculos.get(i).getModelo()
                    + " Color " + this.vehiculos.get(i).getColor()
                    + " Estacionado " + this.vehiculos.get(i).getEstacionado()              
            );
        }
    }
    //Main-inicializador de métodos
    public static void main(String[] args) {
        GestionTalleres gestor = new GestionTalleres();
        Propietario a=new Propietario("12345678A", "Joselito Stalin", 999888777, 
        31121944);
        Vehiculo asdf = new Vehiculo("PAL1234", "Toyota", "Corolla", "Rojo",
        false);
        Taller at = new Taller(1234, "Arreglabujías", "Calle embolia",
        66777888);
        a.addVehiculo(asdf);
        a.reportVehiculos();
        Propietario b=new Propietario("12345678B", "Adolfo éxitoler", 777666777, 
        31021939);
        b.reportVehiculos();
    } 
}