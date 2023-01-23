public class TestMyArrayList
{
  public static void main(String[] args)
  {
    MyList<String> list = new MyArrayList<>();


    list.add("America");
    System.out.println("1" + list);

    list.add(0, "Canada");
    System.out.println("(2) " + list);
  }
}
