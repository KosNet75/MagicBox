public class MagicBox {

  protected String value; // заводим переменную value стринговую

  public void save(String value){    // метод сохранения, получаем значение стринг на входе, ничего не отдает(сохраняет)
   this.value = value;
  }

public String getLast(){  // ничего не принимает в параметрах, а просто возвращает последнее запомненное значение

  return value; // возвращает последнее запомненное значение value
}


}
