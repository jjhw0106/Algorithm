package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
	public int[] solution(int[] answers) {
        int[] answer = {};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] cnt = {0,0,0};
        for(int i=0; i<answers.length;i++) {
        	if(p1[i%5]==answers[i]) {
        		cnt[0]++;
        	}
        	if(p2[i%8]==answers[i]) {
        		cnt[1]++;
        	}
        	if(p3[i%10]==answers[i]) {
        		cnt[2]++;
        	}
        }
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<cnt.length;i++) {
        	if(cnt[i] == max) {
        		list.add(i);
        	}
		}
        
        answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i)+1;
		}
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
