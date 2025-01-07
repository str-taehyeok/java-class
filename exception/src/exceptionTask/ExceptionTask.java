package exceptionTask;

import java.util.Scanner;

public class ExceptionTask {
   public static void main(String[] args) {
//      25분
//      5개의 정수만 입력받기
//      - 무한 입력 상태로 구현
//      - q 입력 시 나가기
//      - 각 정수는 배열에 담기
//      - if문은 딱 한 번만 사용하기
      Scanner sc = new Scanner(System.in);
      String expression = null;
      String message = "정수 5개를 순서대로 입력하세요"
            + "\nq버튼을 누를 시 종료됩니다.", exampleMessage = "번 째 정수";
      int count = 0;
      int[] arData = new int[5];
      
      System.out.println(message);
      while(true) {
         count++;
         System.out.println(count + exampleMessage);
         expression = sc.next();
         
         if(expression.equals("q")) 
            break;
         
         
//         alt + shift + z
         try {
        	 arData[count - 1] = Integer.parseInt(expression);
            if(count >= 5) {
               throw new ArrayIndexOutOfBoundsException();
            }
         } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5개 정수를 모두 입력했습니다.");
            for(int value:arData) {
               System.out.print(value + " ");
            }
            break;
         } catch(NumberFormatException e){
            System.out.println("정수를 입력하세요!");
            count--;
         } catch (Exception e) {
            System.out.println("알 수 없는 오류 발생!");
            e.printStackTrace();
         } //finally {
//        	 System.out.println("무조건 한 번 실행한다.");
//         }
      }
      
   }
}

