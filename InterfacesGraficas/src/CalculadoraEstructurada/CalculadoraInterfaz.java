
package interfacesgraficas;

import java.util.Scanner;

public class CalculadoraInterfaz {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean salir = false;
    String resultado = "", tem = "";
    double radian;
    System.out.println("ingrese el primer numero");
    tem = sc.next();
    resultado += tem;
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
          resultado = String.valueOf((Double.parseDouble(resultado) + Double.parseDouble(tem)));
          break;
        case 2:
          resultado = String.valueOf((Double.parseDouble(resultado) - Double.parseDouble(tem)));
          break;
        case 3:
          resultado = String.valueOf((Double.parseDouble(resultado) * Double.parseDouble(tem)));
          break;
        case 4:
          resultado = String.valueOf((Double.parseDouble(resultado) / Double.parseDouble(tem)));
          break;
        case 5:
          resultado = String.valueOf((Double.parseDouble(resultado) % Double.parseDouble(tem)));
          break;
        case 6:
          resultado = String.valueOf(Math.pow(Double.parseDouble(resultado), Double.parseDouble(tem)));
          break;
        case 7:
          radian = Math.toRadians(Double.parseDouble(resultado));
          resultado = String.valueOf(Math.sin(radian));
          break;
        case 8:
          radian = Math.toRadians(Double.parseDouble(resultado));
          resultado = String.valueOf(Math.cos(radian));
          break;
        case 9:
          radian = Math.toRadians(Double.parseDouble(resultado));
          resultado = String.valueOf(Math.tan(radian));
          break;
        case 10:
          radian = Math.toRadians(Double.parseDouble(resultado));
          resultado = String.valueOf(Math.sqrt(radian));
          break;
        case 11:
          resultado = "";
          System.out.println("ingrese el primer numero");
          tem = sc.next();
          resultado += tem;
          break;
        default:
          salir = true;
      }
      System.out.println("----------------------------------------------");
      System.out.println(resultado + "\n");

    } while (salir == false);
  }
}
