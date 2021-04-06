package Entities;



public class FlujoEfectivo {
    
    private int id;
    private float monto;
    private java.sql.Date fecha;
    private int idCategoria;
    
    public FlujoEfectivo() {}

    public FlujoEfectivo( float monto, java.sql.Date fecha, int idCategoria) {
      
        this.monto = monto;
        this.fecha = fecha;
        this.idCategoria = idCategoria;
    }

    public int getId() {return id;}
  
    public void setId(int id) {this.id = id;}

    public float getMonto() {return monto;}

    public void setMonto(float monto) {this.monto = monto;}
 
    public java.sql.Date getFecha() {return fecha;}
        
    public void setFecha(java.sql.Date fecha) {this.fecha = fecha;}
        
    public int getIdCategoria() {return idCategoria;}
 
    public void setIdCategoria(int idCategoria) {this.idCategoria = idCategoria;}
        
}
