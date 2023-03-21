/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author ASUS
 */
public class Nodo {
  Nodo enlace;
  String dato;

  public Nodo() {
    enlace = null;
  }

  public Nodo getSiguiente() {
    return enlace;
  }

  public void setSiguiente(Nodo siguiente) {
    this.enlace = siguiente;
  }

  public String getDato() {
    return dato;
  }

  public void setDato(String dato) {
    this.dato = dato;
  }
  
  
  
  
}
