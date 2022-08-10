
import java.util.Random;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Random random = new Random();



    MagicBox<String> magicBoxStr = new MagicBox<>(3);
//
//
    System.out.println(magicBoxStr.add("         венец творения, "));
    System.out.println(magicBoxStr.add("      бывает страшен он, "));
    System.out.println(magicBoxStr.add(" когда впадает в ярость, "));
    System.out.println(magicBoxStr.add(" любого зверя превзойдет. "));



    magicBoxStr.pick();

   MagicBox<Integer> magicBoxInt = new MagicBox<>(4);

     System.out.println(magicBoxInt.add(3));
     System.out.println(magicBoxInt.add(2));
     System.out.println(magicBoxInt.add(1));
//     System.out.println(magicBoxInt.add(0));
       magicBoxInt.pick();



  }
}
