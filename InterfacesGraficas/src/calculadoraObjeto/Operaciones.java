/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraObjeto;

/**
 *
 * @author ASUS
 */
public class Operaciones {

  private String resultado;

  public Operaciones() {
    this.resultado = "";
  }

  public void concatenar(String cad) {
    this.resultado += cad;
  }

  public void sumar(String cad) {
    this.resultado = String.valueOf(Double.parseDouble(this.resultado) + Double.parseDouble(cad));
  }

  public void restar(String cad) {
    this.resultado = String.valueOf(Double.parseDouble(this.resultado) - Double.parseDouble(cad));
  }

  public void multiplicar(String cad) {
    this.resultado = String.valueOf(Double.parseDouble(this.resultado) * Double.parseDouble(cad));
  }
  public void modulo(String cad){
    this.resultado = String.valueOf(Double.parseDouble(this.resultado) % Double.parseDouble(cad));
  }

  public void dividir(String cad) {
    this.resultado = String.valueOf(Double.parseDouble(this.resultado) / Double.parseDouble(cad));
  }

  public void sen() {
    double radian = Math.toRadians(Double.parseDouble(resultado));
    this.resultado = String.valueOf(Math.sin(radian));
  }

  public void cos() {
    double radian = Math.toRadians(Double.parseDouble(resultado));
    this.resultado = String.valueOf(Math.cos(radian));
  }

  public void tan() {
    double radian = Math.toRadians(Double.parseDouble(resultado));
    this.resultado = String.valueOf(Math.tan(radian));
  }

  public void raiz() {
    double radian = Math.toRadians(Double.parseDouble(resultado));
    this.resultado = String.valueOf(Math.sqrt(radian));
  }

  public void exponente(String cad) {
    this.resultado = String.valueOf(Math.pow(Double.parseDouble(this.resultado), Double.parseDouble(cad)));
  }

  public String getResultado() {
    return resultado;
  }
  public void setResultado(String resultado){
    this.resultado = resultado;
  }
}
