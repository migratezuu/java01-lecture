package com.greedy.section02.string;

public class Application {

	public static void main(String[] args) {

		/* String 클래스의 자주 사용하는 메소드 */

		/* charAt() : 해당 문자열의 틀정 인덱스에 해당하는 문자를 반환한다.
		 * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는 StringIndexOutOfBonusException이 발생한다.*/

		String str1 = "apple";

		for(int i = 0; i < str1.length(); i++) {
			System.out.println("charAt(" + i +") : " + str1.charAt(i));
		}

		/* compareTo(): 인자로 전달된 문자열과 사전 순으로 비교를 하여 
		 * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를, 
		 * 크면 양수를 반환한다.
		 * 단, 이 메소드는 대소문자를 구분하여 비교한다.*/

		String str2 = "java";
		String str3 = "java";
		String str4 = "JAVA";
		String str5 = "oracle";

		System.out.println("compareTo(): " + (str2.compareTo(str3)));

		System.out.println("compareTo() : " + (str2.compareTo(str4)));
		System.out.println("compareTo() : " + (str4.compareTo(str2)));


		System.out.println("compareTo() : " + (str2.compareTo(str5)));

		/* compareToIgnoreCase() : 대소문자를 구분하지 않고 비교한다. */
		System.out.println("compareToIgnoreCase() : " + str3.compareToIgnoreCase(str4));

		/* concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.*/
		/* 원본 문자열에는 영향을 주지 않는다. */
		System.out.println("concat() : " + (str2.concat(str5)));
		System.out.println(str2);

		//		str2 += "oracle";
		//		System.out.println(str2);

		/* indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치의 정수를 반환한다. 
		 * 단, 일치하는 문자가 없는 경우 -1을 반환한다. */

		String indexOf = "java oracle";
		//		System.out.println("indexOf('a') : " + indexOf.indexOf('a'));
		//		System.out.println("indextOf('z') : " + indexOf.indexOf('z'));	 //-1로 반환 (없거든..)
		//		
		//		String fileName = "photo.png";
		//		String ext = "";
		//		
		//		if(fileName.indexOf('.') > 0) {
		//			System.out.println("파일의 확장자가 있습니다.");
		//			ext = fileName.substring(fileName.indexOf('.'));
		//		}else {
		//			System.out.println("파일의 확장자가 없습니다.");
		//		}
		//		System.out.println(ext);

		/* lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스 번호를 반환한다. 
		 * 단, 일치하는 문자가 없는 경우 -1을 반환한다. */
		System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a'));
		System.out.println("lastIndexOf('z') : " + indexOf.lastIndexOf('z'));

		/* trim() : 문자열의 앞 뒤에 공백을 제거한 새로운 문자열을 반환한다.
		 * 원본에 영향을 주지 않는다. */
		String trimstr = "   java  ";
		System.out.println("trimStr : #" + trimstr + "#");
		System.out.println("trim() : #" + trimstr.trim() +"#");

		/* toLowerCase() : 모든 문자를 소문자로 변환시킨다.
		 * toUpperCase() : 모든 문자를 대문자로 변환시킨다. */

		String caseStr = "JavaOracle";

		System.out.println("toLowerCase() : " + caseStr.toLowerCase());
		System.out.println("toUpperCase() : " + caseStr.toUpperCase());

//		String isY = "Y";
//		System.out.println(isY.equals("Y") || isY.equals("y"));  //대문자 Y이거나 소문자y이면 true변환
//		System.out.println(isY.toUpperCase().equals("Y"));

		String s1 = "java";
		String s2 = null;

//		System.out.println(s1.equals(s2));
//		System.out.println(s2.equals(s1));

		System.out.println(s1.equals("java"));
//		System.out.println(s2.equals("java"));
		System.out.println("java".equals(s2)); //null exception을 발생 안함
	
		
		/* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다. 
		 * 원본문자열에는 영향을 주지 않는다.  */
		String javaoracle = "javaoracle";
		System.out.println("replace() : " + javaoracle.replace("java", "python"));
		System.out.println("javaoracle : " + javaoracle);
		
		String badFileName = "../photo.png";
		System.out.println(badFileName.replaceAll("../",""));
		
		
		/* substring() : 문자열의 일부분을 잘라내서 새로운 문자열을 반환한다. 
		 * 원본에 영향을 주지 않는다. 
		 * */
		System.out.println("substring(3, 6) : " + javaoracle.substring(3, 6)); //3번부터 6번 전까지
		System.out.println("substring(3) : " + javaoracle.substring(3)); //3부터 끝까지
		System.out.println("javaoracle : " + javaoracle);
	
		
		/* length() : 문자열의 길이를 정수형으로 반환한다. */
		System.out.println("length() : " + javaoracle.length());
		System.out.println("빈 문자열의 길이 " + ("".length()));
		
		/* isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환 
		 * 길이가 0인 문자열은 null과는 다르다. */
		System.out.println("isEmpty() : " + "".isEmpty());
		System.out.println("isEmpty() : " + "abc".isEmpty());
		
//		String checkBlank = null;
//		System.out.println(checkBlank != null && checkBlank.isEmpty());

		
		
		
		
	}
}
