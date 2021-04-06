package Entities;

public class Categoria {
    
    private int id;
    private String nombre;
    private int idClasificacion;
    private int idSubCategoria;

    public Categoria() {}

    public Categoria(int id, String nombre, int idClasificacion, int idSubCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.idClasificacion = idClasificacion;
        this.idSubCategoria = idSubCategoria;
    }

    public int getId() {return id;}
    
    public void setId(int id) {this.id = id;}
    
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}
        
    public int getIdClasificacion() {return idClasificacion;}
        
    public void setIdClasificacion(int idClasificacion) {this.idClasificacion = idClasificacion;}
        
    public int getIdSubCategoria() {return idSubCategoria;}
        
    public void setIdSubCategoria(int idSubCategoria) {this.idSubCategoria = idSubCategoria;}
        
    
}
