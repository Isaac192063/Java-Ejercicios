/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesgraficas;

/**
 *
 * @author ASUS
 */
public class Operaciones {
  private float a,b;

  public Operaciones(float a, float b) {
    this.a = a;
    this.b = b;
  }
  public float sumar(){
    return a+b;
  }
  public float restar(){
    return a-b;
  }
  public float dividir(){
    return a/b;
  }
  public float multiplicar(){
    return a*b;
  }
  public float raiz(){
    return (float) Math.sqrt(a);
  }
  public float sin(){
    return (float) Math.sin(a);
  }
  public float modulo(){
    return a%b;
  }
  public float cos(){
    return (float) Math.cos(a);
  }
  public float tan(){
    return (float) Math.tan(a);
  }
  public float exp(){
    return (float )Math.pow(a, b);
  }
}
