/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Empleado {
  private String nombre, docuemnto, genero;
  private boolean tieneHijos;
  private double sueldo;

  public Empleado(String nombre, String docuemnto, String genero, boolean tieneHijos, double sueldo) {
    this.nombre = nombre;
    this.docuemnto = docuemnto;
    this.genero = genero;
    this.tieneHijos = tieneHijos;
    this.sueldo = sueldo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDocuemnto() {
    return docuemnto;
  }

  public void setDocuemnto(String docuemnto) {
    this.docuemnto = docuemnto;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public boolean isTieneHijos() {
    return tieneHijos;
  }

  public void setTieneHijos(boolean tieneHijos) {
    this.tieneHijos = tieneHijos;
  }

  public double isSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    return nombre + "|" + docuemnto + "|" + genero + "|" + tieneHijos + "|" + sueldo ;
  }
  
  
}
