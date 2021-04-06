package Entities;

public class Clasificacion {
    
    private int id;
    private String nombre;
    private int idTipoFlujo;
    
    public Clasificacion() {}

    public Clasificacion( String nombre, int idTipoFlujo) {
        
        this.nombre = nombre;
        this.idTipoFlujo = idTipoFlujo;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
        
    public String getNombre() {return nombre;}
        
    public void setNombre(String nombre) {this.nombre = nombre;}
 
    public int getIdTipoFlujo() {return idTipoFlujo;}
 
    public void setIdTipoFlujo(int idTipoFlujo) {this.idTipoFlujo = idTipoFlujo;}
}
