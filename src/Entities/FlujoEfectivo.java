package Entities;

import java.util.Date;

public class FlujoEfectivo {
    
    private int id;
    private float monto;
    private Date fecha;
    private int idCategoria;
    
    public FlujoEfectivo() {}

    public FlujoEfectivo(int id, float monto, Date fecha, int idCategoria) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.idCategoria = idCategoria;
    }

    public int getId() {return id;}
  
    public void setId(int id) {this.id = id;}

    public float getMonto() {return monto;}

    public void setMonto(float monto) {this.monto = monto;}
 
    public Date getFecha() {return fecha;}
        
    public void setFecha(Date fecha) {this.fecha = fecha;}
        
    public int getIdCategoria() {return idCategoria;}
 
    public void setIdCategoria(int idCategoria) {this.idCategoria = idCategoria;}
        
}
