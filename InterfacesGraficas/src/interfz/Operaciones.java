/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfz;

/**
 *
 * @author ASUS
 */
public class Operaciones {
  
  private String cadena;
  private double resultado;
  private boolean suma;
  private boolean resta;
  private boolean multiplicacion;
  private boolean division;
  private boolean raiz;
  private boolean seno;
  private boolean cos;
  private boolean tan;
  private boolean cot;
  private boolean alCuadrado;
  private boolean potencia;
  public int a=0;
  public Operaciones() {
    cadena = "";
    suma = false;
    resta = false;
    multiplicacion = false;
    division = false;
    raiz = false;
    seno = false;
    cos = false;
    cot = false;
    tan = false;
    alCuadrado = false;
    potencia = false;
  }
  
  public String concatenaminetp(String cadena) {
    this.cadena = this.cadena + cadena;
    if (a>0){
      this.cadena = "";
    }
    a =0;
    return this.cadena;
  }
  
  public void suma(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    suma = true;
    this.cadena = "";
  }
  
  public void resta(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    resta = true;
    this.cadena = "";
  }
  
  public void cerrar(){
    this.a++;
  }
  public void multiplicacion(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    multiplicacion = true;
    this.cadena = "";
  }
  
  public void division(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    division = true;
    this.cadena = "";
  }
  
  public void raiz(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    raiz = true;
    this.cadena = "";
  }
  
  public void seno(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    seno = true;
    this.cadena = "";
  }
  
  public void cos(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    cos = true;
    this.cadena = "";
  }
  
  public void tan(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    tan = true;
    this.cadena = "";
  }
  
  public void cot(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    cot = true;
    this.cadena = "";
  }
  
  public void alCuadrado(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    alCuadrado = true;
    this.cadena = "";
  }
  
  public void potencia(String cadena) {
    this.resultado = Double.parseDouble(cadena);
    potencia = true;
    this.cadena = "";
  }

  ////////////////////////////////////////////////////////////////////////////
  public double resultado(String numero) {
    if (suma == true) {
      resultado = resultado + Double.parseDouble(numero);
    } else if (resta == true) {
      resultado = resultado - Double.parseDouble(numero);
      
    } else if (multiplicacion == true) {
      resultado = resultado * Double.parseDouble(numero);
      
    } else if (division == true) {
      resultado = resultado / Double.parseDouble(numero);
      
    } else if (raiz == true) {
      resultado = Math.sqrt(Double.parseDouble(numero));
      
    }else if (seno == true) {
      double seno = Math.toRadians(resultado);
      resultado = Math.sin(seno);

    }else if (cos == true) {
      double cos = Math.toRadians(resultado);
      resultado = Math.cos(cos);

    }else if (tan == true) {
      double tan = Math.toRadians(resultado);
      resultado = Math.tan(tan);

    }else if (cot == true) {
      double cot = Math.toRadians(resultado);
      resultado = 1/Math.tan(cot);

    }else if (alCuadrado == true) {
      resultado = Math.pow(resultado, 2);

    }else if (potencia == true) {
      
      resultado = Math.pow(resultado, Double.parseDouble(numero));

    }
    
    cadena = "";
    suma = false;
    resta = false;
    multiplicacion = false;
    division = false;
    raiz = false;
    seno = false;
    cos = false;
    cot = false;
    tan = false;
    alCuadrado = false;
    potencia = false;
    
    
    return resultado;
    
  }
  
}
