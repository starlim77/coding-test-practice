
package level01;

public class ReverseNumber {
	/*
	 문제 설명
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

	제한 조건
	n은 10,000,000,000이하인 자연수입니다.

	입출력 예
	n	  	return
	12345	[5,4,3,2,1]
	 */
	
	public int[] solution(long n) {
		int count = 0;
		long num = n; // n 값을 이용하기 전 다른 지역 변수에 저장해둔다.
		while(n>0) { // n 값의 자릿수 계산
			n=n/10;
			count+=1;
		}
		
		int[] answer = new int[count]; //자릿수 만큼 배열 크기 지정
		count=0;
		while(num>0) {// num == n 값을 배열에 집어 넣어준다.
			answer[count]=(int)(num%10);
			num=num/10;
			count+=1;
		}
		return answer;
	}
	
	/* 다른 사람의 풀이
	class Solution {
		  public int[] solution(long n) {
		      String a = "" + n; // 문자열로 만들어서 n의 자릿수 계산
		        int[] answer = new int[a.length()];
		        int cnt=0;

		        while(n>0) {//
		            answer[cnt]=(int)(n%10);
		            n/=10;
		            cnt++;
		        }
		      return answer;
		  }
		}
	 */
	
		
	public static void main(String[] args) {
		
	}

}
