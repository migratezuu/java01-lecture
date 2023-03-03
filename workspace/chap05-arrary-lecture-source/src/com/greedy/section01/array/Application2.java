package com.greedy.section01.array;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*배열의 사용 방법
		 * 
		 * 배열의 선언
		 * 자료형 [ ]  변수명;   // 이 방식을 권장함.
		 * 자료형 변수명[];
		 * 로 선언할 수 있다.
		 * */
		
		/*선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것.*/
		int[] iarr;
		char carr[];
		
		/*선언한 래퍼런스 변수에 배열을 할당해서 주소값을 대입할 수 있다.
		 *new 연산자는 heap 메모리영역에 공간을 생성하고 시작 위치의 주소값을 반환하는 연산자이다.
		 *발생한 주소를 래퍼런스 변수 (참조형 변수)에 저장하고,
		 *이것을 참조하여 사용하기 때문에 참조자료형 (reference type)이라고한다.
		 * */
	//	System.err.println();
		
	//	iarr = new int[]; //크기를 지정하지 않아서 에러 발생
		iarr = new int[5];
		carr = new char[10];
		
		/*선언과 할당을 동시에 할 수도 있다.*/
		int[] iarr2 = new int[5];
		char carr2[] = new char[10];
		
		System.out.println("iarr : " + iarr); //16진수로 반환
		System.out.println("carr : " + carr);
		
		System.out.println("iarr의 hashcode : " + iarr.hashCode()); //10진수로 반환(주소값)
		System.out.println("carr의 hashcode : " + carr.hashCode());
		
		System.out.println("iarr의 length : " + iarr.length); //length는 변수, 배열의 길이 반환 -> 괄호를 안붙임
		System.out.println("carr의 length : " + carr.length); 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당할 배열의 길이를 입력해주세요 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr의 hashcode : " + darr.hashCode());
		System.out.println("darr의 length : " + darr.length); //배열의 크기는 음수 설정 안돼~
		
		/* 한 번 배열의 크기를 할당하면 변경하지 못함(수정금지).*/
		darr = new double[30]; //배열을 새로 덮어씀 => 강제로 수정하는 행위
		
		System.out.println("darr hashcode : " + darr.hashCode());
		System.out.println("darr length : "+ darr.length);
		
		/*한 번 할당된 배열은 지울 수 없다.
		 * 다만 래퍼런스 변수를 null로 변경하면 더 이상 주소를 참조할 수 없게된 배열은
		 * 일정 시간이 지난 후 heap의 old영역으로 이동하여 GC(가비지컬렉터)가 삭제시킨다.
		 * 한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조가 불가능하다.*/
		darr =  null; //더이상 참조할 수 없게 만드는 것
		
		/*NullPointerException 발생함
		 * 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있는 경우
		 * 참조연산자를 사용하게 되면 발생하게 되는 에러이다.*/
		
		
		if(darr != null) {
		System.out.println("삭제 후 darr의 길이 : " + darr.length);
		}
		
	}
}















