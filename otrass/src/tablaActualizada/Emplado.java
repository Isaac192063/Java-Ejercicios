/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaActualizada;

/**
 *
 * @author ASUS
 */
public class Emplado {
  private String nombre;
  private int edad;
  private double sueldo;

  public Emplado(String nombre, int edad, double sueldo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sueldo = sueldo;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String toString() {
    return "nombre: " + nombre + "\nedad: " + edad + "\nsueldo: " + sueldo;
  }
  
  
}
