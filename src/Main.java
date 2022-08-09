public class Main {

  public static void main(String[] args) {

    MagicBox magicBox = new MagicBox();


    magicBox.save("какая то фигня");
    magicBox.save("то о чем давно забыли");
    magicBox.save("никто не знает что это");
    magicBox.save("непонятная хреновина");

// T[] items = (T[]) new Object[РАЗМЕР];
System.out.println(magicBox.getLast());


  }



}
