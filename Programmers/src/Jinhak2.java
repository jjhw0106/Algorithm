import java.util.Arrays;
import java.util.Stack;

public class Jinhak2 {
	public static int n;
    public static int[][] dp;
    public static int[] arr;
    
	public static int solution(String s) {
		dp = new int[n+1][n+1];
        arr = new int[n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int res = dp(0,n-1);
        System.out.println(res);
    }
	
	public static int dp(int left, int right){
        if(left>=right) 
        	return 0;
        // 이미 찾은 값이면, 반환
        if(dp[left][right]!=-1)
        	return dp[left][right];
        int min =0;
        // 팰린드롬 상태면, 양쪽 한칸씩 땡김
        if(arr[left]==arr[right])
            min =dp(left+1,right-1);
        // 아니면, 왼쪽에 삽입하는 경우와 오른쪽에 삽입하는 경우를 순회후 비교
        else 
            min = Math.min(dp(left+1,right)+1 ,dp(left,right-1)+1);     
        return dp[left][right]=min;
    }
}
//	 public int solution(String plain) {
//	        int answer = 0;
//	        Stack<Character> store = new Stack<Character>();
//	        // 1. 앞에서 부터 문자 자르기
//	        // -> stack에 담기 (역순)
//	        // 2. 자르고 남아있는 문자가 팰린드롬일 경우 stack에 있는 문자 뒤에 붙이기
//	        String tempPlain = plain;
//	        while(!checkPd(tempPlain,0,tempPlain.length()-1)) {
//	        	store.add(tempPlain.charAt(0));
//	        	tempPlain = tempPlain.substring(1);
//	        }
//	        
////	        for (Character character : store) {
////				plain+=character;
////			}
//	        while(!store.isEmpty()){
//	        	plain+=store.pop();
//	        }
//	        
//	        answer = plain.length();
//	        return answer;
//	    }
//	 
//	 public boolean checkPd(String remain,int start, int end) {
//		 boolean check=true;
//		 
//		 if(start>=end) {return true;}
//		 
//		 if(remain.charAt(start)!=remain.charAt(end)) {
//			 return false;
//		 }
//		 
//		 return checkPd(remain, start+1, end-1);
//	 }
//}
