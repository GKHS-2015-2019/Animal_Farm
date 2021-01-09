public class Tester
{
  public static void main(String[] args){
      Cow c = new Cow();
      System.out.println(c.toString());
      NamedCow n = new NamedCow("Bessie");
      System.out.println(n);
      Pig p = new Pig(false);
      System.out.println(p);
      Pig p2 = new Pig(true);
      System.out.println(p2);
      
      
      Horse h = new Horse("Rainbow");
      h.mount("Bubba");
      System.out.println(h);
    }
}
