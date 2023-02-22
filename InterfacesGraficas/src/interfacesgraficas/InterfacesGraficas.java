/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesgraficas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class InterfacesGraficas {

  public static void main(String[] args) {

    int b = 0, opc;
    float n1 = 0, n2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("-----------calculadora------------");
    while (b == 0) {

      System.out.println("ingrese operacion a relaizar");
      System.out.println("1. sumar\n2.restar\n3. multiplicar\n4.dividir\n5. moduklo\n6. raiz\n7. sen\n8. cos\n9. tangente\n10. exponente\n11.salir");
      System.out.print("ingrese un opción: ");
      opc = sc.nextInt();

      if (opc < 10) {
        System.out.println("ingrese primer numero");
        n1 = sc.nextFloat();
        if (opc == 1 || opc == 2 || opc == 3 || opc == 4 || opc == 5) {
          System.out.println("ingrese segundo numero");
          n2 = sc.nextFloat();
        }
      } else if (opc == 10) {
        System.out.println("ingrese base ");
        n1 = sc.nextFloat();
        System.out.println("ingrese expoenete");
        n2 = sc.nextFloat();
      }
      Operaciones opera = new Operaciones(n1, n2);
      switch (opc) {
        case 1:
          System.out.println(opera.sumar());
          break;
        case 2:
          System.out.println(opera.restar());
          break;
        case 3:
          System.out.println(opera.multiplicar());
          break;
        case 4:
          System.out.println(opera.dividir());
          break;
        case 5:
          System.out.println(opera.modulo());
          break;
        case 6:
          System.out.println(opera.raiz());
          break;
        case 7:
          System.out.println(opera.sin());
          break;
        case 8:
          System.out.println(opera.cos());
          break;
        case 9:
          System.out.println(opera.tan());
          break;
        case 10:
          System.out.println(opera.exp());
          break;
        default:
          b = 1;
      }
      System.out.println("_____________________________________");
      System.out.println("");
    }

  }
}
