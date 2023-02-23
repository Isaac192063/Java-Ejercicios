/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraObjeto;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Proceso {

  private Scanner sc;
  private Operaciones opera;

  public Proceso() {
    sc = new Scanner(System.in);
    opera = new Operaciones();
  }

  public void calcular() {
    boolean salir = false;
    double num;
    String tem = "";
    System.out.println("ingrese un numero");
    opera.concatenar(sc.next());
    do {
      System.out.println("ingrese operacion a relaizar");
      System.out.println("1. sumar\n2.restar\n3. multiplicar\n4.dividir\n5. moduklo\n6. exponente\n7. sen\n8. cos\n9. tangente\n10. raiz\n11. AC\n12.salir");
      System.out.print("ingrese un opción: ");
      int opc = sc.nextInt();
      if (opc > 0 && opc < 7) {
        System.out.println("ingrese numero");
        tem = sc.next();
      }
      switch (opc) {
        case 1:
          opera.sumar(tem);
          break;
        case 2:
          opera.restar(tem);
          break;
        case 3:
          opera.multiplicar(tem);
          break;
        case 4:
          opera.dividir(tem);
          break;
        case 5:
          opera.modulo(tem);
          break;
        case 6:
          opera.exponente(tem);
          break;
        case 7:
          opera.sen();
          break;
        case 8:
          opera.cos();
          break;
        case 9:
          opera.tan();
          break;
        case 10:
          opera.raiz();
          break;
        case 11:
          opera.setResultado("");
          System.out.println("ingrese un numero");
          opera.concatenar(sc.next());
          break;
        default:
          salir = true;
      }
      System.out.println("----------------------------------------------");
      System.out.println(opera.getResultado() + "\n");

    } while (salir == false);

  }
}
