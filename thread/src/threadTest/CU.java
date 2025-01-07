package threadTest;

public class CU {
   public static void main(String[] args) {
      ATM atm = new ATM();
      
      Thread parent = new Thread(atm, "엄마");
      Thread child = new Thread(atm, "자식👶");
      
      parent.start();
      child.start();
   
   }
}
