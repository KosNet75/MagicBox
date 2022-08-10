
public class Main {

  public static void main(String[] args) {

    MagicBox<String> magicBoxStr = new MagicBox<>(3);

    System.out.println(magicBoxStr.add("Если б мишки были пчёлами,"));
    System.out.println(magicBoxStr.add("        То они бы нипочём "));
    System.out.println(magicBoxStr.add("    Никогда и не подумали "));
    System.out.println(magicBoxStr.add("   Так высóко строить дом;"));

    magicBoxStr.pick();

    MagicBox<Integer> magicBoxInt = new MagicBox<>(4);

    System.out.println(magicBoxInt.add(3));
    System.out.println(magicBoxInt.add(2));
    System.out.println(magicBoxInt.add(1));
//     System.out.println(magicBoxInt.add(0));
    magicBoxInt.pick();


  }
}
