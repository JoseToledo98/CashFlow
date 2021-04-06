package Entities;

public class Utilidad {
    
    private String idallingresos;
    private String idallegresos;
    private float egresoTotal;
    private float ingresoTotal;
    private float margen;
    private float monto;
    private int semana;
   
    public Utilidad() {}

    public Utilidad(String idallingresos, String idallegresos, float egresoTotal, float ingresoTotal, float margen, float monto, int semana) {
        this.idallingresos = idallingresos;
        this.idallegresos = idallegresos;
        this.egresoTotal = egresoTotal;
        this.ingresoTotal = ingresoTotal;
        this.margen = margen;
        this.monto = monto;
        this.semana = semana;
    }

    public float getEgresoTotal() {return egresoTotal;}

    public void setEgresoTotal(float egresoTotal) {this.egresoTotal = egresoTotal;}
 
    public float getIngresoTotal() {return ingresoTotal;}
  
    public void setIngresoTotal(float ingresoTotal) {this.ingresoTotal = ingresoTotal;}
 
    public float getMargen() {return margen;}

    public void setMargen(float margen) {this.margen = margen;}
  
    public float getMonto() {return monto;}

    public void setMonto(float monto) {this.monto = monto;}

    public int getSemana() {return semana;}
 
    public void setSemana(int semana) {this.semana = semana;}

    public String getIdallingresos() {return idallingresos;}

    public void setIdallingresos(String idallingresos) {this.idallingresos = idallingresos;}

    public String getIdallegresos() {return idallegresos;}

    public void setIdallegresos(String idallegresos) {this.idallegresos = idallegresos;}
 
}
