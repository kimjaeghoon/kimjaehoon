package Day01;


public class test01 {
		//　Ｏｂｊｅｃｔ　클래스로　부터　데이터　제공　받음
				//　모든　클래스는　ｏｂｊｅｃｔ　시작된다
					//１００％　클래스　언어
	public static void main(String[] args) {
					// main 메소드 : main 스레드를 가지고 있음.
						// 스레드 : 프로세스에 코드를 읽어주는 역할
							// main {} 밖에 코드는 실행 안됨.
		// 1. 클래스의 첫글자는 대문자
		// 2. 메뉴 => run => run [Ctrl+F11]
		System.out.println("java");
			// System : 시스템 관련 [ 입출력 ] 클래스
			// . : 클래스내 멤버 접근 연산자 [ 특수기호 ]
			// out : 출력관련 스트림
			// println() : 출력메소드
			// ; : 코드한줄에 끝
		System.out.println(7);
		System.out.println("jave7");
		
		System.out.printf( "%d" , 7);
		System.out.printf( "%s" , "java");
		System.out.printf( "%s" , "java");
				// %d : 정수
				// %f : 실수
				// %s : 문자열
				// %c : 문지
		//예제4 : printf , print 차이
		System.out.println("java" +7+"입니다");
				// + 더하기 연산자 : 숫자 + 숫자 + 숫자 경우
				// + 연결 연산자 : 문자 + 숫자 경우 혹은 문자 + 문자
		System.out.printf("%s%d%s" , "java" , 7 , "입니다\n");
		// \t : 들여쓰기
		
		// 문제1 println
		// 출력 결과
		
		System.out.println("============출석부============\n");
		System.out.println("이름\t1교시\t2교시\t3교시\n");
		System.out.println("유재석\t출석\t결석\t출석\n");
		System.out.println("강호동\t결석\t결석\t출석\n");
		System.out.println("============================\n");
		

	}
}

