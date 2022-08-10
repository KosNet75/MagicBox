import java.util.Random;

public class MagicBox<T> {

  protected int size;
  protected T[] items;


  public MagicBox(int size) {
    this.size = size;
    items = (T[]) new Object[size];

  }

  public void pick() throws RuntimeException {
    int itemsNull = 0;                              //счетчик пустых
    /////   //for (int i = 0; i < items.length; i++) {
    /////   //   if (items[i] == null) {
    for (T item : items) {
      if (item == null) {                       // если пустая(null) то увеличивает счетчик пустых
        itemsNull++;
      }
    }
    if (itemsNull != 0) {                         // если счетчик пустых не 0, то RuntimeException+сообщение
      throw new RuntimeException("Осталось " +   // проверка исключения
          itemsNull + " пустых ячеек");
    } else {
      Random random = new Random();               // если счетчик пустых ноль(т.е. все заполненно)
      int randomInt = random.nextInt(size);        // то вывод случайной строки
      System.out.println("Случайная строка: " + items[randomInt] + "\n");
    }
  }


  public boolean add(T itemStrInt) {

    for (int i = 0; i < items.length; i++) {
      if (items[i]
          == null) {                                  // если ячейка массива=null то добавляет в нее
        items[i] = itemStrInt;
        System.out.print("добавление в Box строки: " + itemStrInt + " ");
        return true;                                     // и  возвращает true
      }
    }
    System.out.print("В коробке не осталось пустых ячеек.\n");
    System.out.print("добавление в Box строки: " + itemStrInt
        + " не добавлено  ");                                      // если не null то НЕ добавляет
    return false;                                                      // и возвращает false

  }

}
