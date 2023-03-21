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
public class Operaciones {
  Nodo prinero;
  Nodo ultimo;

  public Operaciones() {
    this.prinero = null;
    this.ultimo = null;
  }
  
  public void ingresarNodo(String valor){
    
    Nodo n = new Nodo();
    n.dato = valor;
    
    if(this.prinero == null){
      this.prinero = n;
      prinero.enlace = null;
      ultimo =  prinero;
    }else{
      ultimo.enlace = n;
      n.enlace = null;
      ultimo = n;
    }
    
  }
  
 public void leer(){
    
   Nodo tem = new Nodo();
   tem = prinero;
   while(tem != null){
     System.out.println(tem.dato);
     tem = tem.enlace;
   }
  }


  
  
  
}
