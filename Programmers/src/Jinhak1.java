import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Jinhak1 {
	public int[] solution(int[] waiting) {
        int[] answer = {};

        //1. 예약 중복 인정 x, 1번 예약만, 나머지는 대기열에서 제거
        Set<Integer> reserveSet = new LinkedHashSet<Integer>();
        for (Integer person : waiting) {
			reserveSet.add(person);
		}
        
        answer = new int[reserveSet.size()];
        int idx=0;
        for (Integer integer : reserveSet) {
        	answer[idx++]=integer;
		}
        
        return answer;
    }
}
