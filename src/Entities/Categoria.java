package Entities;

public class Categoria {
    
    private int id;
    private String nombre;
    private int idClasificacion;
    private String idSubCategoria;

    public Categoria() {}

    public Categoria(String nombre, int idClasificacion, String idSubCategoria) {
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
        
    public String getIdSubCategoria() {return idSubCategoria;}
        
    public void setIdSubCategoria(String idSubCategoria) {this.idSubCategoria = idSubCategoria;}
        
    
}
