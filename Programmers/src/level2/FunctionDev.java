package level2;

import java.util.ArrayList;

//프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
//또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 
//이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
//먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 
//각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 
//몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

public class FunctionDev {
	public static void main(String[] args) {
		int progress[] = { 93, 30, 55 };
		int speeds[] = { 1, 30, 5 };
		solution(progress, speeds);
	}

	static int count = 0;
	static int days = 0;

	static public int[] solution(int[] progress, int[] speeds) {

		ArrayList<Integer> pubList = new ArrayList<Integer>();
		ArrayList<Integer> speedList = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();

		for (int i : progress) {
			pubList.add(i);
		}
		for (int i : speeds) {
			speedList.add(i);
		}

		while (true) {
			if (pubList.size() == 0) {
				break;
			}
			int temp = publish(pubList, speedList);
			if (temp != 0)
				answer.add(temp);
			count = 0;
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	static public boolean finish(int work, int speed) {
		return (work += (speed * days)) >= 100;
	}

	// 최우선 날짜가 작업완료되면 다음 날짜의 작업완료여부 체크 => 100넘으면 배포(count리턴)
	static public int publish(ArrayList<Integer> pubList, ArrayList<Integer> speedList) {
		if (pubList.size() == 0) {
			return 0;
		}
		if (finish(pubList.get(0), speedList.get(0)) == true) {
			pubList.remove(0);
			speedList.remove(0);
			count++;
			publish(pubList, speedList);
		} else {
			days++;
		}
		return count;
	}

}
