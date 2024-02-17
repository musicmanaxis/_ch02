public class Ex2_12 {
	//형변환..아래것은 외우던지 찾아 쓸 수 있게 하자 
	public static void main(String[] args) {
		String str="3";
		
		System.out.println(+str.charAt(0)-'0');
		//문자열을 문자 3로 변환->str.charAt(0)  후 문자로 빼
		System.out.println('3'-'0'+1);  //문자를 숫자로 바꾸고 난 다음 숫자더하기 
		//문자3을 정수3으로 변환할려면 (-'0')을  해주면 된다.		
		System.out.println(Integer.parseInt("3")+1);  
		//Integer.parseInt("3") 문자열을 정수
		System.out.println("3"+1);
		//문자열 + 숫자는 문자열 
		System.out.println(3+'0');
		//문자+숫자는 숫자의 결과가 나온다 0은 숫자로 48에 해당
		System.out.println((char)(3+'0'));
		//문자로 형변환 .3을 문자로 올바르게 표기하기 위

	}

}
