package hashmaps;

public class Example {

  public static void main(String[] args) {
    Implementation myHashMap = new Implementation(50);
    myHashMap.set("apples", 1000);
    myHashMap.set("oranges", 250);
    myHashMap.set(1, "watermelon");
    myHashMap.set("pineapple", 144);
    System.out.println(myHashMap.get("apples"));
    System.out.println(myHashMap.get("oranges"));
    System.out.println(myHashMap.get(1));
    System.out.println(myHashMap.get("pineapple"));
    System.out.println((myHashMap.keys()));
  }
}
