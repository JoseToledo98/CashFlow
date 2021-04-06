package Entities;

import java.util.Date;

public class Informe {
    
    private int id;
    private Date fecha;
    private String idAllUtilidad;
    private String idAllIncadores;
    
    public Informe() {}

    public Informe( Date fecha, String idAllUtilidad, String idAllIncadores) {
       
        this.fecha = fecha;
        this.idAllUtilidad = idAllUtilidad;
        this.idAllIncadores = idAllIncadores;
    }  

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}  

    public Date getFecha() {return fecha;}

    public void setFecha(Date fecha) { this.fecha = fecha;}

    public String getIdAllUtilidad() {return idAllUtilidad;}

    public void setIdAllUtilidad(String idAllUtilidad) {this.idAllUtilidad = idAllUtilidad;}
 
    public String getIdAllIncadores() {return idAllIncadores;}
  
    public void setIdAllIncadores(String idAllIncadores) { this.idAllIncadores = idAllIncadores;}    
    
}
