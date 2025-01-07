package inheritanceTest;



class AA {
   public void paint() {
      System.out.print("A");
      draw();//->this가 생략되어 있다.
   }
   public void draw() {
      System.out.print("B");
   }
}
class BB extends AA {
   public void paint() {
      super.draw();
      System.out.print("C");
      this.draw();
   }
   public void draw() {
      System.out.print("D");
   }
}

public class InheritanceTask3 {
   public static void main(String[] args) {
      BB b = new BB();
      b.paint();
      b.draw();
   }
}

