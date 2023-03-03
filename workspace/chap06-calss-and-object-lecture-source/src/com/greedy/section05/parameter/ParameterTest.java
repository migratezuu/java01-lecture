package com.greedy.section05.parameter;

public class ParameterTest {

   public void primitiveTypeParameter(int num) {
      
      System.out.println("매개변수로 전달받은 값 : " + num);
   }
   
   public void primitiveTypeArrayParameter(int[] iarr) { // 배열의 주소값이 전달됨
      System.out.println("매개변수로 전달받은 값 : " + iarr);
      
      for (int i = 0; i < iarr.length; i++) {
         System.out.print(iarr[i] + " ");
      }
      System.out.println();
      
      iarr[0] = 99;
      
      for (int i = 0; i < iarr.length; i++) {
         System.out.print(iarr[i] + " ");
      }
      System.out.println();
   }
   
   public void classTypeParameter(RectAngle rectAngle) {
      System.out.println("매개변수로 전달받은 값 : " + rectAngle);

      System.out.println("사각형의 넓이와 둘레 ====================================");
      rectAngle.calcArea();
      rectAngle.calcRount();
      
      rectAngle.setWidth(10);
      rectAngle.setHeight(10);
      
      System.out.println("변경 후 사각형의 넓이와 둘레 ==============================");
      rectAngle.calcArea();
      rectAngle.calcRount();
   }
   
   public void variableLengthArrayParameter(String name, String...hobby) { // 뒤에 전달하는 변수가 몇개인지 모를 때
      
      System.out.println("이름 : " + name);
      System.out.println("취미 : " + hobby);
      System.out.println("취미의 개수 : " + hobby.length);
      
      for(int i = 0; i < hobby.length; i++) {
         System.out.print(hobby[i] + " ");
      }
      System.out.println();
    }
   
//   public void variableLengthArrayParameter(String...hobby) {
//      
//   } 오버로딩 문법상 맞지만 호출이 불가능한 메소드
   
}