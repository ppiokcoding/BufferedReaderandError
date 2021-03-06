package BufferedReader;

//별도의 공간에 있는 클래스를 사용하겠다고 선언(가져오기)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//java.lang 패키지
// - JDK 전체 중 유일한 기본 패키지(가장 기본적 + 가장 중요한 클래스를 모아놓은 패키지)
// - java.lang 패키지는 import를 하지 않아도 자동으로 import가 된다.
// - import java.lang.String; // 정석대로는 스트링도 가져와야함 하지만 위의 이유로 이 작업이 불필요

public class BufferedReaderandError {
	
	public static void main(String[] args) throws IOException {
		
		//[BufferedReader]
		
		//콘솔입출력
		// - print(), println(), printf()
		// - read(), BufferedReader, Scanner
		
		//클래스 사용법
		// - 클래스 = 자료형
		
		//자료형 변수명;
		//int n;
		//String str;
		//BufferedReader reader;
		
		//String, BufferedReader > 클래스
		//String > 항상 접근할 수 있는 공간에 들어있는 클래스
		//BufferedReader > 따로 보관해놓은 공간에 들어있는 클래스
		
		int sum = 10 + 20;
		
		//쉐프 > 양념장 > 주변인들에게 전달
		//1. 양념장 레시피 전달 > x > 소스 자체 전달
		//2. 완성된 양념장 자체 전달 > o >  클래스 단위(컴파일 결과, *.class) 전달
		
		//클래스 > 코드의 집합 > 구현된 기능의 집합 > 개발자가 특정 기능들을 만들어 놓은 상자(클래스) 
		//	> 다른 개발자들에게 사용하라고 전달 가능!! (클래스 단위로 주고 받는다.)
		
		//현시점 > 수많은 클래스를 보유(JDK - 8천여개) > 이 둘 중 딱 1공간에 들어있는 클래스만 바로 사용이 가능하고, 
		//나머지 공간에 들어있는 클래스는 가져오는 행동이 필요하다.
		
		
		//요구사항] 문자 1개를 입력받아 그대로 출력하시오.
		//System.in.read();
		
		int n = 10;
		String str = "문자열";
		
		//System.in.read() -> 감싼 뒤 -> 개량 -> Wrapper Class
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in)); //도구 생성
		System.out.print("문자입력: ");
		int code = reader.read();
		System.out.println(code);
		System.out.printf("%c\r\n", code); //int -> code
		
		//현재 버퍼안에 \r\n가 남아있다. > 삭제!!!
		reader.readLine(); // 공회전 > \r\n를 지우기 위해서
		
		//code = reader.read();		
		//System.out.println(code);
		//System.out.printf("%c\n", code);
				
		//code = reader.read();		
		//System.out.println(code);
		//System.out.printf("%c\n", code);
		
		//가(44032) ~ 힣(55203) -> 11,172개
		
		//------------------------------------
		
		//요구사항] 사용자에게 이름(3문자)을 입력받아 인사를 하시오.
		// -> reader() x 3회
		
		System.out.print("이름 입력: ");
		
		//reader.read() > 1문자입력 > 문자코드(int) 반환
		//reader.readLine() > N문자(문자열) 입력 > 문자열(String) 반환
		//reader.readLine() > 입력 버퍼안에서 엔터값을 만나기 전까지의 문자열을 반환 + 남아있는 \r\n는 지워버린다.
		
		String name = reader.readLine();
		System.out.printf("안녕하세요. %s님. \n", name);
		
		System.out.print("나이 입력: ");
		String age = reader.readLine();
		System.out.printf("당신의 나이는 %s살이군요. \n", age);
		
		
		//======================================================================
		
		//요구사항] 숫자 2개를 입력받아 두 수의 합을 구하시오.
		
		//전체 import 단축키
		//Ctrl + Shift + o

		// 코드 조각
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 입력: ");
		String input1 = reader.readLine();

		System.out.print("숫자 입력: ");
		String input2 = reader.readLine();

		System.out.println(input1 + input2); // String + String

		// BufferedReader는 모든 입력값을 *String*으로 반환한다.
		// 입력받은 String을 원하는 다른 자료형으로 변환해야 한다.
		
		
		//유틸 클래스 사용
		//String -> int
		//String -> double
		//String -> boolean
		
		//"100" : 문자열 -> 100 : 자료형
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.println(num1 + num2);
		
		
		//"100" -> 100   : Integer.parseInt()
		//                 Byte.parseByte()
		//                 Short.parseShort()
		//                 Long.parseLong()
		//"3.14" -> 3.14 : Double.parseDouble() 
		//                 Float.parseFloat()
		//"true" -> true : Boolean.parseBoolean()
		
		
		
		//======================================================
		
		//[Error]
		/*
		  에러, Error
		 - 오류, 버그(Bug), 예외(Exception) 등...
		 
		  1. 컴파일 에러
		  - 컴파일 작업중에 발생하는 에러
		  - 컴파일러 발견 > 문법이 틀렸다!!
		  - 이클립스 편집기의 빨간줄
		  - 컴파일 작업 중단 > 번역 중단 > 프로그램 생성 불가 > 반드시 해결!!!
		  - 난이도 가장 낮음 > 발견이 쉽다 > 고치기 쉽다.
		  - 컴파일러가 친절하게 상황을 알려준다.(에러 메시지)
		  - 오타!!
		  - 해결 방법 > 에러 메시지 확인 > 수정
		  
		  
		  2. 런타임 에러
		  - 컴파일때는 발견이 안됐는데, 실행 중에 발견되는 에러
		  - 문법에는 오류가 없는데 다른원인으로 발생하는 에러
		  - 예외(Exception)
		  - 난이도 중간 > 발견 중간 > 복불복 > 테스트 발견o -> 조치o, 테스트 발견x ->조치x
		  - 런타임(=프로그램을 실행중)
		  - 지구상의 대부분 프로그램은 런타임 오류를 가지고 있다.
		  - 조치 방법 > 시간 + 돈(인력, 자동화 테스트 프로그램)
		  - 게임 출시 > RPG > 소수의 개발자 모든 기능 테스트 불가능 > 클로즈드 알파, 클로즈드 베타, 오픈 알파, 오픈 베타 > 베타 테스터 
		  > 런타임 오류 발견하는 사람들!! > 오류 발견 -> 패치, 업그레이드
		  
		  
		  3. 논리 에러
		  - 문법도 틀린곳이 없고, 실행도 잘되는데...? > 결과가 이상함;;
		  - 발견 최악, 수정 최악 > 찾기가 너무 힘듦 > 문법틀린데x, 실행o
		  - 해결 방법 > 한줄 한줄 직접 눈으로 확인
		  
		  컴파일 에러 + 런타임 에러
		  - 정리 노트 만들기
		  - 워드, 원노트, 노션, 메모장 등 꼭 정리하기
		  
		 
		 */
		
		// 사용자에게 숫자를 1개 입력 > 연산 결과 출력
		// - 컴파일O, 실행O, 테스트O > 출시!!! > 에러!!
		
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at com.test.java.Ex09_BufferedReader.main(Ex09_BufferedReader.java:135)
		
		//divide by zero
		
		//사용자가 입력하는 숫자 > 경우의 수? > 42억가지 > 그 중에 딱 1가지(0)을 입력시 에러 
		//int num = 0; //키보드 입력
		//System.out.println(100 / num);
		
		
	}//main

}
