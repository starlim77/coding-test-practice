package level01;

public class AddDigits {

	public int solution(int n) {
		
		int answer=0;
		int digits=0;
		String a = Integer.toString(n);
		for(int i=0; i<a.length(); i++) {
			digits = a.charAt(i)-48; // 숫자 0~9의 ASKII 코드 값은 48~57
			answer += digits;  //각 자릿수의 숫자 값을 answer에 더해준다.
		}
		return answer;
		/* 다른 사람의 풀이  -  형 변환을 하지 않고 풀 수있는 방법.
		int answer = 0;
		while(n<10){
			answer += n%10;  // 10으로 나눈 나머지 값을 더해준다.
			n = n/10;		 // 일의 자리 값을 answer에 더해줬으므로 10으로 나눠서 일의 자리를 없애준다.
		}
		 */
		
	}
/*
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddDigits addDigits = new AddDigits();
		int n = 123;
		System.out.print(addDigits.solution(n));
		
	}

}
