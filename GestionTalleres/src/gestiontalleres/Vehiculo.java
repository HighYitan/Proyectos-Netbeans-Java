package gestiontalleres;

public class Vehiculo {
    //Atributos
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Propietario propietario;
    private boolean estacionado;
    private Taller taller;
    //Métodos
    public Vehiculo(String matricula, String marca, String modelo, String color,
    boolean reparando){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.estacionado=false;
    }
    public void setTaller(Taller taller){
        this.taller=taller;
    }
    public Taller getTaller(){
        return taller;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setPropietario(Propietario propietario){
        this.propietario=propietario;
    }
    public Propietario getPropietario(){
        return propietario;
    }
    public void setEstacionado(boolean estacionado){
        this.estacionado=estacionado;
    }
    public boolean getEstacionado(){
        return estacionado;
    }
}
